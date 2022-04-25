package practice_basic_day03;

import java.util.Scanner;

public class Q11_ForLoop06_Review {
    public static void main(String[] args) {
         /*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Olusturmak istediginiz yildizlarin satir ve sutun sayisini giriniz");
        int satir = scan.nextInt();
        int sutun = scan.nextInt();

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=sutun ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
