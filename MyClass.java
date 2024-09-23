package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {
	
	public static void main(String[] args) {  
        
	    // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\BJIT\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver(); 
	    
	    //driver.findElement(By.name("btnK")).click();  
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	    
	    //getTitle() method that is always used to obtain the page title of the currently loaded page.
	    String actualTitle = driver.getTitle();
	    
	    if (actualTitle.contentEquals("Test Login | Practice Test Automation")){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
	    
	    driver.findElement(By.name("username")).sendKeys("student");
	    driver.findElement(By.name("password")).sendKeys("Password123");
	    driver.findElement(By.id("submit")).click();
	    String currentUrl = driver.getCurrentUrl();
	    
	    System.out.println(currentUrl);
	    
	    if (currentUrl.contentEquals("https://practicetestautomation.com/logged-in-successfully/")){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
	    
	    //String x = driver.getText();
	    //System.out.println();
	    
	    
	    String x= driver.findElement(By.xpath("//p[@class=\"has-text-align-center\"]")).getText();
	    System.out.println(x);
	    
	    if (x.contains("Congratulations") | x.contains("successfully logged in")){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
	    
	    driver.findElement(By.xpath("//a[@href=\"https://practicetestautomation.com/practice-test-login/\" and @style=\"color:#ffffff\"]")).click();
	    
	    //driver.close(); 
    }  

}
