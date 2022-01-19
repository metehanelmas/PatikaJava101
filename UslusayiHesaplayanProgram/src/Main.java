import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /** Metehan Elmas **/

        Scanner input = new Scanner(System.in);
        int n ,u;
        int total = 1;

        System.out.print("Sayıyı giriniz : ");
        n = input.nextInt();

        System.out.print("Üs Olacak Sayıyı Giriniz : ");
        u = input.nextInt();

        for (int i = 1 ; i <= u  ; i++) {

            total *= n ;

        }  System.out.println("Cevap : " + total);

    }
}
