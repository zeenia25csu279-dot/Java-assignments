import java.util.Scanner;

public class NumberAnalyzer {

    // Reads a number from the user
    static int readNumber(Scanner input) {
        System.out.print("Enter an integer: ");
        return input.nextInt();
    }

    // Checks whether the number is even
    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Checks whether the number is positive
    static boolean isPositive(int number) {
        return number > 0;
    }

    // Returns the absolute value
    static int absoluteValue(int number) {
        return Math.abs(number);
    }

    // Counts the number of digits
    static int countDigits(int number) {

        // Special case for 0
        if (number == 0) {
            return 1;
        }

        int count = 0;

        while (number > 0) {
            number = number / 10;
            count++;
        }

        return count;
    }

    // Adds all the digits
    static int sumDigits(int number) {

        if (number == 0) {
            return 0;
        }

        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        return sum;
    }

    // Prints the final report
    static void printReport(
            int number,
            boolean even,
            boolean positive,
            int digitCount,
            int digitSum) {

        System.out.println("\n--- Number Analysis ---");
        System.out.println("Number: " + number);
        System.out.println("Even: " + even);
        System.out.println("Positive: " + positive);
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Sum of digits: " + digitSum);
    }

    public static void main(String[] args) {

        // 1. Create Scanner
        Scanner input = new Scanner(System.in);

        // 2. Read number
        int number = readNumber(input);

        // 3. Check even
        boolean even = isEven(number);

        // 4. Check positive
        boolean positive = isPositive(number);

        // 5. Get absolute value
        int absolute = absoluteValue(number);

        // 6. Count digits
        int digitCount = countDigits(absolute);

        // 7. Sum digits
        int digitSum = sumDigits(absolute);

        // 8. Print report
        printReport(number, even, positive, digitCount, digitSum);

        // 9. Close Scanner
        input.close();
    }
}