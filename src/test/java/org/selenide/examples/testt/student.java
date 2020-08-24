package org.selenide.examples.testt;
import org.apache.commons.lang3.RandomStringUtils;

import java.io.File;
import java.util.Random;
class student{

    static String getAlphaNumericString(int n)
    {

        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(5);

        for (int i = 0; i < 5; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }
    public static void main(String[] args)
    {

        // Get the size n
        int n = 5;

        // Get and display the alphanumeric string
//        System.out.println(RandomStringUtils.randomAlphabetic(7));
// System.out.println(RandomStringUtils.random(5));
//
//        String username =RandomStringUtils.randomAlphabetic(7);
//        String password = Def_Method_Page.password;
//        String a[]={username,password};
//
//        for(int i=0; i<a.length;i++){
//          System.out.println(a[i]);
//        }

        File s = new File(System.getProperty("user.dir")+"test.xlsx");
        System.out.println(System.getProperty("user.dir")+"\\test.xlsx");


    }



}
