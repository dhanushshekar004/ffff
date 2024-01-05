package Signin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Base;
import Repository.Signin;

public class TC001 extends Base {
	static String filepath="C:\\Users\\Dhanush S\\Desktop\\new\\FireFlink\\src\\main\\java\\testdata.properties";
	Signin sign=new Signin(driver);
	@BeforeTest
public void openbrowser() throws IOException, InterruptedException
{
	openBrowser();
	Signin sign=new Signin(driver);
	clickOnElement(sign.emailID);
	Properties prop=new Properties();
	FileInputStream ips=new FileInputStream(filepath);
	prop.load(ips);
	String username = prop.getProperty("username");
	System.out.println(username);
	String password = prop.getProperty("password");
	System.out.println(password);
	enterinputintoelemnt(sign.emailID,username);
	clickOnElement(sign.password);
	enterinputintoelemnt(sign.password, password);
	clickOnElement(sign.signin);
	Thread.sleep(5000);
	
}
@Test
public void verify() {
	Signin sign=new Signin(driver);
	boolean result=verifytextIsPresent(sign.verifytext);
	if (result==true) {
		System.out.println("123");
		moveMouseOnElement(sign.changelic);
		clickOnElement(sign.changelic);
		
	}
	
}


	
}


