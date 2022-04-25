package practice_basic_day03;

import java.util.Scanner;

public class Q14_WhileLoop02_Review {

     /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int num = scan.nextInt();

        while (num>0){
            if (num%2==1)
                System.out.println(num);
            num--;
        }

    }
}
