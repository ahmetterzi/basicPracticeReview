package practice_basic_day01;

public class Q07_Converting_Review {
     /*
        galonu litreye ceviren bir java programi yaziniz
            1 gallon = 3.785 litre
        litreyi galona ceviren bir java programi yaziniz
            1 litre = 1/3.785 gallon

        // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
        // formül
        // c = (f-32)*5/9
     */

    public static void main(String[] args) {

        int g=1000;
        double l= g*3.785;
        String sonuc2 = g + " gallom degeri " + l +" litredir.";
        System.out.println(sonuc2);

        int litre = 100;
        double gallon = litre / 3.785;
        String sonuc = litre+" litre degeri "+ gallon+ " gallona esittir.";
        System.out.println(sonuc);

        int f = 72;
        double c = (f-32)*5/9;
        String sonuc3 = f +" fahrenheit " + c+ " santigrat derecedir.";
        System.out.println(sonuc3);





    }

}
