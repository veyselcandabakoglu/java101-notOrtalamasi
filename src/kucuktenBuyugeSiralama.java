import java.util.*;


public class Main {
    public static void main(String[] args) {
     
   int a,b,c;
   
   Scanner input = new Scanner(System.in);
   a = input.nextInt();
   b = input.nextInt();
   c = input.nextInt();
   
   System.out.println("Üç Sayı Giriniz:");
   
   if((a<b) && (a<c)) {
     if(b<c) {
       System.out.println("Sıralama= " + a +" < " +b +" < "+c);
     }  else
       System.out.println("Sıralama= " + a +" < " +c +" < "+b);
   } 
   
   else if((b<a) && (b<c)) {
     if(a<c) {
       System.out.println("Sıralama= " + b +" < " +a +" < "+c);
     }   else {
         System.out.println("Sıralama= " + b +" < " +c +" < "+a);
       }
   }  
   
      else if((c<a) && (c<b)) {
     if(b<a) {
       System.out.println("Sıralama= " + c +" < " +b +" < "+a);
     }    else {
         System.out.println("Sıralama= " + c +" < " +a +" < "+b);
       }
   } 

      
    
     }
     
     }
  
