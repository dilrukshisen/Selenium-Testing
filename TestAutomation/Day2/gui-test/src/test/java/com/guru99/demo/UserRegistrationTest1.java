package com.guru99.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.PropertyFileReader;

import java.time.Duration;
import java.util.Properties;

public class UserRegistrationTest1 {

    WebDriver driver = null;
    PropertyFileReader prop = new PropertyFileReader();
    String url = prop.getProperty("config","url");

    @Test
    public void testRegisterNewUser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        //driver.findElement(By.linkText("REGISTER")).click();

        WebElement registerMenuLinkElement = driver.findElement(By.linkText("REGISTER"));
        registerMenuLinkElement.click();

        driver.findElement(By.name("firstName")).sendKeys("Dilru");
        driver.findElement(By.name("lastName")).sendKeys("Senevirathna");
        driver.findElement(By.name("phone")).sendKeys("+6465926555");
        driver.findElement(By.id("userName")).sendKeys("12365@gmail.com");
        driver.findElement(By.id("email")).sendKeys("Admin1");
        driver.findElement(By.name("password")).sendKeys("123");
        driver.findElement(By.name("confirmPassword")).sendKeys("123");

        Select dropDownMenuCountryElement = new Select(driver.findElement(By.name("country")));
        dropDownMenuCountryElement.selectByVisibleText("AUSTRIA");
        Thread.sleep(3000);
        dropDownMenuCountryElement.selectByValue("CHILE");
        Thread.sleep(3000);
        dropDownMenuCountryElement.selectByIndex(8);

        driver.findElement(By.name("submit")).click();
        waitUntilNextElementAppears(By.xpath("//*[contains(text(), \"Dear \")]"),10);


        String actualMessage = driver.findElement(By.xpath("//*[contains(text(), \"Dear \")]")).getText();
        Assert.assertEquals(actualMessage,"Dear Dilru Senevirathna,");



    }

    private WebElement waitUntilNextElementAppears(By locator, int timeout){
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(
                ExpectedConditions.presenceOfElementLocated(locator));
        return element;
    }

}
