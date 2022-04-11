package practice_basic_day01;

import java.util.Scanner;

public class Q10_IfStatement01_Review {

    public static void main(String[] args) {

        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Y veya N yaziniz");
        char str = scan.next().charAt(0);

        if (str == 'y' || str == 'Y') {
            System.out.println("YES");
        } else if (str == 'n' || str == 'N') {
            System.out.println("NO");

        } else{
            System.out.println("Yanlis giris yaptiniz. Lutfen tekrar deneyiniz");
    }

    }
}
