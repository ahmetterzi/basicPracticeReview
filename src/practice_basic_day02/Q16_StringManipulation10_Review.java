package practice_basic_day02;

public class Q16_StringManipulation10_Review {
    public static void main(String[] args) {


        // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

        String str = "   Java ogrenmek123 Cok guzel@      ";

        String strKelime = str.trim().replaceAll("\\d","").replace(" ", "x")
                .replaceAll("\\W", "").replaceAll("x", " ").
                replace("C", "c");

        System.out.println(strKelime);
    }
}
