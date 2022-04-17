package practice_basic_day02;

import java.util.Scanner;

public class Q01_NestedIfStatements_Review {

     /*
    Kullanici dan yas bilgisini alarak

	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

	 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz : ");
        int yas = scanner.nextInt();

        if (yas >= 18) {
            System.out.println("Oy kullanmaya uygun");
            if (yas >= 70) {
                System.out.println("Uc kez oy kullanabilirsiniz");
            } else if (yas >= 50) {
                System.out.println("Iki kez oy kullanabilirsiniz");
            } else
                System.out.println("bir kez oy kullanabilir");


        } else if (yas > 0 && yas < 18) {
            System.out.println("Yasiniz oy kullanmak icin uygun degildir");
        } else
            System.out.println("Hatali giris yaptiniz");


    }//main
}
