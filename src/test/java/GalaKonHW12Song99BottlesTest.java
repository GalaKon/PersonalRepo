import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GalaKonHW12Song99BottlesTest {

    public static final String URL = "http://www.99-bottles-of-beer.net";

    @Test
    public void testLanguageNamesStartFromJ() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Gala.Kon\\Downloads\\chromedriver_win32\\chromedriver.exe";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        String expectedResult = "All languages starting with the letter J are shown, sorted by Language.";

        driver.get(URL);

        driver.findElement(
                By.xpath("//div[@id='navigation']/ul[@id='menu']/li/a[@href='/abc.html']")
        ).click();

        driver.findElement(
                By.xpath("//a[@href='j.html']")
        ).click();

        String actualResult = driver.findElement(
                By.xpath("//div[@id='main']/p[1]")
        ).getText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
