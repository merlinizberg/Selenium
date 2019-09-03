import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class insuranceTets2 {
    WebDriver driver;
    @Test
    public void test() throws InterruptedException {

        String region = "//a[@class = 'hd-ft-region']" ;
        String NO = "//a[contains(text(), 'Нижегородская область')]";
        String checkNO = "//span[contains(text(), 'Нижегородская область')]";
        String footer = "//ul[@class='footer__social']";

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.navigate().to("https://www.sberbank.ru/ru/person");

        WebElement mainelement = driver.findElement(By.xpath(region));
        wait.until(ExpectedConditions.visibilityOf(mainelement));
        mainelement.click();

        mainelement = driver.findElement(By.xpath(NO));
        mainelement.click();

        mainelement = driver.findElement(By.xpath(checkNO));
        mainelement.isDisplayed();

        WebElement scrollLocation = driver.findElement(By.xpath(footer));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", scrollLocation);

        mainelement = driver.findElement(By.xpath(footer));
        mainelement.isDisplayed();

        //   driver.quit();
    }
}
