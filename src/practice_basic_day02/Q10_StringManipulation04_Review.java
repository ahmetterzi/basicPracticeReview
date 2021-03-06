package practice_basic_day02;

import java.util.Scanner;

public class Q10_StringManipulation04_Review {
    public static void main(String[] args) {

        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String str = scan.next();

        if (str.length()>=3){

            System.out.println(str.substring(str.length()-2) + str.substring(str.length()-2) + str.substring(str.length()-2));
        }else
            System.out.println("Lutfen en az 3 harfli bir kelime giriniz");

    }
}
