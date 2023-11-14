import java.util.Scanner;

public class Main {
  public static void main(String[] args) { 
    
    int bigNumber,smallNumber, counter = 1, ebob=1,ekok;
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("n1 sayisini giriniz: ");
    int n1 = input.nextInt();
    
    System.out.print("n2 sayisini giriniz: ");
    int n2 = input.nextInt();
    
    if(n1 > n2) {
      bigNumber = n1;
      smallNumber = n2;
    } else {
      bigNumber = n2;
      smallNumber = n1;
    }
    
    while(counter <= smallNumber) {
      if(smallNumber % counter == 0 && bigNumber % counter == 0) {
        ebob = counter;
      }
      counter++;
    }
    
    System.out.print("ebob: "+ebob);
    
    ekok = (smallNumber*bigNumber)/ebob;
    System.out.println("ekok: "+ekok);
    
  }
}