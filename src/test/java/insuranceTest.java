import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class insuranceTest {

    WebDriver driver;
    @Test
    public void test() throws InterruptedException {
        String insurance = "//a[contains(text(), 'Страхование')]";
        String DMC = "//a[contains(text(), 'ДМС')]";
        String DMC2 = "//h1[contains(text(), 'добровольное медицинское страхование')]";
        String send = "//a[contains(text(), 'Отправить заявку')]";
        String checksend = "//b[contains(text(), 'Заявка на добровольное медицинское страхование')]";
        String lastname = "//input[@name ='LastName']";
        String firstname = "//input[@name ='FirstName']";
        String middleName = "//input[@name ='MiddleName']";
        String region = "//select[@name ='Region']" ;
        String regionnuber = "//option[@value ='77']";
        String number = "//div/label[contains(text(), 'Телефон')]/following-sibling::input";
        String date = "//div/label[contains(text(), 'Предпочитаемая дата контакта')]/following-sibling::input";
        String email = "//input[@name ='Email']";
        String checkbox = "//input[@type ='checkbox']";
        String senddmc = "//button[contains(text(), 'Отправить')]";
        String checkemail = "//span[contains(text(), 'Введите адрес электронной почты')]";


        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://rgs.ru");
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement mainElement = driver.findElement(By.xpath(insurance));
        wait.until(ExpectedConditions.visibilityOf(mainElement)).click();

        mainElement = driver.findElement(By.xpath(DMC));
        wait.until(ExpectedConditions.visibilityOf(mainElement)).click();

        mainElement = driver.findElement(By.xpath(DMC2));
        mainElement.isDisplayed();

        mainElement = driver.findElement(By.xpath(send));
        wait.until(ExpectedConditions.visibilityOf(mainElement)).click();

        mainElement = driver.findElement(By.xpath(checksend));
        mainElement.isDisplayed();

        mainElement = driver.findElement(By.xpath(lastname));
        wait.until(ExpectedConditions.visibilityOf(mainElement)).sendKeys("фвпыФАВ");

        mainElement = driver.findElement(By.xpath(firstname));
        mainElement.sendKeys("фвпыФАВ");

        mainElement = driver.findElement(By.xpath(middleName));
        mainElement.sendKeys("фвпыФАВ");

        mainElement = driver.findElement(By.xpath(region));
        mainElement.click();

        mainElement = driver.findElement(By.xpath(regionnuber));
        mainElement.click();

        mainElement = driver.findElement(By.xpath(number));
        mainElement.sendKeys("8005553535");

        mainElement = driver.findElement(By.xpath(date));
        mainElement.sendKeys(" 16092019");

        mainElement = driver.findElement(By.xpath(email));
        mainElement.sendKeys("qwertyqwerty");

        mainElement = driver.findElement(By.xpath(checkbox));
        mainElement.click();

        mainElement = driver.findElement(By.xpath(senddmc));
        mainElement.click();

        mainElement = driver.findElement(By.xpath(checkemail));
        mainElement.isDisplayed();

        //driver.quit();
    }
}
