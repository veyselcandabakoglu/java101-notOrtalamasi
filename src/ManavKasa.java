import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        int kgArmut,kgElma,kgDomates,kgMuz,kgPatlican;
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00,total;

        Scanner inp = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo ? : ");
            kgArmut=inp.nextInt();

        System.out.println("Elma Kaç Kilo ? : ");

            kgElma=inp.nextInt();
        System.out.println("Domates Kaç Kilo ? : ");
            kgDomates=inp.nextInt();

        System.out.println("Muz Kaç Kilo ? : ");
            kgMuz=inp.nextInt();
        System.out.println("Patlıcan Kaç Kilo ? : ");
            kgPatlican=inp.nextInt();

        total = kgArmut*armut+kgElma*elma+kgDomates*domates+kgMuz*muz+kgPatlican*patlican;
        System.out.println("Toplam Tutar= "+total);
    }
}
