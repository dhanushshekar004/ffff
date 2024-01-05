package Repository;

import org.apache.xmlbeans.impl.xpath.XPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {
	WebDriver driver;
	public Signin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
		@FindBy(xpath = "//input[@placeholder='Enter your email']")
		public
		WebElement emailID;
		@FindBy(xpath = "//input[@placeholder=\"Enter your password\"]")
		public
		WebElement password;
		@FindBy(xpath = "//button[text()='Sign in']")
		public
		WebElement signin;


//*******************************WELCOME PAGE*********************************************************************************

@FindBy(xpath = "//div[@class=\"colorHeaderRed\"]//following::p[text()='License Expired!']//following::p")
public WebElement verifytext;


@FindBy(xpath = "(//*[@id=\"change_circle_black_24dp\"])[2]")
public WebElement changelic;









}