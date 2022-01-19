import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik,sum = 0 , count = 0 ;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();
        if (!(mat < 0 || mat > 100)){
            sum = sum+mat;
            count++;
        }
        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();
        if (!(fizik < 0 || fizik > 100)){
            sum = sum+fizik;
            count++;
        }
        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();
        if (!(turkce < 0 || turkce > 100)){
            sum = sum+turkce;
            count++;
        }
        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();
        if (!(kimya < 0 || kimya > 100)){
            sum = sum+kimya;
            count++;
        }
        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();
        if (!(muzik < 0 || muzik > 100)){
            sum = sum+muzik;
            count++;
        }
        double ortalama = sum/count;
        System.out.println(sum);
        System.out.println("Ortalamanız : " + ortalama);
        System.out.println((sum/count)>=55 ? "Geçtiniz" : "Kaldınız");


    }

}
