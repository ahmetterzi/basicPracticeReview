package practice_basic_day02;

import java.util.Scanner;

public class Q17_StringManipulation11_Review {

    public static void main(String[] args) {

        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz");
        String isim = scan.next();
        String soyisim = scan.next();

        if (isim.length()> soyisim.length()){
            System.out.println("Isminizin uzunlugu soyisminizden daha buyuk : " + isim);
        }else if (soyisim.length()>isim.length()) {
            System.out.println("Soyisminizin uzunlugu isminizden daha buyuk : " + soyisim);
        }else
            System.out.println("isminiz ve soyisminiz esit uzunlukta");
    }
}
