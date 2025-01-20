package pageObjects;


import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.DriverFactory;

public class Inventory_Main_Page extends DriverFactory {

	public Inventory_Main_Page(){
	}


	WebDriverWait wait = new WebDriverWait(driver, 10);
	


	public void clickAddButton() throws Exception {
        WebElement body = driver.findElement(By.tagName("body"));
        body.sendKeys(Keys.PAGE_DOWN);
		WebElement btnItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@title,'INNER')]")));
        btnItem.click();
	}
    public void searchItem(String search) throws Exception {
        WebElement fieldSearch = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='twotabsearchtextbox']")));
        fieldSearch.sendKeys(search);
        fieldSearch.sendKeys(Keys.ENTER);
    }

	public void visibilityOfYellowBadgeCounter() {
		WebElement YellowBadgeCounter = driver.findElement(By.xpath("//h1[contains(text(),'Added to cart')]"));
		try {assertTrue(YellowBadgeCounter.isDisplayed());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
        String NumberOfItems = driver.findElement(By.xpath("//span[@id='nav-cart-count']")).getText();
        System.out.println("Number of items in the cart is/are "+NumberOfItems);
	}

	public void selectItems(int n) {
		for(int i=1; i <= n; i++) {
			String xpath = String.format(".//div['%s']//div[3]//button[contains(@class, 'btn_primary btn_inventory')]", n);
			WebElement buttonAdd = driver.findElement(By.xpath(xpath));
			buttonAdd.click();
		} 
	}

	public void clickOnCart() {
		WebElement cart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Add to cart')]/.."))) ;
		cart.click();
	}
	public void addItemInCartByName(String ItemName) {
		String xpath = String.format("//div[contains(., '%s')]/parent::a/parent::div/following-sibling::div/button", ItemName);
		WebElement itemElement = driver.findElement(By.xpath(xpath));
		itemElement.click();
	}

}

