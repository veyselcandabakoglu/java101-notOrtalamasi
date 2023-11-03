import java.util.*;


public class Main {
    public static void main(String[] args) {
     
   int mat,fizik,turkce,kimya,muzik;
   double ortalama;
   
   
   Scanner input = new Scanner(System.in);
   
   System.out.println("Matematik Notunu Giriniz= ");
   mat = input.nextInt();
    
   System.out.println("Fizik Notunu Giriniz= ");
   fizik = input.nextInt();
   
   System.out.println("Türkçe Notunu Giriniz= ");
   turkce = input.nextInt();
    
   System.out.println("Kimya Notunu Giriniz= ");
   kimya = input.nextInt();
   
   System.out.println("Müzik Notunu Giriniz= ");
   muzik = input.nextInt();
   
   if(mat >= 0 && mat <= 100) {
     if(fizik >= 0 && fizik <= 100) {
       if(turkce >= 0 && turkce <= 100) {
         if(kimya >= 0 && kimya <= 100) {
           if(muzik >= 0 && muzik <= 100) {
             ortalama = (mat+fizik+turkce+kimya+muzik) / 5.0;
             System.out.println("Ortalama= "+ortalama);
             if(ortalama >= 55) 
              System.out.println("Geçtiniz!!");
              else 
                System.out.println("Kaldınız!!");
         } else {
       System.out.println("Not Aralığı 0-100 arasında olmalıdır!!");
     }
         } else {
       System.out.println("Not Aralığı 0-100 arasında olmalıdır!!");
     }
       } else {
       System.out.println("Not Aralığı 0-100 arasında olmalıdır!!");
     }
     } else {
       System.out.println("Not Aralığı 0-100 arasında olmalıdır!!");
     }
   } else {
     System.out.println("Not Aralığı 0-100 arasında olmalıdır!!");
   }
   

    
     }
     
     }
  
