package practice_basic_day03;

import java.util.Scanner;

public class Q16_DoWhileLoop02_Review {
     /* WhileLoop,DoWhile
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."
		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:   You entered wrong word.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = "";

        do {
            System.out.println("kelime gir lo");
            word=scanner.next();

            if (word.length()<3) {
                System.out.println("girilen kelime 3 karakterden az");
            }
            if ((word.length()%2==1) && word.length()>=3){
                System.out.println("kelimenin ortasindaki karakter : " + word.charAt(word.length()/2));
            }
            else {
                System.out.println("kelimedeki karakter sayisi cifttir");
            }

            }while(!(word.length()%2==1) && word.length()>=3);
    }
}
