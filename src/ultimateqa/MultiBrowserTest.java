package ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {

    static String baseURL = "https://courses.ultimateqa.com/users/sign_in";
    static  String browser = "Edge";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else{
            System.out.println("Wrong Browser Name !!");
        }
        //Open URL
        driver.get("https://courses.ultimateqa.com/users/sign_in");

        //Print the title of the page
        System.out.println("The title of the page is : " + driver.getTitle());

        //Print the Current URL
        System.out.println("The Current URL : " + driver.getCurrentUrl());

        //Print the source of the page
        System.out.println("The source of the page is : " + driver.getPageSource());

        //Enter the email in the email field
        WebElement email = driver.findElement(By.id("user[email]"));
        email.sendKeys("iamsarvat@googly.com");

        //Enter the password in the password field
        WebElement pass = driver.findElement(By.id("user[password]"));
        pass.sendKeys("iamboss");

        //close the browser
        driver.close();
    }


}
