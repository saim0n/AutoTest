import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firsttest {

    @Test
    public void testSearchGoogle(){
    System.setProperty("webdriver.chrome.driver", "C:\\JavaMachine\\chromedriver2.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("балалайки");
        searchBox.submit();


    }
}
