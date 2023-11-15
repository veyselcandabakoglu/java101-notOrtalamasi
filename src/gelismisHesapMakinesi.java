import java.util.Scanner;

public class Main {
  
    static int sum(int a, int b) {
      int result = a + b;    
      System.out.println("Toplam: "+ result);
      return result;
    }  
     static int diff(int a, int b) {
      int result = a - b;    
      System.out.println("Fark: "+ result);
      return result;
    } 
     static int mult(int a, int b) {
      int result = a * b;    
      System.out.println("Carpim: "+ result);
      return result;
    } 
    static double div(double a, double b) {
      double result = a / b;    
      System.out.println("Bolum: "+ result);
      return result;
    }
     static int usAl(int a, int b) {
      int result = 1; 
      for(int i = 1; i <= b; i++) {
          result *= a;
      }
      System.out.println("Sonuc: "+ result);
      return result;
    }
      static int mod(int a, int b) {
      int result = a % b;    
      System.out.println("Kalan: "+ result);
      return result;
    } 
     static int[] dikdortgen(int a, int b) {
         int[] rect = new int[2]; 
         rect[0] = a * b;
         rect[1] = 2 * (a + b);
      System.out.println("Alan: "+ rect[0]);
      System.out.println("Cevre: "+ rect[1]);
      return rect;
    }
    static int fakt(int a) {
      int result = 1;
      for(int i = 1; i <= a; i++) {
          result *= i;
      }
      System.out.println("Faktoriyel: "+ result);
      return result;
    }
  
    public static void main(String[] args) {
      
      int select;
      
      Scanner input = new Scanner(System.in);
      
      String menu = "1- Toplama Islemi\n"+
                    "2- Cikarma Islemi\n"+
                    "3- Carpma Islemi\n"+
                    "4- Bolme Islemi\n"+
                    "5- Uslu Sayi Hesaplama Islemi\n"+
                    "6- Mod Alma Islemi\n"+
                    "7- Dikdortgen Alan ve Cevre Hesaplama Islemi\n"+
                    "8- Faktoriyel Hesaplama Islemi"+
                    "0- Cikis Yap";
              
      while(true) {
        System.out.println(menu);  
        System.out.print("Bir Islem Seciniz: ");
        select = input.nextInt();
        
       if(select == 0) {
            System.out.print("Gule Gule...");
            break;
        }
            
            
        System.out.print("Birinci Sayiyi Giriniz: ");
        int n1 = input.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz: ");
        int n2 = input.nextInt();
        
        switch(select) {
          case 1: sum(n1,n2);
            break;
          case 2: diff(n1,n2);
            break;
          case 3: mult(n1,n2);
            break;
          case 4: div(n1,n2);
            break;  
          case 5: usAl(n1,n2);
            break;  
          case 6: mod(n1,n2);
            break;
          case 7: dikdortgen(n1,n2);
            break;
          case 8: fakt(n1);
            break;
          case 0: 
              break;
          default: 
               System.out.println("Hatali Bir Secim Yaptiniz");
        }
        
      }              
      
     
  }
}