package practice_basic_day01;

import java.util.Locale;
import java.util.Scanner;

public class Q12_IfStatement03_Review {

    public static void main(String[] args) {

        	/*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen is unvaninizi giriniz");
        String jobTitle = scan.nextLine().toLowerCase(Locale.ROOT);

        if (jobTitle== "qa"){
            System.out.println("Quality Analyst");
        }else if (jobTitle.equals("dev")){
            System.out.println("Developer");
        }else if (jobTitle.equals("ba")){
            System.out.println("Business Analyst");
        }else if (jobTitle.equals("pm")){
            System.out.println("Project Manager");
        }else{
            System.out.println("Yanlis unvan girdiniz");
        }

    }
}
