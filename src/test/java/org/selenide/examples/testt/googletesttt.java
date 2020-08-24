package org.selenide.examples.testt;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class googletesttt {

    @Test(dataProvider="testdata")
    public void demoClass(String firstName, String lastName, String username, String password1,String password2) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranav\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

        driver.findElement(By.xpath("//span[@class='NlWrkb snByac']")).click();
        driver.findElement(By.xpath("//div[contains(text(),'For myself')]")).click();
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstName);
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastName);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys(password1);
        driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys(password2);
        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
    }

    @DataProvider
    public Object[][] testdata(){
        ReadExcelFile configuration = new ReadExcelFile("C:\\Users\\Pranav\\Downloads\\Data Demo2.xlsx");
      //  int rows = configuration.getRowCount(0);
        Object[][]signin_credentials = new Object[1][5];

//        for(int i=0;i<rows;i++)
//        {
            signin_credentials[0][0] = configuration.getData(0, 0, 0);
            signin_credentials[0][1] = configuration.getData(0, 0, 1);
            signin_credentials[0][2] = configuration.getData(0, 0, 2);
            signin_credentials[0][3] = configuration.getData(0, 0, 3);
            signin_credentials[0][4] = configuration.getData(0, 0, 4);
//        }
        return signin_credentials;
    }
}
