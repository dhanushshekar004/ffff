package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base   {
	public static WebDriver driver;
	static String filepath="C:\\Users\\Dhanush S\\Desktop\\new\\FireFlink\\src\\main\\java\\testdata.properties";
	
	public static void openBrowser() throws IOException {
		Properties prop=new Properties();
		FileInputStream ips=new FileInputStream(filepath);
		prop.load(ips);
		String browsername = prop.getProperty("browserName");
		 String url = prop.getProperty("URL");
		 
		 System.out.println(url);
	 String username = prop.getProperty("username");
		 
		 System.out.println(username);
		if (browsername.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get(url);
			
		}
		
		
	}
//***********************************to ioen browser and navigate to url****************************************************
	public static void closeBrowser()
	{
		driver.quit();
	}
	//********************************to close browser*********************************************************************
	
	public static void clickOnElement(WebElement element) {
		element.click();
		
	}
		//*************************to click on element****************************************************************************
	public static void enterinputintoelemnt(WebElement element,String input) {
		
		element.sendKeys(input);
		
	}
	//************************to enter input into element*********************************************************************
	
	public  boolean verifytextIsPresent(WebElement element)
	{
		boolean isDisplayed ;
		try {
			element.isDisplayed();
			 isDisplayed = true;
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			isDisplayed =false;
		}
		return isDisplayed;
		
	}

//**************************************************************************************************************************************
	public void moveMouseOnElement(WebElement element) {
		Actions Action=new Actions(driver);
		Action.moveToElement(element);
		Action.build().perform();
	}
	}
	
	
//**************************************************************************************************************************************
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

