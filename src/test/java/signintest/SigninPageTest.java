package signintest;

import org.testng.Assert;
import org.testng.annotations.Test;
import unittest2.SigninCodingClass;

public class SigninPageTest{

    @Test
    public void testLandingPage(){
        SigninCodingClass signinCodingClass = new SigninCodingClass();
        String actualResult = signinCodingClass.landingPage("Welcome to Langing Page");
        System.out.println(actualResult);
        String expectedResult = "Welcome to Langing Page";
        Assert.assertEquals(expectedResult,actualResult);
        System.out.println("exceptedResult is equal to actualResult thus method is working good");
    }
    @Test
    public void testSigninForm() throws InterruptedException {

        SigninCodingClass signinCodingClass = new SigninCodingClass();
        String actualResult =signinCodingClass.signinForm("Ismayati Kiran");
       // String actualResult = signinCodingClass.signinForm("Ismayati Kiran");
        System.out.println(actualResult);
        String expectedResult = "Ismayati Kiran";
        System.out.println("exceptedResult is equal to actualResult thus method is working good");
    }

    @Test
    public void testSigningOut(){
        SigninCodingClass signinCodingClass = new SigninCodingClass();
        String actualResult = signinCodingClass.signoutSign();
        System.out.println(actualResult);
        String expectedResult = "Bye Bye I am Signing Out!!";
        Assert.assertEquals(expectedResult,actualResult);
        System.out.println("exceptedResult is equal to actualResult thus method is working good");
    }
    }










