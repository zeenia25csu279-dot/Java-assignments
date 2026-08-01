import java.util.Scanner;

public class Arithemetic_calculator {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);

        System.out.println("Enter the num1");
        int num1 = input.nextInt();

        System.out.println(".(Enter the num2)");
        int num2 = input.nextInt();
        
        System.out.println("sum = " +(num1 + num2));
        System.out.println("Diff =" +(num1 - num2));
        System.out.println("product = " +(num1 * num2));
        
        if (num2 !=0) {
            System.out.println("Quotient =" + (num1 / num2));
            System.out.println("Remainder =" +(num1 % num2));
        }
        else {
            System.out.println("Quotient = number cannot be divide by zero");
            System.out.println("Remainder = number cannot be divided by zero");
        }
        input.close();
    }

}
    

