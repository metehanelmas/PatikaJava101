import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int number = input.nextInt();
        int tempNumber = number;
        int basValue;
        int result = 0;


        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            tempNumber /= 10;
            result +=basValue;
            System.out.print(basValue + " + ");
        }
        System.out.println("\b\b= " + result);



    }
}
