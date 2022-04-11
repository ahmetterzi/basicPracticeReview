package practice_basic_day01;

public class Q11_IfStatement02_Review {

    public static void main(String[] args) {

         /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */

        int gecisNotu = 6;

        if (gecisNotu>89 && gecisNotu<101){
            System.out.println("Notunuz : A");
        }else if (gecisNotu>79 && gecisNotu<90){
            System.out.println("Notunuz : B");
        }else if (gecisNotu>69 && gecisNotu<80){
            System.out.println("Notunuz : C");
        }else if (gecisNotu>59 && gecisNotu<70){
            System.out.println("Notunuz : D");
        }else if (gecisNotu>=0 && gecisNotu<60){
            System.out.println("Notunuz : F");
        }else{
            System.out.println("Yanlis not girisi yaptiniz");
        }
    }
}
