package practice_basic_day03;

import java.util.Scanner;

public class Q13_WhileLoop01_Review {
    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Basamaklari toplamini istediginiz sayiyi giriniz : ");
        int num = scan.nextInt();
        basamaklarToplami(num);

    }

    public static void basamaklarToplami(int num) {
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("basamaklar toplami : " + sum);
    }
}
