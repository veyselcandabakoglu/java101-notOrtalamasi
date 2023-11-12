// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        String userName,password;
        int right = 3, select;
        int price, balance = 1500;
        
        Scanner input = new Scanner(System.in);
        
        while(right > 0) {
        System.out.print("Kullanici adini giriniz:");
        userName = input.nextLine();
        System.out.print("Parola giriniz:");
        password = input.nextLine();
        
        if(userName.equals("patika") && password.equals("dev123")) {
            System.out.println("Merhaba, Kodluyoruz Bankasina Hosgeldiniz");
            do {
                System.out.println("1- Para Yatirma\n"+
                                   "2- Para Cekme\n"+
                                   "3- Bakiye Sorgulama\n"+
                                   "4- Cikis Yap");
                System.out.print("Lutfen yapmak istediginiz islemi seciniz:");
                select = input.nextInt();
                
                switch(select) {
                    case 1: {
                        System.out.print("Para Miktari:");
                        price = input.nextInt();
                        balance += price;
                        System.out.print("Guncel Bakiyeniz: "+ balance);
                        System.out.println();
                        break;
                    }
                    case 2: {
                        System.out.print("Para Miktari:");
                        price = input.nextInt();
                        if(price > balance) {
                            System.out.println("Bakiye Yetersiz!");
                        } else {
                            balance -= price;
                        System.out.print("Guncel Bakiyeniz: "+ balance);
                        }
                        System.out.println();
                        break;
                    }
                    case 3: {
                        System.out.print("Guncel Bakiyeniz: "+ balance);
                        System.out.println();
                        break;
                    }
                }
            } while(select != 4);
             System.out.println("Tekrar gorusmek uzere.");
                break;
        } else {
            right--;
             System.out.println("Hatali giris yaptiniz!\n");
             System.out.println("Kalan Hakkiniz "+ right);
             if(right == 0) {
                 System.out.println("Kartiniz Bloke Olmustur!\n"+
                 "Bankayla Iletisime Geciniz!");
             }
        }
        }
        
        
        
    }
}