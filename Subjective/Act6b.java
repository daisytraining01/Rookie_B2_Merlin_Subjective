package Subjective;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Act6b {
	
	protected WebDriver driver;
	
	public void saucedemo() throws InterruptedException 
	{
	System.setProperty ("webdriver.chrome.driver","C:\\Users\\MERLIN\\Desktop\\chromedriver.exe");
	driver = new ChromeDriver(); 
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	String eTitle = "saucedemo Page";
	String aTitle = "" ;
	
	driver.get("https://www.saucedemo.com/" );
	
	driver.manage().window().maximize() ;

	aTitle = driver.getTitle();
	
	if (aTitle.equals(eTitle))
	{
	System.out.println( "Test Passed") ;
	}
	else {
	System.out.println( "Test Failed" );
	}
	
	
}
}