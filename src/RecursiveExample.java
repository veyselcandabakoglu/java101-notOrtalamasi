import java.util.Scanner;

public class RecursiveExample {

    public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
        
        System.out.print("Bir Sayi Giriniz: ");
        int n = input.nextInt(); 
        recursiveMethod(n);
    }

    public static void recursiveMethod(int num) {
        if (num <= 0) {
            System.out.println("Son Deger: " + num);
            return;
        } 
             System.out.println("Cikarma: " + num);
             recursiveMethod(num - 5);
             System.out.println("Toplama: " + num);

       
    }
}
