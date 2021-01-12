package com.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GenericMethods {
    WebDriver driver;

    public GenericMethods(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElement(String locator, String type) {
        type = type.toLowerCase();

        if (type.equals("id")) {
            return this.driver.findElement(By.id(locator));

        } else if (type.equals("xpath")) {
            System.out.println(type);
            return this.driver.findElement(By.xpath(locator));
        } else {
            System.out.println("Not supported");
            return null;
        }
    }


    public List<WebElement> getElementsList(String locator, String type) {
        type = type.toLowerCase();

        if (type.equals("id")) {
            // return this.driver.findElement(By.id(locator));

        } else if (type.equals("xpath")) {
            System.out.println(locator);
            // return this.driver.findElement(By.xpath(locator));
        } else {
            System.out.println("Not supported");
            return null;
        }
        return null;
    }


    public Boolean isPresent(String locator, String type) {
        List<WebElement> elementList = getElementsList(locator, type);
        int size = elementList.size();

        if (size > 0) {
            return true;
        } else
            return false;
    }
}
