package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class element {
	WebDriver driver;
	@FindBy(xpath="//input[contains(@name,'username')]") WebElement username;
	@FindBy(xpath = "//input[contains(@name,'password')]") WebElement password;
	@FindBy(xpath = "//button[contains(@class,'oxd-button')]") WebElement button;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li") WebElement logoutMenu;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a") WebElement logoutbtn;
	@FindBy(xpath = "//button[contains(@title,'eave ist')]") WebElement leavelist;
	@FindBy(xpath = "//div[contains(@class,'oxd-table-cell oxd-padding-cell')][3]//following::div[1]") WebElement name;
	@FindBy(xpath = "//*[contains(@class,'oxd-table-cell')]//following::button[1]") WebElement canMen;
	@FindBy(xpath = "//ul[contains(@class,'oxd-dropdown-menu')]//following::li[4]") WebElement cancel;
	public void logindata(String s,String p) {

		username.sendKeys(s);
		password.sendKeys(p);
	}

	public void loginbtn() {
		button.click();
	}
	public void logout() throws InterruptedException {
		logoutMenu.click();
		Thread.sleep(1000);
		logoutbtn.click();
	}
	public void llist(){
	 leavelist.click();
	}
	public String namell(){

		return name.getText();
	}
	public void cancelM() throws InterruptedException {
		canMen.click();
		Thread.sleep(2000);
		cancel.click();
	}
}
