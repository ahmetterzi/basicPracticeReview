package practice_basic_day03;

public class Q07_ForLoop02_Review {
    // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

    public static void main(String[] args) {
        int num = 0;

        for (char i = 0; i <255 ; i++) {

            System.out.println(num + " - " + i);
            num++;

        }
    }
}
