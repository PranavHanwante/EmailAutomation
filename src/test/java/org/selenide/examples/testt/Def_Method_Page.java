package org.selenide.examples.testt;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Def_Method_Page {
    public static String username;
    public static String password="kjlkjlkjk";
    public Def_Method_Page open() {
        Selenide.open("/");
        return this;
    }

    public Def_Method_Page checkLastElementSignInPage(){
  //      WebelementConstants.LAST_ELEMENT_SIGN_IN_PAGE.shouldBe(Condition.visible);
          $x("//a[contains(text(),'Terms')]").shouldBe(Condition.visible);
        return this;
    }

    public Def_Method_Page clickOnCreateAccount(){
        WebelementConstants.CREATE_ACCOUNT_LINK.click();
        return this;
    }

    public Def_Method_Page clickOnForMyself(){
        WebelementConstants.FOR_MYSELF.click();
        return this;
    }

    public Def_Method_Page checkLastElementCreateGoogleAccountPage(){
        //      WebelementConstants.LAST_ELEMENT_CREATE_GOOGLE_PAGE.shouldBe(Condition.visible);
        $x("//div[@class='ZFr60d CeoRYc']").waitUntil(Condition.visible,20000);
        return this;
    }

    public Def_Method_Page firstNameSetValue(){
        WebelementConstants.FIRSTNAME.sendKeys("Panav");
        return this;
    }

    public Def_Method_Page LastNameSetValue(){
        WebelementConstants.LASTNAME.sendKeys("Hanwante");
        return this;
    }

    public Def_Method_Page userNameSetValue(){

        username= RandomStringUtils.randomAlphabetic(7);
        WebelementConstants.USERNAME.sendKeys(username);
        return this;

//        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
//                + "abcdefghijklmnopqrstuvxyz";
//
//        // create StringBuffer size of AlphaNumericString
//        StringBuilder sb = new StringBuilder(7);
//
//        for (int i = 0; i < 7; i++) {
//            // generate a random number between
//            // 0 to AlphaNumericString variable length
//            int index
//                    = (int)(AlphaNumericString.length()
//                    * Math.random());
//            // add Character one by one in end of sb
//            sb.append(AlphaNumericString
//                    .charAt(index));
//        }
//         username = sb.toString();
    }

    public Def_Method_Page passwordSetValue(){
        WebelementConstants.PASSWORD.sendKeys(password);
        return this;
    }

    public Def_Method_Page conformedPasswordSetValue(){
        WebelementConstants.CONFORM_PASSWORD.sendKeys(password);
        return this;
    }

    public Def_Method_Page clickNextButton(){
        WebelementConstants.NEXT_BUTTON.click();
        return this;
    }


    public Def_Method_Page checkLastElementPhoneNumberPage(){
        //      WebelementConstants.LAST_ELEMENT_SIGN_IN_PAGE.shouldBe(Condition.visible);
        $x("//a[contains(text(),'Terms')]").shouldBe(Condition.visible);
        return this;
    }

//    PHONE_NUMBER

//PHONE_NUMBER_PAGE_NEXT_BUTTON
public Def_Method_Page checkLastElementVerifyPhonePage(){
    //      WebelementConstants.LAST_ELEMENT_VERIFY_PHONE_PAGE.shouldBe(Condition.visible);
    $x("//a[contains(text(),'Terms')]").shouldBe(Condition.visible);
    return this;

}

    public Def_Method_Page verifyPhoneNumberPageNextButton(){
        WebelementConstants.PHONE_NUMBER_PAGE_NEXT_BUTTON.click();
        return this;
    }



    // OTP PAGE
    public Def_Method_Page checkLastElementOTPPage(){
        //      WebelementConstants.LAST_ELEMENT_VERIFY_PHONE_PAGE.shouldBe(Condition.visible);
        $x("//a[contains(text(),'Terms')]").shouldBe(Condition.visible);
        return this;
    }

    public Def_Method_Page oTPPageNextButton(){
        WebelementConstants.OTP_PAGE_NEXT_BUTTON.click();
        return this;
    }

    //WELLCOME TO GOOGLE PAGE
    public Def_Method_Page checkLastGoolePage(){
        //      WebelementConstants.LAST_ELEMENT_VERIFY_PHONE_PAGE.shouldBe(Condition.visible);
        $x("//a[contains(text(),'Terms')]").shouldBe(Condition.visible);
        return this;
    }
        public Def_Method_Page calenderDropDown(){
        Select s = new Select($x("//select[@id='month']"));
        s.selectByIndex(3);
        WebelementConstants.SELECT_DAY.sendKeys("21");

        WebelementConstants.SELCT_YEAR.sendKeys("1994");

        return this;
    }
    public Def_Method_Page selectGender(){
        Select s = new Select($x("//select[@id='gender']"));
        s.selectByIndex(1);
        return this;
    }
    public Def_Method_Page welcomeTOPageNextButton(){
        WebelementConstants.WELCOME_TO_PAGE_NEXT_BUTTON.click();
        return this;
    }

    // get more from your no. page
    public Def_Method_Page getMoreFromYourNoPageLastElement(){
        //      WebelementConstants.LAST_ELEMENT_VERIFY_PHONE_PAGE.shouldBe(Condition.visible);
        $x("//a[contains(text(),'Terms')]").shouldBe(Condition.visible);
        return this;
    }

    public Def_Method_Page buttonYesIAmIn(){
        WebelementConstants.BUTTON_YES_I_AM_IN.click();
        return this;
    }

    // Privacy and terms
    public Def_Method_Page getMorePrivacyTermsPageLastElement(){
        //      WebelementConstants.LAST_ELEMENT_VERIFY_PHONE_PAGE.shouldBe(Condition.visible);
        $x("//a[contains(text(),'Terms')]").shouldBe(Condition.visible);
        return this;
    }
    public Def_Method_Page agreeButtonInPrivacyTerm(){
        WebelementConstants.YES_I_AGREE_BUTTON.click();
        return this;
    }

// user gamil page
public Boolean userPopUp(){
   // WebelementConstants.YES_GOT_IT_POPUP.click();
    $x("//div[@class='J-J5-Ji T-I T-I-JN Zd']").waitUntil(Condition.visible,20000);
    boolean b =  WebelementConstants.YES_GOT_IT_POPUP.isDisplayed();
    WebelementConstants.YES_GOT_IT_POPUP.click();
    return b;
}


//  NEW USER SIGNIN PAGE = public void demoClass3()


    public Def_Method_Page checkLastElementOfUserSignInPage(){
        $x("//a[contains(text(),'Terms')]").shouldBe(Condition.visible);
        return this;
    }

    public Def_Method_Page setMailId(){
//        WebelementConstants.SET_EMAIL_ID.sendKeys(username);
        WebelementConstants.SET_EMAIL_ID.sendKeys(Def_Method_Page.username);
//        22moot12
        return this;
    }
    public Def_Method_Page nextButtonClick(){
        WebelementConstants.CLICK_BUTTON.click();
        return this;
    }


    // NEW USER PASSWORD PAGE

    public Def_Method_Page checkLastElementOfSetPasswordPage(){
        $x("//a[contains(text(),'Terms')]").shouldBe(Condition.visible);
        return this;
    }

    public Def_Method_Page setPassword(){
//        WebelementConstants.SET_EMAIL_ID.sendKeys(username);
        WebelementConstants.SET_PASSWORD.sendKeys( Def_Method_Page.password);
//
        return this;
    }
    public Def_Method_Page nextNewUserPasswordButtonClick(){
        WebelementConstants.PASSWORD_CLICK_BUTTON.click();
        return this;
    }




}
