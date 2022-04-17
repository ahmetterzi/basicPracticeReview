package practice_basic_day02;

import java.util.Locale;
import java.util.Scanner;

public class Q07_StringManipulation01_Review {
    public static void main(String[] args) {

        //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin


        // 2 Strings olusturun -> string1 = "01234" and string2 = "56789"
        // 1.yol: concat() function ile concatenate string1 and string2
        // 2.yol: operator kullanarak concatenate string1 and string2
        // konsolda yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Isim ve soyisminizi giriniz");
        String input= scan.nextLine().toUpperCase(Locale.ROOT);

        System.out.println("Isminiz ve soyisminiz : " + input);

    String str1 = "01234";
    String str2 = "56789";

    String strSum = str1.concat(" " +str2);
        System.out.println("Concat edilmis String : " + strSum);

        String strSum2 = str1.concat(String.valueOf(str2));
        System.out.println(strSum2);













    }//main






}
