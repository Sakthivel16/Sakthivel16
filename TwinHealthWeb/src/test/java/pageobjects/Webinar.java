package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Webinar 
{
	
	public Webinar(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css ="input[class='bannerforms']")
	private WebElement Username; 
	
	@FindBy(css ="input[class='marginTopText bannerforms']")
	private WebElement mobileNum;
	
	@FindBy(css ="button[class='bannerformbtns1']")
	private WebElement RegisterBtn;
	
	@FindBy(css ="input[type='text']")
	private WebElement EmailAddress;
	
	@FindBy(css ="select[name='Session']")
	private WebElement ChooseOnlineSession;
	
	@FindBy(css ="button[type='submit']")
	private WebElement confirm;
	
	
	
	public void enterName(String name)
	{
		Username.sendKeys(name);
	}
	
	public void enterMobileNum(String mobilenumber)
	{
		mobileNum.sendKeys(mobilenumber);
	}
	
	public void clickRegisterButton()
	{
		RegisterBtn.click();
	}
	
	public void enterEmail(String email)
	{
		EmailAddress.sendKeys(email);
	}
	
	public void chooseOnlineSession(String session)
	{
	   Select date = new Select(ChooseOnlineSession);
	   date.selectByIndex(2);
	}
	
	public void ConfirmButton()
	{
		confirm.click();
	}
	
	
	

}
