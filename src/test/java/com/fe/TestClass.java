package com.fe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\elashkoska\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String baseUrl = "https://www.goodreads.com/";
        driver.get(baseUrl);
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//*[@id=\"userSignInFormEmail\"]")).click();
        driver.findElement(By.id("userSignInFormEmail")).sendKeys("laskoskaelena@gmail.com");
        driver.findElement(By.id("user_password")).sendKeys("elena101");
        driver.findElement(By.xpath("//*[@id=\"sign_in\"]/div[3]/input[1]")).click();

        //TODO check with by name attribute

    }
}
