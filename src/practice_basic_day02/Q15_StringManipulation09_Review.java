package practice_basic_day02;

import java.util.Scanner;

public class Q15_StringManipulation09_Review {
    public static void main(String[] args) {

        /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char midChar = str.charAt((str.length() -1)/2);

        if (str.length()%2 == 1 && str.length()>=3){
            System.out.println("girdiginiz kelimenin ortanca karakteri : " + midChar);
        }else System.out.println("girdiginiz kelimenin karakterleri cifttir");


    }//main
}
