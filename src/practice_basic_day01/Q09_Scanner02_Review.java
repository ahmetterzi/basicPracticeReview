package practice_basic_day01;

import java.util.Scanner;

public class Q09_Scanner02_Review {

    public static void main(String[] args) {

        // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
        // ve yasadiklari yeri seviyorlarsa
        // bu bilgiyi yazdirin

        // next() only can read the first word
        // nextLine() can read the whole line

        Scanner scanner = new Scanner(System.in);

        System.out.print("Adiniz? : ");
        String isim = scanner.nextLine();

        System.out.print("Nerelisiniz? : ");
        String memleket = scanner.nextLine();

        System.out.print("Su an nerede yasiyorsunuz? : ");
        String konum = scanner.nextLine();

        System.out.print("Yasiniz? : ");
        int yas = scanner.nextInt();

        System.out.print("Boyunuz? : ");
        int boy = scanner.nextInt();

        System.out.print("Yasadiginiz yeri seviyor musunuz? \nEvet ise : true\n Hayir ise : false\n yaziniz");
        boolean seviyorMu = scanner.hasNextBoolean();

        System.out.println("Isim : " + isim
        + "\nMemleket : " + memleket
        + "\nKonum : " + konum
        + "\nYas : " + yas
        + "\nBoy : " + boy + " cm"
        + "\nYasadiginiz yeri seviyor musunuz? " + seviyorMu);


    }
}
