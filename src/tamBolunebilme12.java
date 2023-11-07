import java.util.*;


public class Main {
    public static void main(String[] args) {
     
   int k,total = 0, sayac= 0;
   double ortalama;

   
   Scanner input = new Scanner(System.in);
   
   System.out.println("Sayi giriniz: ");
   k= input.nextInt();
   
   for(int i=1 ; i <= k ; i++ ) {
     if((i % 3 == 0) && (i % 4 == 0)) {

       total += i;
       sayac++;
       System.out.println("Ortalama: "+ (total/sayac));
     }
   }
   
    
     }
}
  
