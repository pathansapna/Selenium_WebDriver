package advanced;

import org.asynchttpclient.util.HttpConstants;

public class Practise1 {
    public static void main(String[] args) {

// ****************************** Adding 2 numbers*******************

        System.out.println("I started Java learning");

//Add 2 numbers 2, 3 5

        int a=2;

        int b=3;

        int Sum=a+b;

        System.out.println("Sum is"+Sum);

//Sum is 5

//************************* Strings*********************************

// Payment $100 paid

//

        String str ="Payment $100 paid";

        System.out.println(str.charAt(8));

//sigle

        String str1="Payments $100 paid";

        System.out.println(str.indexOf("$"));

        System.out.println(str.substring(8));

//*************************************************************

        System.out.println("I Navigated to home page");

        HttpConstants.Methods m=new HttpConstants.Methods();

        System.out.println(m.ValidateHeader());

        public String ValidateHeader()

        {

            System.out.println("Header links validated");

            return "pass";

        }

    }
}
