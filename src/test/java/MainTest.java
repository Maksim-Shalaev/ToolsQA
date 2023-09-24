import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class MainTest extends BaseTest {

    @Test
    public void testTextBox() {
        driver.get("https://demoqa.com/");
        driver.findElement(By.name("Elements")).click();
        driver.findElement(By.name("Text Box")).click();
        driver.findElement(By.id("userName")).sendKeys("Иван Иванов");
        driver.findElement(By.id("userEmail")).sendKeys("ivanov@ivanov.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Москва, ул. Тверская, дом 1, квартира 1");
        driver.findElement(By.id("permanentAddress")).sendKeys("Москва, ул. Тверская, дом 1, квартира 1");
        driver.findElement(By.cssSelector("button[type = 'submit']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("дом"));
    }

    @Test
    public void testButtonClickMe() {
        driver.get("https://demoqa.com/");
        driver.findElement(By.name("Elements")).click();
        driver.findElement(By.id("item-4")).click();
        driver.findElement(By.cssSelector("button[type = 'Click Me']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("You have done a dynamic click"));
    }

    @Test
    public void testButtonRightClickMe() {
        driver.get("https://demoqa.com/");
        driver.findElement(By.name("Elements")).click();
        driver.findElement(By.id("item-4")).click();
        driver.findElement(By.cssSelector("button[type = 'Right Click Me']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("You have done a right click"));
    }

    @Test
    public void testButtonDoubleClickMe() {
        driver.get("https://demoqa.com/");
        driver.findElement(By.name("Elements")).click();
        driver.findElement(By.id("item-4")).click();
        driver.findElement(By.cssSelector("button[type = 'Right Click Me']")).DoubleClick.a.doubleclick();
        Assert.assertTrue(driver.getCurrentUrl().contains("You have done a right click"));
    }
}