import java.util.Scanner;

public class PrimeNumberCheck {
  
  static boolean isPrime(int a, int b) {
    
    if(a <= 1) {
      return false;
    } else if(b >= a) {
      return true;
    } else if(a % b == 0) {
      return false;
    } else {
      return isPrime(a, b+1);
    } 
    
}
  
  public static void main (String[] args) {
    
    int number;
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Bir sayi giriniz: ");
    number = input.nextInt();
    if(isPrime(number, 2)) {
      System.out.print(number + " sayisi ASALDIR !");
    } else {
      System.out.print(number + " sayisi ASAL DEGILDIR !");
    }
    
  }
}