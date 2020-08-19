package guru.oze.app;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static guru.oze.app.WebDriver.*;

public class EditProfile {
    @Test(priority = 3)

    public static void editProfile() {

        setUp();
//		 maximize the browser window
        driver.manage().window().maximize();

//		 enter oze url
        driver.get("https://app.oze.guru/");

//		 click on login
        WebElement signin = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
        signin.click();

//		enter login username
        WebElement username = driver
                .findElement(By.xpath("//form[@id='loginform']//div//div//input[@placeholder='Username']"));
        username.sendKeys("nanakay");

//		enter password
        WebElement password = driver
                .findElement(By.xpath("//form[@id='loginform']//div//div//div//input[@placeholder='Password']"));
        password.sendKeys("School@1234");

//		click on login button
        WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
        login.click();

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

//		click on profile
        WebElement profile = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/a[1]"));
        profile.click();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

//		click on edit Profile
        WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Edit')]"));
        logout.click();

        String expectedurl = "https://app.oze.guru/profile";
        String actualurl = driver.getCurrentUrl();
        Assert.assertEquals(actualurl, expectedurl, "Logout Failed");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

//		edit Full Name
        WebElement fullname = driver.findElement(By.name("fullName"));
        fullname.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        fullname.sendKeys("Nana Kwasi");

//		edit mobile Number
        WebElement phonenumber = driver.findElement(By.name("phoneNo"));
        phonenumber.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        phonenumber.sendKeys("+2222222222222");

//		entering email
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        email.sendKeys("sarpongnanakwasi@gmail.com");

//		update profile
        WebElement updateProfile = driver.findElement(By.xpath("//button[contains(text(),'Update Profile')]"));
        updateProfile.click();

//		verification
        WebElement successfulUpdate = driver
                .findElement(By.xpath("//div[contains(text(),'Your profile has been updated.')]"));
        Assert.assertTrue(successfulUpdate.isDisplayed(), "Profile was successfullu updated");

    }
    public static void close() {
        driver.quit();
    }


}
