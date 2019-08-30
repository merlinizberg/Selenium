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
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://rgs.ru");
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement mainpageButton = driver.findElement(By.xpath("//a[contains(text(), 'Страхование')]"));
        wait.until(ExpectedConditions.visibilityOf(mainpageButton));
        mainpageButton.click();

        WebElement DMCButton = driver.findElement(By.xpath("//a[contains(text(), 'ДМС')]"));
        wait.until(ExpectedConditions.visibilityOf(DMCButton));
        DMCButton.click();

        WebElement DMCword = driver.findElement(By.xpath("//h1[contains(text(), 'добровольное медицинское страхование')]"));
        DMCword.isDisplayed();

        WebElement zayavButton = driver.findElement(By.xpath("//a[contains(text(), 'Отправить заявку')]"));
        wait.until(ExpectedConditions.visibilityOf(zayavButton));
        zayavButton.click();

        WebElement DMCzayaword = driver.findElement(By.xpath("//b[contains(text(), 'Заявка на добровольное медицинское страхование')]"));
        DMCzayaword.isDisplayed();

        WebElement LastName = driver.findElement(By.xpath("//input[@name ='LastName']"));
        wait.until(ExpectedConditions.visibilityOf(LastName));
        LastName.sendKeys("фвпыФАВ");
        LastName.click();

        WebElement FirstName = driver.findElement(By.xpath("//input[@name ='FirstName']"));
        FirstName.sendKeys("фвпыФАВ");

        WebElement MiddleName = driver.findElement(By.xpath("//input[@name ='MiddleName']"));
        MiddleName.sendKeys("фвпыФАВ");

        WebElement region = driver.findElement(By.xpath("//select[@name ='Region']"));
        region.click();

        WebElement Phone = driver.findElement(By.xpath("//div/label[contains(text(), 'Телефон')]/following-sibling::input"));
        Phone.sendKeys("8005553535");

        WebElement Date = driver.findElement(By.xpath("//div/label[contains(text(), 'Предпочитаемая дата контакта')]/following-sibling::input"));
        Date.sendKeys(" 16092019");

        WebElement email = driver.findElement(By.xpath("//input[@name ='Email']"));
        email.sendKeys("qwertyqwerty");

        WebElement regionmsk = driver.findElement(By.xpath("//option[@value ='77']"));
        regionmsk.click();

        WebElement checkbox = driver.findElement(By.xpath("//input[@type ='checkbox']"));
        checkbox.click();

        WebElement completeButton = driver.findElement(By.xpath("//button[contains(text(), 'Отправить')]"));
        completeButton.click();

        WebElement errcheck = driver.findElement(By.xpath("//span[contains(text(), 'Введите адрес электронной почты')]"));
        errcheck.isDisplayed();


        driver.navigate().to("https://www.sberbank.ru/ru/person");

        WebElement regionsbt = driver.findElement(By.xpath("//a[@class = 'hd-ft-region']"));
        wait.until(ExpectedConditions.visibilityOf(regionsbt));
        regionsbt.click();

        WebElement district = driver.findElement(By.xpath("//a[contains(text(), 'Нижегородская область')]"));
        district.click();

        WebElement districtcheck = driver.findElement(By.xpath("//span[contains(text(), 'Нижегородская область')]"));
        districtcheck.isDisplayed();

        WebElement scrollLocation = driver.findElement(By.xpath("//ul[@class='footer__social']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", scrollLocation);

        WebElement socialbar = driver.findElement(By.xpath("//ul[@class='footer__social']"));
        socialbar.isDisplayed();

        driver.quit();
    }
}
