import java.util.Scanner;
public class Simple_interest {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principal");
        double principal = input.nextDouble();

        System.out.println("Enter the rate");
        double rate = input.nextDouble();

        System.out.println("Enter the time");
        double time = input.nextDouble();

        double Simple_interest = (principal*rate*time)/100;
        System.out.println("Simple interest =" +(Simple_interest));
        
        double final_amount = Simple_interest + principal;
        System.out.println("final_amount =" +(final_amount));

        input.close();
    }
}
