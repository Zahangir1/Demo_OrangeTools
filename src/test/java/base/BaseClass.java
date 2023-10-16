package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    public static WebDriver driver;
    public String baseUrl = "https://qa.orangetoolz.net/contact-us";


    @BeforeClass
    public void setUp(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        /*WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();*/
        driver.get(baseUrl);
        System.out.println("Title: " + driver.getTitle());
        driver.manage().window().maximize();

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
        System.out.println("Browser open successfully");

    }

}

