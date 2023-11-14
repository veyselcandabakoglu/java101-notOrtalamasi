import java.util.*;

public class Main {
    
    static boolean isPalindrom(int number) {
      
      int temp = number, reverseNumber = 0, lastNumber;
      
      while(temp != 0) {
        lastNumber = temp % 10;
        System.out.println("lastNumber: "+lastNumber);
        reverseNumber = (reverseNumber * 10) + lastNumber;
        System.out.println("reverseNumber :"+reverseNumber);
        temp /= 10;
      }
      if(reverseNumber == number) {
        return true;
      } else {
        return false;
      }
    }
  
    public static void main(String[] args) {
      System.out.print("Message: " + isPalindrom(123321));
     
  }
}