import java.util.Scanner;

class MukemmelSayi {
    public static void main(String[] args) {
       int number,total = 0;
       
       Scanner input = new Scanner(System.in);
       System.out.print("Bir sayi giriniz: ");
       number = input.nextInt();
       
       for(int i = 1; i < number; i++) {
          
          if(number % i == 0) {
            total += i;
          }
       }
       
        if(total == number) {
             System.out.println(number+ " Mukemmel Sayidir!");
        } else {
             System.out.println(number+ " Mukemmel Sayi Degildir!");
        }
       
       
    }
}