package practice_basic_day03;

public class Q03_MethodCreation03_Review {

     /*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
     */

    public static void main(String[] args) {

        double cm = 10000;

        converter(cm);
    }

    private static void converter(double cm) {

        double metre = cm/100;
        double km = metre/1000;

        System.out.println(cm + " cm " + " = " + metre + " metredir.");
        System.out.println(cm + " cm " + " = " + km + " km'dir.");
    }
}
