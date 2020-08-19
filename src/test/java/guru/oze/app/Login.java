package guru.oze.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {

    @Test
    public static void login() {
        System.out.println("Starting Login Test");

        /*setUp();*/
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        /* maximize the browser window */
        driver.manage().window().maximize();

        /* open the web page */
        String url = ("https://app.oze.guru/");
        driver.get(url);

//        clicking on the login
        WebElement login = driver.findElement(By.xpath("//b[contains(text(),'Login Here')]"));
        login.click();

        /* enter username */
        WebElement username = driver
                .findElement(By.xpath("//form[@id='loginform']//div//div//input[contains(@placeholder,'Username')]"));
        username.sendKeys("nanakay");

        /* enter password */
        WebElement password = driver
                .findElement(By.xpath("//form[@id='loginform']//div//div//div//input[@placeholder='Password']"));
        password.sendKeys("School@1234");

//			login
        WebElement login1 = driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
        login1.click();


        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


//			verification 1
//			String expectedurl = "https://app.oze.guru/dashboard";
//			String actualurl = WebDriver.driver.getCurrentUrl();
//			Assert.assertEquals(actualurl,  expectedurl, "Login failed");

//			verification 2
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Welcome to OZE App.')]")));
        Assert.assertTrue(toast.isDisplayed(), "Login Passed.");

        driver.quit();

    }


}
