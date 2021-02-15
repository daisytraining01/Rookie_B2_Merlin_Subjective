package Subjective;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.*;		

public class Act1c {				
    public static void main(String[] args) {									
    		
    			
        System.setProperty("webdriver.chrome.driver","C:\\Users\\MERLIN\\Desktop\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        		
        String baseUrl = "http://demo.guru99.com/test/login.html";					
        driver.get(baseUrl);					

       	
        WebElement email = driver.findElement(By.id("email"));							

      		
        WebElement password = driver.findElement(By.name("passwd"));							

        email.sendKeys("qwert1@gmail.com");					
        password.sendKeys("sen345690");					
        System.out.println("Text Field Set");					
         
        	
        email.clear();			
        password.clear();			
        System.out.println("Text Field Cleared");					

       		
        WebElement login = driver.findElement(By.id("SubmitLogin"));							
                    		
     	
        email.sendKeys("abcd@gmail.com");					
        password.sendKeys("abcdefghlkjl");					
        login.click();			
        System.out.println("Login Done with Click");					
        		
       	
        driver.get(baseUrl);					
        driver.findElement(By.id("email")).sendKeys("qwert1@gmail.com");							
        driver.findElement(By.name("passwd")).sendKeys("sen345690");							
        driver.findElement(By.id("SubmitLogin")).submit();					
        System.out.println("Login Is Done");					
         
			
        		
    }		
}
