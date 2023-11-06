import java.util.*;


public class Main {
    public static void main(String[] args) {
     
   int year, mode;
   String zodyak= "";
   
   Scanner input = new Scanner(System.in);
   
   System.out.println("Doğum Yılınızı Giriniz:");
   year = input.nextInt();
   
   mode = year % 12;
   // System.out.print("Kalan: "+mode);
  
   switch(mode) {
     case 0: zodyak="Maymun";
     break;
     case 1: zodyak="Horoz";
     break;
     case 2: zodyak="Köpek";
     break;
     case 3: zodyak="Domuz";
     break;
     case 4: zodyak="Fare";
     break;
     case 5: zodyak="Öküz";
     break;
     case 6: zodyak="Kaplan";
     break;
     case 7: zodyak="Tavşan";
     break;
     case 8: zodyak="Ejderha";
     break;
     case 9: zodyak="Yılan";
     break;
     case 10: zodyak="At";
     break;
     case 11: zodyak="Koyun";
     break;
     default: System.out.print("Hata Oluştu!");
   }
      
      System.out.print("Çin Zodyağı Burcunuz : "+zodyak);
    
     }
     
     }
  
