package org.selenide.examples.testt;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    boolean b;
    Def_Method_Page obj1 = new Def_Method_Page();

    @BeforeTest
    public void setup() {
        Configuration.baseUrl = "https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";

    }

    //    @Test(dataProvider="testdata")
//    public void demoClass(String firstName, String lastName, String username, String password1,String password2) throws InterruptedException {
    @Test
    public void demoClass() throws IOException {


        obj1.open();

        obj1.checkLastElementSignInPage();
        System.out.println("Yesss");

        obj1.clickOnCreateAccount();

        obj1.clickOnForMyself();


        obj1.checkLastElementCreateGoogleAccountPage();
        System.out.println("Yesss2");

        obj1.firstNameSetValue();
        obj1.LastNameSetValue();
        obj1.userNameSetValue();
        obj1.passwordSetValue();
        obj1.conformedPasswordSetValue();
        obj1.clickNextButton();


        obj1.checkLastElementVerifyPhonePage();
        System.out.println("Yesss3");
        obj1.verifyPhoneNumberPageNextButton();


        obj1.checkLastElementOTPPage();
        obj1.oTPPageNextButton();


        //welcome to Google page
        obj1.checkLastGoolePage();
        obj1.calenderDropDown();
        obj1.selectGender();
        obj1.welcomeTOPageNextButton();

        // get more from your no. page
        obj1.getMoreFromYourNoPageLastElement();
        obj1.buttonYesIAmIn();

        // Privacy and terms
        obj1.getMorePrivacyTermsPageLastElement();
        obj1.agreeButtonInPrivacyTerm();

        //user Gmail Page
        b = obj1.userPopUp();
        if (b) {
            System.out.println("User created");
            //Inserting data in excel
            String username = Def_Method_Page.username;
            String password = Def_Method_Page.password;


            String a[] = {username, password};
            File s = new File(System.getProperty("user.dir") + "\\test.xlsx");
//            File s = new File("C:\\Users\\Pranav\\Downloads\\test.xlsx");
            FileInputStream fis = new FileInputStream(s);
            XSSFWorkbook work_book = new XSSFWorkbook(fis);
            if (b) {
                XSSFSheet sheet = work_book.getSheetAt(0);
                int last_Row = work_book.getSheetAt(0).getLastRowNum();
                last_Row = last_Row + 1;
                System.out.println("yessss =    " + last_Row);
                Row target_Row = sheet.createRow(last_Row);
                for (int i = 0; i < 2; i++) {
                    Cell cell = target_Row.createCell(i);
                    cell.setCellValue(a[i]);

                    FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") + "\\test.xlsx");
                    work_book.write(fos);
                    fos.close();
                    System.out.println("END OF WRITING DATA IN EXCEL");
                }

            } else {
                System.out.println("User not created");
            }
        }
    }

    @Test
    public void demoClass3() {
        //sign in with new account and send msg
        Configuration.baseUrl = "https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
        obj1.open();
        obj1.checkLastElementOfUserSignInPage();
        obj1.setMailId();
        obj1.nextButtonClick();
        //password page
        obj1.checkLastElementOfSetPasswordPage();
        obj1.setPassword();
        obj1.nextNewUserPasswordButtonClick();
    }

}

//    @Test
//    public void demoClass2() throws IOException {
//        // write data in excel
//        if (true) {
//
////            String username = Def_Method_Page.username;
////            String password = Def_Method_Page.password;
//        String username="pranavhello";
//        String password="sda211";
//            String a[] = {username, password};
//            File s = new File(System.getProperty("user.dir")+"\\test.xlsx");
//            FileInputStream fis = new FileInputStream(s);
//            XSSFWorkbook work_book = new XSSFWorkbook(fis);
//            if (true) {
//                XSSFSheet sheet = work_book.getSheetAt(0);
//                int last_Row = work_book.getSheetAt(0).getLastRowNum();
//                last_Row = last_Row + 1;
//                System.out.println("yessss =    " + last_Row);
//                Row target_Row = sheet.createRow(last_Row);
//                for (int i = 0; i < 2; i++) {
//                    Cell cell = target_Row.createCell(i);
//                    cell.setCellValue(a[i]);
//
//                    FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"\\test.xlsx");
//                    work_book.write(fos);
//                    fos.close();
//                    System.out.println("END OF WRITING DATA IN EXCEL");
//                }
//            }
//        }
//    }
//    }

