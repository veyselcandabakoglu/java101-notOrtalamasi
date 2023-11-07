import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in) ;
        System.out.println("Sayiyi giriniz :");
        number = input.nextInt();

        for (int i = 1; i <= number; i *= 4) {
            
            System.out.println(i);

        }
        System.out.println("_________________________________");
        for (int i = 1; i <= number  ; i *= 5) {
         
            System.out.println(i);
        }
    }
}
  
