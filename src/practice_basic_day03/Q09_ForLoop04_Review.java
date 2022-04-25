package practice_basic_day03;

import java.util.Locale;
import java.util.Scanner;

public class Q09_ForLoop04_Review {
     /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u

     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.

     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.

     Test Data:
     we  yada  %

     Beklenen Çıktı:
     Yanlis karakter girdiniz!

 */
     public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);
         System.out.print("Lutfen bir kelime giriniz : ");
         String str = scan.next().toLowerCase(Locale.ROOT);
         String sesliHarfler = "aeiou";
         String strSesliHarfler = "";

         for (int i = 0; i <sesliHarfler.length() ; i++) {
             if (sesliHarfler.contains(str.substring(0,1))){
                 System.out.println("girdiginiz kelimede sesli harf mevcuttur");
                 break;
             }else {
                 System.out.println("girdiginiz kelimede sessiz harf mevcuttur");
                 break;
             }
         }
     }
}
