import java.util.Scanner;

public class BitMaskUtility {

    // Check whether a bit is set (1)
    static boolean isBitSet(int number, int position) {
        return (number & (1 << position)) != 0;
    }

    // Set a bit to 1
    static int setBit(int number, int position) {
        return number | (1 << position);
    }

    // Clear a bit to 0
    static int clearBit(int number, int position) {
        return number & ~(1 << position);
    }

    // Toggle a bit (0 -> 1 or 1 -> 0)
    static int toggleBit(int number, int position) {
        return number ^ (1 << position);
    }

    // Convert number to 32-bit binary
    static String toBinary32(int number) {
        return String.format("%32s", Integer.toBinaryString(number))
                .replace(' ', '0');
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        System.out.print("Enter bit position (0-31): ");
        int position = input.nextInt();

        // Validate bit position
        if (position < 0 || position > 31) {
            System.out.println("Invalid bit position. Enter a value from 0 to 31.");
            input.close();
            return;
        }

        System.out.println("\nChoose operation:");
        System.out.println("1. Check bit");
        System.out.println("2. Set bit");
        System.out.println("3. Clear bit");
        System.out.println("4. Toggle bit");

        System.out.print("Enter choice: ");
        int choice = input.nextInt();

        int result = number;

        System.out.println("\nBefore:");
        System.out.println("Decimal : " + number);
        System.out.println("Binary  : " + toBinary32(number));

        switch (choice) {

            case 1:
                System.out.println("\nBit " + position + " is set: "
                        + isBitSet(number, position));
                break;

            case 2:
                result = setBit(number, position);
                break;

            case 3:
                result = clearBit(number, position);
                break;

            case 4:
                result = toggleBit(number, position);
                break;

            default:
                System.out.println("Invalid operation.");
                input.close();
                return;
        }

        if (choice != 1) {
            System.out.println("\nAfter:");
            System.out.println("Decimal : " + result);
            System.out.println("Binary  : " + toBinary32(result));
        }

        input.close();
    }
}