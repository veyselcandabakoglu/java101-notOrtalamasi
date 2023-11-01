import java.util.Scanner;
public class Daire {
    public static void main(String[] args) {
        int r;
        double pi=3.14,alan,cevre;

        Scanner input = new Scanner(System.in);

        System.out.println("Yarıçap= ");
        r = input.nextInt();

        cevre = 2*pi*r;
        alan = pi*r*r;

        System.out.println("Çevre= "+cevre);
        System.out.println("Alan= "+alan);
    }
}
