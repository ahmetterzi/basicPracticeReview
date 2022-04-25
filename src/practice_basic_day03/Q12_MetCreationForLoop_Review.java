package practice_basic_day03;

public class Q12_MetCreationForLoop_Review {


		/* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString */

    public static void main(String[] args) {

        String str = "temha";

        terstenYazdir(str);
    }

    private static void terstenYazdir(String str) {

        String terstenYazdir = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            terstenYazdir += str.charAt(i);
        }

        System.out.println("Girilen kelimenin tersten yazilisi : " + terstenYazdir);
    }
}
