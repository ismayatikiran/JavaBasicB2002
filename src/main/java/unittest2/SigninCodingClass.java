package unittest2;

import java.util.Scanner;

public class SigninCodingClass implements SigninDesign {


    public String landingPage(String HomePage) {
        String LandingPage = "HomePage";
        System.out.println(LandingPage);
        return LandingPage;
    }

    public String signinForm(String Name) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plese Enter your name for signin: ");
        String EnterName = sc.nextLine();
        EnterName.indexOf("Ismayati Kiran");
        return EnterName;


    }

    public String signoutSign() {
        String signingout = "Bye Bye I am Signing Out!!";
        System.out.println( signingout);
        return signingout;
    }
}
