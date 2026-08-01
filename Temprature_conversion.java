import java.util.Scanner;

public class Temprature_conversion {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temprature in celsius");
        double celsius = input . nextDouble();

        System.out.println("fahrenheit = " +(celsius * 9.0 / 5.0 + 32.0));

        input.close();

    }

}