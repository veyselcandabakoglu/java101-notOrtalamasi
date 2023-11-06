import java.util.*;


public class Main {
    public static void main(String[] args) {
     
   int distance,age,type;
   double wagePerKm= 0.10, normalWage, discountedWage;
   
   Scanner input = new Scanner(System.in);
   
   System.out.println("Mesafefi giriniz(KM)= ");
   distance = input.nextInt();
   
   System.out.println("Yaşınızı giriniz= ");
   age = input.nextInt();
   
   System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) = ");
   type = input.nextInt();
   
   if(distance > 0 && age > 0 && (type == 1 || type == 2)) {
     normalWage = distance*wagePerKm;
     // System.out.println("Normal ücret= "+normalWage + " TL");
      if(age < 12) {
        if(type == 1) {
          discountedWage = normalWage*0.50;
          System.out.println("Toplam ücret= "+discountedWage + " TL");
        } else {
          discountedWage = (normalWage*0.5)*2;
          System.out.println("Toplam ücret= "+discountedWage + " TL");
        }
        
      } else if(age >= 12 && age <= 24) {
        if(type == 1) {
            discountedWage = normalWage - normalWage*0.10;
            System.out.println("Toplam ücret= "+discountedWage + " TL");
        } else {
            discountedWage = (normalWage - normalWage*0.10)*2;
            System.out.println("Toplam ücret= "+discountedWage + " TL");
        }
      
      } else if(age >= 65) {
         if(type == 1) {
            discountedWage = normalWage - normalWage*0.30;
            System.out.println("Toplam ücret= "+discountedWage + " TL");
        } else {
            discountedWage = (normalWage - normalWage*0.30)*2;
            System.out.println("Toplam ücret= "+discountedWage + " TL");
        }
      } else {
          if(type == 1) {
            System.out.println("Toplam ücert= "+ normalWage);
          } else {
            System.out.println("Toplam ücert= "+ normalWage*2 +" TL");
          }
      } 
   } else {
     System.out.println("Hatalı Veri Girdiniz !");
   }
      
    
     }
     
     }
  
