package Subjective;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Act5 {
 
 public static void main(String[] args){
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\MERLIN\\Desktop\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
 
 
 driver.get("https://wordpress.com/?aff=58022&cid=8348279\r\n"
 		+ "");
 driver.manage().window().maximize();
 
 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
 
 
 for(WebElement link:allLinks){
 System.out.println(link.getText() + " - " + link.getAttribute("href"));
 }
 

   driver.quit();
 } 
 
}
