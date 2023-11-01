import java.util.Scanner;
public class VucutKitleEndeks {
    public static void main(String[] args) {
        double boy,kilo,kitle;

        Scanner input = new Scanner(System.in);
        System.out.println("Boy= ");
        boy= input.nextDouble();
        System.out.println("Kilo= ");
        kilo= input.nextDouble();

        kitle = (kilo) /(boy*boy);
        System.out.println("Vücut Kitle İndeksi= "+kitle);
    }
}
