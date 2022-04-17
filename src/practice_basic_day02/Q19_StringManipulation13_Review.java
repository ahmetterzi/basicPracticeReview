package practice_basic_day02;

import java.util.Scanner;

public class Q19_StringManipulation13_Review {
    public static void main(String[] args) {


        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 harfli bir kelime giriniz");
        String str = scan.next();

        if (str.length()==4) {
            System.out.println("Girdiginiz kelimenin tersten yazilisi : " + str.charAt(str.length() - 1)
                    + str.charAt(str.length() - 2)
                    + str.charAt(str.length() - 3)
                    + str.charAt(str.length() - 4));
        }else
            System.out.println("girdiginiz kelime 4 harfli degildir.");
    }
}
