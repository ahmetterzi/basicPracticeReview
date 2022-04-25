package practice_basic_day03;

import java.util.Scanner;

public class Q10_ForLoop05_Review {

     /*        Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
	         hesaplayan kodu yazınız.

	        Örnek Ekran Çıktısı
	        Girilen sayı=4
	        Kareler toplamı=14
	     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 1'den buyuk bir tam sayi giriniz");
        int num = scan.nextInt();
        int sum = 0;

        for (int i = 1; i < num; i++) {
            sum += (i * i);
        }
        System.out.println("Kareler toplami : " + sum);
    }
}
