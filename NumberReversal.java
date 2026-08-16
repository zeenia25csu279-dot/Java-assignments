import java.util.Scanner;

public class NumberReversal {
   static int ReverseNumber(int number){

    int reversed = 0;

    while (number !=0){

        int digit = number % 10;
        reversed = reversed * 10 + digit;
        number = number / 10;
    }
    return reversed;
}

    public void PrintReversedNumber(){
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the number");
        int number = input.nextInt();

        int result = ReverseNumber(number);

        System.out.println("Reverse Number = " +result);

        
    input.close();
        
    }
   }
    

