package practice_basic_day02;

import java.util.Locale;
import java.util.Scanner;

public class Q11_StringManipulation05_Review {
    public static void main(String[] args) {

        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 ayri kelime giriniz");
        String str1 = scan.next();
        String str2 = scan.next();
        String str3 = scan.next();
        String str4 = scan.next();

        System.out.println(str1.substring(0,1).toUpperCase(Locale.ROOT)+str1.substring(1)
                +" "+str2
                +" "+str3
                +" "+str4+".");
    }
}
