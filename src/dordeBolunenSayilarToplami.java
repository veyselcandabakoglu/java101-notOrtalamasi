import java.util.*;


public class Main {
    public static void main(String[] args) {
     
   int k,toplam = 0;

   
   Scanner input = new Scanner(System.in);
   
   do {
      System.out.print("Sayi giriniz: ");
      k= input.nextInt();
      if(k % 4 == 0) {
        toplam +=k;  
      }
   } while(k % 2 != 1);
   
   System.out.print("Toplam: "+ toplam);
   
   
    
     }
     
     }
  
