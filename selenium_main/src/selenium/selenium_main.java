import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class selenium_main {

   public static void main(String[] args) {

        WebDriver driver = null;
        // Sets the path to your local ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "./src/chromedriver");
        
        driver = new ChromeDriver();
        // FIXED: Cleaned up the URL syntax from "https://www.google.com&quot;"
        driver.get("https://www.google.com");
        
        // Locates the Google search input box
        WebElement search_box = driver.findElement(By.id("APjFqb"));
        search_box.sendKeys("NPRU");  
        search_box.sendKeys(Keys.ENTER);
        
        // driver.close(); // Left commented out as per your original code to keep the browser open
   }
}