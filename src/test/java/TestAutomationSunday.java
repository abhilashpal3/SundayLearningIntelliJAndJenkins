import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestAutomationSunday {


    @Test
    public void launchBrowserAndHitURl()
    {
     //   System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        // driver.get("https://www.facebook.com/");
        driver.navigate().to("https://www.facebook.com/");

        System.out.println("All code executed");

    }
}
