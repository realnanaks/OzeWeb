package guru.oze.app;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import static guru.oze.app.WebDriver.*;

public class EditBusinessProfile {

    @Test(priority = 4)
    public static void editBusinessProfile() {
        setUp();
        Login.login();

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

//		click on edit profile
        WebElement editProfile = driver.findElement(By.xpath("//body/div[@id='main-wrapper']/div/div[1]/div[2]/a[1]"));
        editProfile.click();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

//		click on edit
        WebElement clickEdit = driver.findElement(By.xpath("//a[contains(text(),'Edit')]"));
        clickEdit.click();

//		click on MyBusiness
        WebElement myBusiness = driver.findElement(By.xpath("//span[contains(text(),'My Business')]"));
        myBusiness.click();

//		edit business name
        WebElement businessName = driver.findElement(By.xpath("//input[@id='companyName']"));
        businessName.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        businessName.sendKeys("Nana Kwasi Sarpong");

//		edit location
        WebElement location = driver.findElement(By.xpath("//input[@id='location']"));
        location.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        location.sendKeys("Tema");

//		edit momo
        WebElement momo = driver.findElement(By.xpath("//input[@id='contact']"));
        momo.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        momo.sendKeys("+233558676542");

//		edit industry
        WebElement industry = driver.findElement(By.xpath("//select[@id='industry']"));
        industry.click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        WebElement it = driver.findElement(By.xpath("//option[contains(text(),'IT')]"));
        it.click();

//		edit cash balance
        WebElement cashBalance = driver.findElement(By.xpath("//input[@id='cashBalance']"));
        cashBalance.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        cashBalance.sendKeys("100000");

//		edit description
        WebElement description = driver.findElement(By.xpath("//input[@id='description']"));
        description.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        description.sendKeys("Software");

//		edit primary goal
        WebElement goal = driver.findElement(By.id("goal"));
        goal.click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        WebElement getloan = driver.findElement(By.xpath("//option[contains(text(),'Get ready to get a loan')]"));
        getloan.click();

//		click on update
        WebElement update = driver.findElement(By.xpath("//div[9]//button[1]"));
        update.click();

//		verification
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement updated = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(text(),'Your business profile has been saved successfully.')]")));
        Assert.assertTrue(updated.isDisplayed(), "Updated Succesfully");



    }
    public static void close() {
        driver.quit();
    }
}
