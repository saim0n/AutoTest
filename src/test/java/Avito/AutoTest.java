package Avito;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoTest {

    @Test
    public void testSearchAvito(){

        System.setProperty("webdriver.chrome.driver", "C:\\JavaMachine\\chromedriver2.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1900, 1200));
        driver.get("https://www.avito.ru/rossiya");
        String title = driver.getTitle();
        Assert.assertEquals("Авито: недвижимость, транспорт, работа, услуги, вещи | Объявления в России", title);
        WebElement searchBox = driver.findElement(By.id("search"));
        searchBox.sendKeys("Стиральная машина");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        searchBox.sendKeys(Keys.ENTER);
        driver.quit();
    }

    @Test
    public void testSearchAvitoLogin(){

        System.setProperty("webdriver.chrome.driver", "C:\\JavaMachine\\chromedriver2.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1900, 1200));
        driver.get("https://www.avito.ru/rossiya");
        WebElement loginButton = driver.findElement(By.xpath("//a[text()=\"Вход и регистрация\"]"));
        loginButton.click();
        WebElement loginInput = driver.findElement(By.name("login"));
        loginInput.sendKeys("alex_tip_333@mail.ru");
        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("PLT12fb98");
        passwordInput.sendKeys(Keys.ENTER);
        driver.quit();
    }

}
