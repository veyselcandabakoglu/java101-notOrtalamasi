import java.util.Scanner;

public class TaksiUcret {
    public static void main(String[] args) {
        double km, kmFiyat=2.20,taksiAcilis=10.0,total;

        Scanner input = new Scanner(System.in);

        System.out.println("Km Değeri= ");
        km=input.nextDouble();

        total = km*kmFiyat +taksiAcilis;
        total = (total <=20) ? 20 : total;

        System.out.println("Toplam Ücret= "+total+" TL");
    }
}
