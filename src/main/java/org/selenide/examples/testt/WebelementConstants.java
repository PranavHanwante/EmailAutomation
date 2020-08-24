package org.selenide.examples.testt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$x;

public class WebelementConstants {


    public static WebElement CREATE_ACCOUNT_LINK = $x("//span[@class='NlWrkb snByac']");
    public static WebElement  FOR_MYSELF = $x("//div[contains(text(),'For myself')]");
    public static WebElement  FIRSTNAME = $x("//input[@id='firstName']");
    public static WebElement  LASTNAME = $x("//input[@id='lastName']");
    public static WebElement  USERNAME = $x("//input[@id='username']");
    public static WebElement PASSWORD =  $x("//input[@name='Passwd']");
    public static WebElement CONFORM_PASSWORD =  $x("//input[@name='ConfirmPasswd']");
    public static WebElement NEXT_BUTTON =  $x("//span[@class='RveJvd snByac']");

        public static WebElement LAST_ELEMENT_SIGN_IN_PAGE =  $x("//a[contains(text(),'Terms')]");
    public static WebElement LAST_ELEMENT_CREATE_GOOGLE_PAGE =  $x("//a[contains(text(),'Terms')]");
    public static WebElement LAST_ELEMENT_VERIFY_PHONE_PAGE =  $x("//a[contains(text(),'Terms')]");


    public static WebElement PHONE_NUMBER =  $x("//input[@id='phoneNumberId']");
    public static WebElement PHONE_NUMBER_PAGE_NEXT_BUTTON =  $x("//div[@class='FliLIb DL0QTb']//div[@class='VfPpkd-dgl2Hf-ppHlrf-sM5MNb']");


    public static WebElement OTP_PAGE_NEXT_BUTTON =  $x("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc']//div[@class='VfPpkd-RLmnJb']");

//welcome to Google page
public static WebElement SELECT_DAY =  $x("//input[@id='day']");
public static WebElement SELCT_YEAR =  $x("//input[@id='year']");
public static WebElement  WELCOME_TO_PAGE_NEXT_BUTTON=  $x("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc']//div[@class='VfPpkd-RLmnJb']");

// get more from your no. page
    public static WebElement BUTTON_YES_I_AM_IN =  $x("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc']//div[@class='VfPpkd-RLmnJb']");

    // Privacy and terms
    public static WebElement YES_I_AGREE_BUTTON =  $x("//span[contains(text(),'I agree')]");


    // user gamil page
    public static WebElement YES_GOT_IT_POPUP =  $x("//div[@class='J-J5-Ji T-I T-I-JN Zd']");

    //NEW USER SIGN IN PAGE
    public static WebElement CLICK_BUTTON = $x("//div[@class='VfPpkd-RLmnJb']");
    public static WebElement SET_EMAIL_ID = $x("//input[@id='identifierId']");

    //password page
    public static WebElement SET_PASSWORD = $x("//div[@class='VfPpkd-RLmnJb']");
    public static WebElement PASSWORD_CLICK_BUTTON = $x("//div[@class='VfPpkd-RLmnJb']");

}
