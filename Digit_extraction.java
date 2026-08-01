import java.util.Scanner;

public class Digit_extraction {

      public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.println("Enter the three digit number");
         int number = input . nextInt();

         int Hundreds = number / 100;
         int Tens = (number % 100 ) / 10;
         int Ones = number % 10;

         System.out.println("Hundreds = " + Hundreds);
         System.out.println("Tens = " + Tens);
         System.out.println("Ones = " + Ones);

         input.close();
      }

      }


