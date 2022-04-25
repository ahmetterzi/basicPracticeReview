package practice_basic_day03;

import java.util.Locale;
import java.util.Scanner;

public class Q15_DoWhileLoop01_Review {

     /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char input;


        do {
            System.out.println("islem giriniz. Isleminiz bittiyse x'e basiniz");
            input =scan.next().toLowerCase(Locale.ROOT).charAt(0);
            System.out.println("Program Calisiyor");
        }while (input != 'x');
        System.out.println("Program bitti");

        scan.close();




    }
}
