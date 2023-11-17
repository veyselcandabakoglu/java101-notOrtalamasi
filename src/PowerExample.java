import java.util.Scanner;

public class PowerExample {
  
  static int usAl(int a, int b) {

      if(b == 0) {
        return 1;
      } else {
        return a * usAl(a, b-1);
      }
    }
  
  public static void main (String[] args) {
    
    int base,exponent, result;
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Taban sayisini giriniz: ");
    base = input.nextInt();
    
    System.out.print("Us sayisini giriniz: ");
    exponent = input.nextInt();
    
    if(exponent < 0 ) {
      System.out.print("Us degeri negatif olamaz!");
    }
    
    result = usAl(base,exponent);
    
    System.out.print(base + "^" + exponent+ "= " + result);
    
    
    
  }
}