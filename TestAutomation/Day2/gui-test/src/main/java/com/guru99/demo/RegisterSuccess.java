package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterSuccess {

    public String getSalutationMessage(WebDriver driver){
        waitUntilNextElementAppears(driver,By.xpath("//*[contains(text(), \"Dear \")]"),5);
        String actualMessage = driver.findElement(By.xpath("//*[contains(text(), \"Dear \")]")).getText();
        return actualMessage;
    }

    private WebElement waitUntilNextElementAppears(WebDriver driver, By locator, int timeout){
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(
                ExpectedConditions.presenceOfElementLocated(locator));
        return element;
    }

}
