import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /**Metehan Elmas **/

        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Sınır Sayısını Giriniz : ");
        n = input.nextInt();

        for ( int i = 1 ; i<= n;i*=4) {
            System.out.print(i + ",");
        }System.out.println(" (4'ün Katları)  ");


        for ( int i = 1 ; i<= n;i*=5){
            System.out.print(i + ",");
        }System.out.println(" (5 in Katları)  ");


    }
}