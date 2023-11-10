import java.util.Scanner;

class MukemmelSayi {
    public static void main(String[] args) {
       int number;
       
       Scanner input = new Scanner(System.in);
       System.out.print("Basamak sayisini giriniz: ");
       number = input.nextInt();
        System.out.println();
       
       for(int i = number; i >= 0; i--) {
           
           for(int k = 0; k < (number-i); k++) {
            System.out.print(" ");
          }
          
          for(int j = 1; j <= (2*i-1); j++) {
            System.out.print("*");
          }
          
          
          System.out.println();
       }
       
       
    }
}