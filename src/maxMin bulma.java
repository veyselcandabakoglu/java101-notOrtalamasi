import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
       int n,number,min,max;
       
       Scanner input = new Scanner(System.in);
       System.out.print("Kac tane sayi gireceksiniz: ");
       n = input.nextInt();
       
       System.out.print("1. Sayiyi giriniz: ");
       number = input.nextInt();
       
       min = number;
       max = number;
       
       for(int i = 2; i <= n; i++) {
          System.out.print(i +". Sayiyi giriniz: ");
          number = input.nextInt();
          
          if(number < min) {
            min = number;
          }
          
          if(number > max) {
            max = number;
          }
       }
       
        System.out.println("En kucuk sayi: " + min);
        System.out.print("\nEn buyuk sayi: " + max);
       
       
    }
}