package guru.oze.app;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver {

    public static org.openqa.selenium.WebDriver driver;


    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        if(driver==null) {
            driver = new ChromeDriver();

        }
    }

}

