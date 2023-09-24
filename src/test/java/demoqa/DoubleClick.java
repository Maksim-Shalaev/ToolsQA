package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class DoubleClick {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\tmp\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            String url = "https://demoqa.com/";
            driver.get(url);
            driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
            Actions a = new Actions(driver);
            a.moveToElement(driver.findElement(By.cssSelector("button[type = 'Double Click Me']")));
            a.doubleClick();
            driver.quit();
        }
    }
