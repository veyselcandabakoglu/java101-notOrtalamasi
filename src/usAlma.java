import java.util.*;


public class Main {
    public static void main(String[] args) {
     
     int n, k, result=1;
    
     
     Scanner input = new Scanner(System.in);
     
     System.out.println("Ussu Alinacak Sayiyi giriniz: ");
     n = input.nextInt();
     System.out.println("Us Olacak Sayiyi giriniz: ");
     k = input.nextInt();
     
     for(int i = 1 ; i <= k ; i++) {
         result *= n;
     }
     
     
     System.out.println("Sonuc: "+ result);
    
     }
     
     }