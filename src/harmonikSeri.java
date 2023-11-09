import java.util.Scanner;

 class harmonikSeri {
    public static void main(String[] args) {
        int number;
        double result = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz:");
        number = input.nextInt();

        for(int i =1; i <= number; i++) {
            result += (1.0/i);
        }
        System.out.println("Result= "+result);
    }
}
