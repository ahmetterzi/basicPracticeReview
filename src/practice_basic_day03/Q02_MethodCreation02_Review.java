package practice_basic_day03;

public class Q02_MethodCreation02_Review {
    /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

    public static void main(String[] args) {

        String str = "aabbcccccddddaaa";

        tekrariKontrolEt(str);


    }

    private static void tekrariKontrolEt(String str) {

        String tekrarsizListe = "";

        for (int i = 0; i <str.length() ; i++) {
            if (!tekrarsizListe.contains(str.substring(i,i+1))){
                tekrarsizListe+= str.substring(i,i+1);
            }

        }
        System.out.println(tekrarsizListe);
    }
}
