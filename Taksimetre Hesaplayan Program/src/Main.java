import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /** Metehan Elmas */

        int km;
        double  acilis = 20 ,kmBasiUcret = 2.20 ;

        Scanner kmİnput = new Scanner(System.in) ;

        System.out.print("Mesafeyi Km. cinsinden giriniz : ");
        km = kmİnput.nextInt();

        double tutar = 10 + (km * kmBasiUcret) ;

        System.out.print("Ücretiniz : " + (tutar >= 20 ? tutar :  20 ));
        System.out.print(" TL");





    }
}
