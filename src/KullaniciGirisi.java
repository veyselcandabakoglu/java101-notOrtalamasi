import java.util.*;


public class Main {
    public static void main(String[] args) {
     
     String userName,password, password2;
     int control;
     
     Scanner input = new Scanner(System.in);
     
     System.out.println("Kullanıcı Adınızı Giriniz: ");
     userName = input.nextLine();
     System.out.println("Şifrenizi Giriniz: ");
     password = input.nextLine();
     
     
     if(userName.equals("patika") && password.equals("java123")) {
       System.out.println("Sisteme Başarıyla Giriş Yaptınız!!");
     } else {
       System.out.println("Giriş Blgileriniz Hatalı!!\nŞifrenizi Sıfırlamak istiyor musunuz? (1-Evet 2-Hayır)");
       control = input.nextInt();
       if(control == 1) {
         password2 = input.nextLine();
         if(password2.equals("java123")) {
           System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
         } else {
           System.out.println("Şifre oluşturuldu");
         }
       } else if(control == 2){
         System.out.println("Hayır Seçildi! Çıkış Yapıldı.");
       }
     }
     
     }
  
}