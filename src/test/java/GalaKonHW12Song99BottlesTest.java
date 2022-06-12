import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class GalaKonHW12Song99BottlesTest {

    public static final String URL = "http://www.99-bottles-of-beer.net";

    @Test
    public void testLanguageNamesStartFromJ() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Gala.Kon\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";

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

    @Test
    public void testSubmenuMhasMyAQL() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Gala.Kon\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        String expectedResult = "MySQL";

        driver.get(URL);

        driver.findElement(
                By.xpath("//div[@id='navigation']/ul[@id='menu']/li/a[@href='/abc.html']")
        ).click();

        driver.findElement(
                By.xpath("//a[@href='m.html']")
        ).click();

        String findMySQL = driver.findElement(
                By.xpath("//table")
        ).getText();

        if (findMySQL.contains("MySQL")) {
            Assert.assertTrue(true);
        }

        String actualResult = driver.findElement(
                By.xpath("//a[@href='language-mysql-1252.html']")
        ).getText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTableHasTitlesLanguageAuthorDateCommentsRate() {

        String expectedResultLanguage = "Language";
        String expectedResultAuthor = "Author";
        String expectedResultDate = "Date";
        String expectedResultComments = "Comments";
        String expectedResultRate = "Rate";

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Gala.Kon\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(URL);

        driver.findElement(
                By.xpath("//div[@id='navigation']/ul[@id='menu']/li/a[@href='/abc.html']")
        ).click();

        String findMySQL = driver.findElement(
                By.xpath("//tr")
        ).getText();

        if (findMySQL.contains("Language")) {
            Assert.assertTrue(true);
        }
        if (findMySQL.contains("Author")) {
            Assert.assertTrue(true);
        }
        if (findMySQL.contains("Date")) {
            Assert.assertTrue(true);
        }
        if (findMySQL.contains("Comments")) {
            Assert.assertTrue(true);
        }
        if (findMySQL.contains("Rate")) {
            Assert.assertTrue(true);
        }

        String actualResultLanguage = driver.findElement(
                By.xpath("//th[@style='width: 40%;']")
        ).getText();
        String actualResultAuthor = driver.findElement(
                By.xpath("//th[@style='width: 30%;']")
        ).getText();
        String actualResultDate = driver.findElement(
                By.xpath("//th[3]")
        ).getText();
        String actualResultComments = driver.findElement(
                By.xpath("//th[4]")
        ).getText();
        String actualResultRate = driver.findElement(
                By.xpath("//th[5]")
        ).getText();

        Assert.assertEquals(actualResultLanguage, expectedResultLanguage);
        Assert.assertEquals(actualResultAuthor, expectedResultAuthor);
        Assert.assertEquals(actualResultDate, expectedResultDate);
        Assert.assertEquals(actualResultComments, expectedResultComments);
        Assert.assertEquals(actualResultRate, expectedResultRate);
    }

    @Test
    public void testSecuritiCodeSpace() {

        String expectedResult = "Error: Error: Invalid security code.";

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Gala.Kon\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(URL);

        driver.findElement(
                By.xpath("//a[@href='/guestbookv2.html']")
        ).click();

        driver.findElement(
                By.xpath("//a[@href='./signv2.html']")
        ).click();

        driver.findElement(
                By.xpath("//input[@name='name']")
        ).sendKeys("Gala");

        driver.findElement(
                By.xpath("//input[@name='email']")
        ).sendKeys("gala.kon13@gmail.com");

        Random random = new Random();
        int randomNumber = random.nextInt();
        String captcha = Integer.toString(randomNumber);

        driver.findElement(
                By.xpath("//input[@name='captcha']")
        ).sendKeys(captcha);

        driver.findElement(
                By.xpath("//textarea")
        ).sendKeys("Hello");

        driver.findElement(
                By.xpath("//input[@type='submit']")
        ).click();

        String actualResult = driver.findElement(By.xpath(
                        "//p[@style='border: 1px solid red; background-color: #ffe0e0; padding: 5px; " +
                                "margin: 5px 10px 5px 10px;']"
                )).getText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRedditBoolmarkForAlternativeVersionsSolvingTask() {

        String expectedResult = "New to Reddit? SIGN UP";

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Gala.Kon\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(URL);

        driver.findElement(
                By.xpath("//li/a[@href='/abc.html']")
        ).click();

        driver.findElement(
                By.xpath("//a[@href='j.html']")
        ).click();

        driver.findElement(
                By.xpath("//a[@href='language-java-3.html']")
        ).click();

        driver.findElement(
                By.xpath("//a[@href='language-java-1148.html']")
        ).click();

        driver.findElement(
                By.xpath("//a[@title='reddit']/img[@height='16']")
        ).click();

        String actualResult = driver.findElement(By.xpath(
                        "//div[@class='BottomText login-bottom-text register hideable']")).getText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testShakespeareTestInTopLists() {

        String expectedResult = "Shakespeare";

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Gala.Kon\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(URL);

        WebElement topLists = driver.findElement(
                By.xpath("//li/a[@href='/toplist.html']")
        );
        topLists.click();

        driver.findElement(By.xpath("//table")).getText().contains("Shakespeare");

        String actualResult = driver.findElement(
                By.xpath(
                        "//a[@href='language-shakespeare-664.html']"
                )).getText();

        WebElement topEsotericLanguages = driver.findElement(
                By.xpath("//a[@href='./toplist_esoteric.html']")
        );
        topEsotericLanguages.click();

        driver.findElement(By.xpath("//table")).getText().contains("Shakespeare");

        WebElement top6 = driver.findElement(
                By.xpath("//a[@href='./tophits.html']")
        );
        top6.click();

        driver.findElement(By.xpath("//table")).getText().contains("Shakespeare");

        WebElement topRealLanguages = driver.findElement(
                By.xpath("//a[@href='./toplist_real.html']")
        );
        topRealLanguages.click();

        Assert.assertFalse(driver.findElement(By.xpath("//table[@id='category']")).getText().contains("Shakespeare"));

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testJavaLanguageHasSixVersions() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Gala.Kon\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        int expectedResult = 6;

        driver.get(URL);

        driver.findElement(
                By.xpath("//li/a[@href='/abc.html']")
        ).click();

        driver.findElement(
                By.xpath("//a[@href='j.html']")
        ).click();

        driver.findElement(
                By.xpath("//a[@href='language-java-3.html']")
        ).click();

        driver.findElement(
                By.xpath("//table[@id='category']")
        );

        int actualResult = driver.findElements(By.xpath("//tr[@onmouseover]")).size() + 1;

        Assert.assertEquals(actualResult, expectedResult);
    }
}
