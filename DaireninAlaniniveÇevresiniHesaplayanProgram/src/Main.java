import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /** Metehan Elmas **/

        Scanner inp = new Scanner(System.in);

        int  r , merkezAcisi;
        double pi = 3.14;

        System.out.print("Yarıçapı Giriniz : ");
        r = inp.nextInt();

        System.out.print("Merkez Açıyı Giriniz : ");
        merkezAcisi = inp.nextInt();

        double alan  = (pi * (r*r) * merkezAcisi) / 360 ;
        System.out.print("Alan : " + alan);

        /*double normalalan = (pi * r*r) ;
        double cevre = (2 * pi * r) ;

        System.out.println("Alan : " + normalalan);
        System.out.print("Çevre : " + cevre); */

        //Çalan Şarkı : Murat Göğebakan - Unutur muyum seni ? 06.01.2022 14:18  ;








    }
}
