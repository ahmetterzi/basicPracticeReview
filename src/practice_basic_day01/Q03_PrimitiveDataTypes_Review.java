package practice_basic_day01;

public class Q03_PrimitiveDataTypes_Review {

     /*
         * Primitive data type
                byte: only takes whole numbers (sadece butun numaralari alir)
	 	        short: only takes whole numbers (sadece butun numaralari alir)
	 	        int(used more often): only takes whole numbers (sadece butun numaralari alir - en cok tercih edilen)
	 	        long: only takes whole numbers (sadece butun numaralari alir)

	 	        float: can take decimals (MUST have F or f at the end) (kusuratli numaralari alir ve sonuna "F" konulmalidir)
	 	        double( used more often): can take decimals (kusuratli numaralari alir - en cok tercih edilen)

	 	        boolean: true or false boolean expressions (sonucu dogru/yanlis olarak dondurur)
	 	        char: character within single quote '' (tek tirnak icinde tek karakter kabul eder, sayi, harf veya sembol olabilir)
	 	        	 	also takes number
         * Range: double > float >long > int >short > byte
         */

    //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.

    public static void main(String[] args) {

        byte byteMin= Byte.MIN_VALUE;
        System.out.println("byteMin : " + byteMin);

        byte byteMax= Byte.MAX_VALUE;
        System.out.println("byteMax : " + byteMax);

        short shortMin= Short.MIN_VALUE;
        System.out.println("shortMin : " + shortMin);

        short shortMax= Short.MAX_VALUE;
        System.out.println("shortMax : " + shortMax);

        int intMin= Integer.MIN_VALUE;
        System.out.println("intMin = " + intMin);

        int intMax= Integer.MAX_VALUE;
        System.out.println("intMax = " + intMax);

        float floatMin= Float.MIN_VALUE;
        System.out.println("floatMin : " + floatMin);

        float floatMax= Float.MAX_VALUE;
        System.out.println("floatMax : " + floatMax);

        long longMin = Long.MIN_VALUE;
        System.out.println("longMin = " + longMin);

        long longMax= Long.MAX_VALUE;
        System.out.println("longMax = " + longMax);

        boolean dogruMu = true;
        System.out.println(dogruMu);

        float kilo = 99.9f;
        double db = 100.03;
        char ch = 'E';


    }

}
