package guru.oze.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static guru.oze.app.Login.login;
import static guru.oze.app.WebDriver.*;


public class LogOut {
    public static void logout() {

        login();

        //		click on profile
        WebElement profile = driver.findElement(By.xpath("//body/div[@id='main-wrapper']/div/div[1]/div[2]/a[1]"));
        profile.click();


        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

//		click on logout button
        WebElement logout = driver.findElement(By.xpath("//div[@id='profileModel']//li[3]//a[1]"));
        logout.click();

//		verification
        String expectedurl = "https://app.oze.guru/";
        String actualurl = driver.getCurrentUrl();
        Assert.assertEquals(actualurl, expectedurl, "Logout Failed");


    }

    public static void close() {
        driver.quit();
    }

}

