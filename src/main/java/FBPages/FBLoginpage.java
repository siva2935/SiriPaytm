package FBPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class FBLoginpage extends BaseClass{
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement EmailAddress;
	@FindBy(xpath="//*[@id=\"pass\"]")
	WebElement Password;
	@FindBy(xpath="//button[@name=\"login\"]")
	WebElement Loginbutton;
	
	public FBLoginpage() {
		PageFactory.initElements(driver, this);
	}
	
	public FBLoginpage fblogintest2(String unmae, String pwd) {
		EmailAddress.sendKeys(unmae);
		Password.sendKeys(pwd);
		Loginbutton.click();
		return new FBLoginpage();
	}

}

/*
 * Page Factory is a class provided by Selenium WebDriver to support Page Object Design patterns. 
 * In Page Factory, testers use @FindBy annotation. The initElements method is used to initialize web elements.
 * @FindBy: An annotation used in Page Factory to locate and declare web elements using different locators.
 */
