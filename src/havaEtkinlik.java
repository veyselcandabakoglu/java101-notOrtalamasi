import java.util.Scanner;

public class havaEtkinlik {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);

        System.out.println("Sıcaklık Değerini Giriniz: ");
        heat = input.nextInt();

        if(heat < 5) {
            System.out.println("Kayak yapmanız önerilir.");
        } else if(heat >= 5 && heat < 15) {
            System.out.println("Sinemaya gitmeniz önerilir.");
        } else if(heat >= 15 && heat < 25) {
            System.out.println("Pikniğe gitmeniz önerilir.");
        } else {
            System.out.println("Bu havada yüzmek eğlenceli olur.");
        }
    }
}
