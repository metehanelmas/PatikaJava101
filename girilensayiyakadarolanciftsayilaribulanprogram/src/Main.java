import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /** Metehan Elmas **/
        Scanner input = new Scanner(System.in);
        int k;
        System.out.print("Sayı giriniz : ");
        k=input.nextInt();

        int i = 0;
        double sum = 0 ,count = 0 ;
        while (i <=k){
            i++;
            if (i % 3 == 0 && i % 4 == 0){

                sum = sum + i;

                count++;



            }
        } double ortalama = sum/count;System.out.println("Girdiğiniz sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması : " +ortalama);










    }

}
