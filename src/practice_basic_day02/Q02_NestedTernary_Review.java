package practice_basic_day02;

import java.util.Locale;

public class Q02_NestedTernary_Review {

    public static void main(String[] args) {


    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */


    char not = 'c';

    String sonuc = (not== 'a') ? "Gayet Basarili" :
            (not== 'b') ? "Basarili" :
                    (not==  'c') ? "Ha gayret": "Yanlis giris yaptiniz";

        System.out.println("sonuc = " + sonuc);


    }

}
