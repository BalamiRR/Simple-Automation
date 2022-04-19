import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSeleniumTest {

    public void firstTest(){
        System.setProperty("webdriver.chrome.driver","resources/windows/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("www.google.com");

    }
}
