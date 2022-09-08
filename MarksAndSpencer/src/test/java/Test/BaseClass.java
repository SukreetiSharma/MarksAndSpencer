package Test;

import Pages.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    static WebDriver driver;
    protected static PageFactory pageFactory;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.marksandspencer.com/");
        pageFactory = new PageFactory(driver);
    }

    @AfterClass
    public static void close(){
        driver.close();
    }
}
