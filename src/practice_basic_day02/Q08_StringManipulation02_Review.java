package practice_basic_day02;

import java.util.Scanner;

public class Q08_StringManipulation02_Review {
    public static void main(String[] args) {

        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Iki kelime giriniz");
        String str1 = scan.next();
        String str2 = scan.next();

        String strSum = str1.concat(" " + str2);
        System.out.println("Birlesik String : " + strSum);

        String strSum2 = str1.substring(1).concat(" " + str2.substring(1));
        System.out.println("Bas harfsiz String : " + strSum2);



    }
}
