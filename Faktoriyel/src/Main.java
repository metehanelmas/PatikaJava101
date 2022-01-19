import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /**Metehan Elmas **/

        Scanner input = new Scanner(System.in);
        int n;
        int total = 1 ;

        System.out.print("Sayı Giriniz : ");
        n = input.nextInt();

        for (int i = 1 ; i <= n ; i++){

            total *= i;
        }
        System.out.println(n + ".faktöriyel  = " + total );

    }
}
