package practice_basic_day03;

import java.util.Scanner;

public class Q05_MethodCreation05_Review {
     /*
  Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
     0-1-1-2-3-5-8-13-21-34....
  */

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 47'den kucuk bir pozitif tamsayi giriniz : ");
        
        int num = scan.nextInt();
        
        fibonacci(num);
        
        
    }

    private static void fibonacci(int fib) {

        int num1 = 0;
        int num2 = 1;
        int num3;
        System.out.print(num1 +"-");
        System.out.print(num2 +"");

        if (fib<47){
            for (int i = 2; i <fib ; i++) {
                num3 = num1 +num2;
                System.out.print("-" + num3);
                num1=num2;
                num2=num3;

            }

        }else
            System.out.println("47 den kucuk dedik babus!");

    }
}
