import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /**Metehan Elmas **/

        Scanner input = new Scanner(System.in);

        System.out.print("N değerini giriniz : ");
        int n = input.nextInt();
        double result = 0.0;

        for (double i = 1 ; i <=n ;i++){

            result+=(1/i);

        } System.out.println("Cevap : " + result);


    }
}
