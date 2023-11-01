import java.util.Scanner;

public class KdvHesapla {
    public static void main(String[] args) {

        double kdvSizFiyat,kdvLiFiyat,kdvTutari,kdv=0.18;
        Scanner input = new Scanner(System.in);

        System.out.println("Tutar Giriniz: " );
        kdvSizFiyat = input.nextDouble();

        kdvTutari = kdv*kdvSizFiyat;
        kdvLiFiyat = kdvTutari+kdvSizFiyat;

        System.out.println("KDV'siz Fiyat = " +kdvSizFiyat);
        System.out.println("KDV'li Fiyat= "+kdvLiFiyat);
        System.out.println("KDV tutarı = "+kdvTutari);
    }
}
