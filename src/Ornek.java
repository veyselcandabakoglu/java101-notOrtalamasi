import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik,total;
        double ortalama;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunu giriniz: ");
        mat = input.nextInt();

        System.out.println("Fizik notunu giriniz: ");
        fizik = input.nextInt();

        System.out.println("Kimya notunu giriniz: ");
        kimya = input.nextInt();

        System.out.println("Türkçe notunu giriniz: ");
        turkce = input.nextInt();

        System.out.println("Tarih notunu giriniz: ");
        tarih = input.nextInt();

        System.out.println("Müzik notunu giriniz: ");
        muzik = input.nextInt();

        total = mat+fizik+kimya+turkce+tarih+muzik;
        ortalama = total / 6.0;

        System.out.println("Ortalama: " + ortalama);
    }
}
