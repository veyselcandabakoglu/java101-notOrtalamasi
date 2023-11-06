import java.util.*;


public class Main {
    public static void main(String[] args) {
     
   int year,mode1,mode2,mode3;
   
   Scanner input = new Scanner(System.in);
   
   System.out.println("Yıl Giriniz : ");
   year = input.nextInt();
   mode1 = year % 100;
   
   
   if(mode1 == 0) {
     mode2 = year % 400;
     if(mode2 == 0) {
       System.out.println(year+ " bir artık yıldır !");
     } else {
       System.out.println(year+ " bir artık yıl değildir !");
     }
   } else {
     mode3 = year % 4;
     if(mode3 == 0) {
       System.out.println(year+ " bir artık yıldır !");
     } else {
       System.out.println(year+ " bir artık yıl değildir !");
     }
   }
    
     }
     
     }
  
