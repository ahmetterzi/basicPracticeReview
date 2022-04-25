package practice_basic_day03;

import java.util.Scanner;

public class Q01_MethodCreation01_Review {

     /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yapmak istediginiz islemi \"+,-,x,/\" olarak giriniz");
        char islem = scan.next().charAt(0);
        System.out.println("Lutfen islem yapmak istediginiz 1. sayiyi giriniz");
        double num1 = scan.nextDouble();
        System.out.println("Lutfen islem yapmak istediginiz 2. sayiyi giriniz");
        double num2 = scan.nextDouble();

        calculator(islem, num1, num2);
    }//main

    private static void calculator(char islem, double num1, double num2) {

        switch (islem) {
            case '+':
                System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                break;
            case 'x':
                System.out.println(num1 + "x" + num2 + "=" + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
                break;
            default:
                System.out.println("Hatali islem girisi yaptiniz");
        }
    }
}
