import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan Fibonacci serisi eleman sayısını al
        System.out.print("Fibonacci serisi kaç eleman içersin? ");
        int elemanSayisi = scanner.nextInt();

        // İlk iki Fibonacci elemanını ekrana yazdır
        int a = 0, b = 1;
        System.out.print("Fibonacci Serisi: " + a + " " + b + " ");

        // Fibonacci serisini hesapla ve ekrana yazdır
        for (int i = 2; i < elemanSayisi; i++) {
            int fib = a + b;
            System.out.print(fib + " ");

            // Sonraki elemanları hesaplamak için a ve b'yi güncelle
            a = b;
            b = fib;
        }

        // Scanner'ı kapat
        scanner.close();
    }
}
