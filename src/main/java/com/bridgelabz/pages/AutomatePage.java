package com.bridgelabz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;

public class AutomatePage {

    WebDriver driver;

    public AutomatePage(WebDriver driver) {
        this.driver = driver;
    }

    public void automationOnSuzlonPage() throws AWTException, InterruptedException {
        WebElement closeBtn = driver.findElement(By.cssSelector("#myModal-new > div > div > div > button"));
        closeBtn.click();
        Robot robot = new Robot();
        WebElement products = driver.findElement(By.xpath("//*[@id=\"m-product\"]/a"));
        Point coordinate = products.getLocation();
        robot.mouseMove((int) coordinate.getX(),(int) coordinate.getY()+110);
        Thread.sleep(2000);
        WebElement s44WindTurbineGenerator = driver.findElement(By.cssSelector("#m-product > ul > li:nth-child(2) > a"));
        s44WindTurbineGenerator.click();
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        Thread.sleep(1000);
        WebElement downloadBrochure = driver.findElement(By.cssSelector("body > section > section:nth-child(1) > div > div:nth-child(2) > div > div > a > span"));
        downloadBrochure.click();
        Thread.sleep(2000);
    }
}
