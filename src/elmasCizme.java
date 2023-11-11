import java.util.Scanner;

public class Main {
  public static void main(String[] args) { 
    int n;
    Scanner inp = new Scanner(System.in);
    
    System.out.println("Bir sayi giriniz: ");
    n = inp.nextInt();
    
    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= (n-i); j++) {
        System.out.print(" ");
      }
      for(int k = 1; k <= (2*i-1); k++) {
        System.out.print("*");
      }
      System.out.println();
 
    }
    
    for(int i = n; i >= 0; i--) {
      for(int j = 1; j <= (n-i); j++) {
        System.out.print(" ");
      }
      for(int k = 1; k <= (2*i-1); k++) {
        System.out.print("*");
      }
      System.out.println();
 
    }
  }
}