import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        int a,b,c,cevre,yarimCevre;
        double alan;

        Scanner input = new Scanner(System.in);

        System.out.println("Üç Kenar Değeri Giriniz: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        cevre = a+b+c;
        System.out.println("Çevre= "+cevre);
        yarimCevre=cevre/2;

        alan = Math.sqrt(yarimCevre*(yarimCevre-a)*(yarimCevre-b)*(yarimCevre-c));
        System.out.println("Alan= "+alan);

    }
}
