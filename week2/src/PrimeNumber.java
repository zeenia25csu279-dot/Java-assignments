import java.util.Scanner;

public class PrimeNumber {
    public void IsPrimeNumber() {
        Scanner input = new Scanner(System.in);

        System.err.println("Enter the number");
        int number = input.nextInt();

        boolean isprime = true;

        if (number <= 1) {
            isprime = false;
        }

        for (int i = 2; i<number; i++) {
            if (number % i == 0) {
                isprime = false;
                break;
            }
        }
        if(isprime){
            System.out.println(".(Yes,the number is prime)");
        }
        else{
            System.out.println(".(This is not a prime number)");
        }
        input.close();

    }
}
