package ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

    public static void main(String[] args) {

        //Set Chrome Browser
        WebDriver driver = new ChromeDriver();

        //Open the URL
        driver.get("https://courses.ultimateqa.com/users/sign_in");

        //Print the title of the page
        System.out.println("The title of the page is : " + driver.getTitle());

        //Print the Current URL
        System.out.println("The Current URL is : " + driver.getCurrentUrl());

        //Print the source of the page
        System.out.println("The source of the page is : " + driver.getPageSource());

        //Enter the email in the email field
        WebElement email = driver.findElement(By.id("user[email]"));
        email.sendKeys("iamsarvat@googly.com");

        //Enter the Password in the password field
        WebElement pass = driver.findElement(By.id("user[password]"));
        pass.sendKeys("iamboss");

        //close the Browser
        driver.close();
    }



}
