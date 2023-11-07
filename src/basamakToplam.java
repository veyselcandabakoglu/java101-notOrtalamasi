import java.util.Scanner;

public class basamakToplam {
    public static void main(String[] args) {
        int number, temp, numberValue, total=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayi giriniz:");
        number = input.nextInt();
        
        while(number != 0) {
            numberValue = number % 10;

            total += numberValue;
            number /= 10;
        }
        
        System.out.println("Total: "+ total);
        
        
    }
}