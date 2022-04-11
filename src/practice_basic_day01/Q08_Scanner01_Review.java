package practice_basic_day01;

import java.util.Scanner;

public class Q08_Scanner01_Review {

    // kullanicidan 2 tam sayi alin
    // bu tam sayilari toplayin ve sonucu yazdirin

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen birinci tam sayiyi giriniz: ");
        int num1 = scanner.nextInt();

        System.out.print("Lutfen ikinci tam sayiyi giriniz: ");
        int num2 = scanner.nextInt();

        int sum = num1+num2;

        System.out.println("Girdiginiz sayilarin toplami: " + sum);
    }
}
