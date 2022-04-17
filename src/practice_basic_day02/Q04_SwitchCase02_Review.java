package practice_basic_day02;

import java.util.Scanner;

public class Q04_SwitchCase02_Review {

    /*
		 * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
		 * ornek
		 *  Kullanici  : A , B , C harflerinden birini secsin
			 A'yi secmis ise, ==> Java is easy
			 B'yi secmis ise, ==> Java is fun
			 C'yi secmis ise, ==> I need to study :)
		 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("A,B,C harflerinden birini seciniz");
        String str = scan.next();

        switch (str.toLowerCase()) {

            case "a":
                System.out.println("Java is easy");
                break;
            case "b":
                System.out.println("Java is so fun");
                break;
            case "c":
                System.out.println("I need to study");
                break;
            default:
                System.out.println("Yanlis giris yaptiniz");
        }
    }
}
