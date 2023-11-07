import java.util.*;


public class Main {
    public static void main(String[] args) {
     
     int n1,n2, fakt1 = 1, fakt2 = 1, fakt3 = 1;
     double comb;
     
     Scanner input = new Scanner(System.in);
     
     System.out.println("1. Sayiyi giriniz: ");
     n1 = input.nextInt();
     System.out.println("2. Sayiyi giriniz: ");
     n2 = input.nextInt();
     
     for(int i = 1 ; i <= n1 ; i++) {
         fakt1 *= i;
     }
     
     for(int i = 1 ; i <= n2 ; i++) {
         fakt2 *= i;
     }
     
     for(int i = 1 ; i <= (n1-n2) ; i++) {
         fakt3 *= i;
     }
     
     
     comb = fakt1/(fakt2*fakt3);
     System.out.println("Komb: "+ comb);
    
     }
     
     }