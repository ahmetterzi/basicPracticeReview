package practice_basic_day02;

import java.util.Locale;

public class Q03_SwitchCase01_Review {

      /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/

    public static void main(String[] args) {

        String str = "pazar";

        switch (str.toLowerCase(Locale.ROOT)) {
            case "pazartesi":
            case "sali":
                System.out.println("Java ders gunleri");
                break;
            case "persembe":
            case "cuma":
                System.out.println("Selenyum ders gunleri");
                break;
            case "carsamba":
            case "cumartesi":
                System.out.println("SQL dersi gunleri");
                break;
            default:
                System.out.println("izin gunu");
        }
    }

}
