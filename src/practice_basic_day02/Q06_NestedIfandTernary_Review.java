package practice_basic_day02;

import java.util.Scanner;

public class Q06_NestedIfandTernary_Review {

     /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("0-9 arasi bir sayi giriniz");
        int num = scan.nextInt();
        String result="";

        if(num >=0 && num <= 9) {

            if(num == 9)
                result="nine";
            else if(num ==8)
                result ="eight";
            else if(num == 7)
                result ="seven";
            else if(num == 6)
                result = "six";
            else if(num == 5)
                result = "five";
            else if(num == 4)
                result = "four";
            else if(num == 3)
                result = "three";
            else if(num == 2 )
                result = "two";
            else if(num == 1)
                result = "one";
            else
                result = "Zero";
        } else {
            result = "Invalid";
        }

        System.out.println("nested if sonuc : " + result);


String result2 = num==9? "nine" : num==8? "eight"
        : num==7? "seven" : num==6? "six"
        : num==5? "five" : num==4? " four"
        : num==3? "three" : num==2? "two"
        : num==1? "one" :  num==0? "zero" : "gecersiz";

        System.out.println("ternary sonuc : " + result2);
    }

}
