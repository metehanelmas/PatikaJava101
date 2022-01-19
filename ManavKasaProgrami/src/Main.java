import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /** Metehan Elmas **/

        double armutkg , elmakg , domateskg ,muzkg , patlicankg ;
        double armutUcret , elmaUcret , domatesUcret , muzUcret , patlicanUcret;
        double armut=2.14 , elma=3.67 , domates=1.11 , muz=0.95 , patlican=5.00;
        Scanner inp = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armutkg = inp.nextDouble();
        armutUcret = armut * armutkg;

        System.out.print("Elma Kaç Kilo ? : ");
        elmakg = inp.nextDouble();
        elmaUcret = elma * elmakg;

        System.out.print("Domates Kaç Kilo ? : ");
        domateskg = inp.nextDouble();
        domatesUcret = domates * domateskg;

        System.out.print("Muz Kaç Kilo ? : ");
        muzkg = inp.nextDouble();
        muzUcret = muz * muzkg;

        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicankg = inp.nextDouble();
        patlicanUcret = patlican * patlicankg;

        double toplamtutar =(armutUcret + elmaUcret + domatesUcret + muzUcret + patlicanUcret);
        System.out.print("Toplam Tutar : " + toplamtutar);
        System.out.println(" TL");


    }
}
