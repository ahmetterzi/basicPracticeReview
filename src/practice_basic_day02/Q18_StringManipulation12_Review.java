package practice_basic_day02;

import java.util.Scanner;

public class Q18_StringManipulation12_Review {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz");
        String str = scanner.nextLine();

        if (str.contains(" ")){
            System.out.println("Girdiginiz stringte bosluk vardir");
        }else if (str.isEmpty()){
            System.out.println("girdiginiz string bostur");
        }else
            System.out.println("girdiginiz string bosluksuzdur");



    }

}
