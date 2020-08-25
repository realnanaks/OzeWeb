package guru.oze.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static guru.oze.app.WebDriver.*;

public class SignUp {

    @Test(priority = 5)
    public static void register() {
//        /* create driver */
//		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();

        setUp();

        /* maximize the browser window */
        driver.manage().window().maximize();

        /* open the web page */
        String url = ("https://app.oze.guru/");
        driver.get(url);

        /* click on register */
        WebElement register = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        register.click();

        /* enter phone number */
        WebElement phonenumber = driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
        phonenumber.sendKeys("542401517");

        /* enter username */
        WebElement username = driver.findElement(By.name("name"));
        username.sendKeys("selormonray");
        /* enter email */
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("selormonray14@gmail.com");

        /* enter password */
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Zx3zQzHGxeLmKmk");

        /* confirm password */
        WebElement passwordConfirm = driver.findElement(By.id("password-confirm"));
        passwordConfirm.sendKeys("Zx3zQzHGxeLmKmk");

        /* register by clicking on next */
        WebElement submit = driver
                .findElement(By.xpath("//button[@class='btn btn-primary btn-rounded btn waves-effect waves-light']"));
        submit.click();

//			verifications
    }
//    public static void close() {
//        driver.quit();
//    }
    public static void existingEmail(){

        setUp();

        /* maximize the browser window */
        driver.manage().window().maximize();

        /* open the web page */
        String url = ("https://app.oze.guru/");
        driver.get(url);

        /* click on register */
        WebElement register = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        register.click();

        /* enter phone number */
        WebElement phonenumber = driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
        phonenumber.sendKeys("542401517");

        /* enter username */
        WebElement username = driver.findElement(By.name("name"));
        username.sendKeys("selormonray");
        /* enter email */
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("selormonray14@gmail.com");

        /* enter password */
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Zx3zQzHGxeLmKmk");

        /* confirm password */
        WebElement passwordConfirm = driver.findElement(By.id("password-confirm"));
        passwordConfirm.sendKeys("Zx3zQzHGxeLmKmk");

        /* register by clicking on next */
        WebElement submit = driver
                .findElement(By.xpath("//button[@class='btn btn-primary btn-rounded btn waves-effect waves-light']"));
        submit.click();

//        verification

    }

}
