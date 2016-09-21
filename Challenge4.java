package challenge.pkg4;
import java.util.Scanner;
public class Challenge4 {

    public static void main(String[] args) {
     Scanner myScanner = new Scanner(System.in);
     
        System.out.println("Please enter a number?");
        
        int num = myScanner.nextInt();
        
          if (num>100) {
            System.out.println("Your number is larger than 100");
        }else{
            System.out.println("Your number is below 100");
    }
    }
}