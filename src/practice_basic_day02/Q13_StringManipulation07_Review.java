package practice_basic_day02;

import java.util.Scanner;

public class Q13_StringManipulation07_Review {
    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("icinde xyz dizilimi olan kelime giriniz");
        String str = scan.next();

        xyzIceriyorMu(str);


    }

    private static void xyzIceriyorMu(String str) {


        boolean xyzConstains;

        if (str.contains("xyz")){
            xyzConstains=true;
        }else
            xyzConstains=false;

        System.out.println(xyzConstains);
    }
}
