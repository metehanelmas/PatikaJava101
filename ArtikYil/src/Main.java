import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** Metehan Elmas **/

        Scanner input = new Scanner(System.in);
        int artikYil;

        System.out.print("Yıl Giriniz : ");
        artikYil = input.nextInt();

        if ((artikYil % 4 == 0) && (artikYil % 400 != 0 ) && (artikYil % 100 != 0)) {
            System.out.print(artikYil + " bir artık yıldır ! ");

        }else if ((artikYil % 400 == 0) && (artikYil % 100 == 0) && (artikYil % 4 == 0) ) {

            System.out.print(artikYil + " bir artık yıldır ! ");

        } else {
            System.out.println(artikYil + " bir artık yıl değildir ! ");
        }


    }
}