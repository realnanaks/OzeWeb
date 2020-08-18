package guru.oze.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
    @Test
    public static void login() {
        /*setUp();*/
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        /* maximize the browser window */
        driver.manage().window().maximize();

        /* open the web page */
        String url = ("https://app.oze.guru/");
        driver.get(url);

        WebElement login = driver.findElement(By.xpath("//b[contains(text(),'Login Here')]"));
        login.click();
    }

}
