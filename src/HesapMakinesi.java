import java.util.*;


public class Main {
    public static void main(String[] args) {
     
     int sayi1,sayi2,sonuc,secim;
     
     Scanner input = new Scanner(System.in);
     sayi1=input.nextInt();
     sayi2=input.nextInt();
     secim=input.nextInt();
     
     switch(secim) {
       case 1: System.out.println("Toplam ="+ (sayi1+sayi2));
             break;
       case 2: System.out.println("Fark ="+ (sayi1-sayi2));
             break;
       case 3: System.out.println("Çarpım ="+ (sayi1*sayi2));
             break;
       case 4: if(sayi2 != 0) {
                  System.out.println("Bölüm ="+ (sayi1/sayi2));
                   } else {
                     System.out.println(sayi1+ " 0 sayısına bölünemez!!");
                   }
             break;
      default: System.out.println("Hatalı bir seçim yaptınız!!");       
     }
  }
}