import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        /**Metehan Elmas **/

        System.out.print("Basamak Sayısı Giriniz : ");
        int n = input.nextInt();

        for (int i = 1 ; i <= n ; i++){ //Satır sayısı


            for (int k = 1 ; k<=(n-i);k++) { //Gereken boşluk sayısı
                System.out.print(" ");
            }

                for (int j = 1 ; j<=(2*i)-1 ; j++){ //boşluk sonrası satırda kullanılacak yıldız sayısı
                    System.out.print("*");
                }
                System.out.println();
            }

        for (int l = n-1 ; l >= 1 ; l--) { //Satır sayısı

            for (int h = 1; h <= (n-l) ; h++) { //Gereken boşluk sayısı
                System.out.print(" ");
            }
                for (int g = (2*l)-1; g>=1; g--) { //boşluk sonrası satırda kullanılacak yıldız sayısı
                    System.out.print("*");




        }

            System.out.println();



        }









    }
}
