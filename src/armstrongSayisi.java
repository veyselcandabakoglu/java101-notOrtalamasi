import java.util.Scanner;

public class armstrongSayisi {
    public static void main(String[] args) {
        int number, temp, counter= 0, numberValue,power,total=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayi giriniz:");
        number = input.nextInt();
        
        temp = number;
        while(temp != 0) {
            temp /= 10;
            counter++;
        }
      // System.out.println("Count= "+ counter);
        
        temp = number;
        while(temp != 0) {
            numberValue = temp % 10;
            
        //    System.out.println("numberValue= "+ numberValue);
            power = 1;
            for(int i = 1; i <= counter; i++) {
                power *= numberValue;
            }
           total += power;
          // System.out.println("total= "+ total);
           temp /= 10;
        }
        
         if (total == number) {
            System.out.println(number + " sayisi bir Armstrong sayisidir.");
        } else {
            System.out.println(number + " sayisi bir Armstrong sayisi degildir.");
        }
        
    }
}