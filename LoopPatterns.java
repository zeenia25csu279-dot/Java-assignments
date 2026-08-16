import java.util.Scanner;

public class LoopPatterns {

    // Pattern A: Rectangle of stars
    static void patternA(int size) {

        for (int row = 1; row <= size; row++) {

            for (int column = 1; column <= size; column++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // Pattern C: Number triangle
    static void patternC(int size) {

        for (int row = 1; row <= size; row++) {

            for (int column = 1; column <= row; column++) {
                System.out.print(column + " ");
            }

            System.out.println();
        }
    }

    public void PrintPatterns() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = input.nextInt();

        // Reject size less than 1
        if (size < 1) {
            System.out.println("Invalid size");
            input.close();
            return;
        }

        System.out.println("\nPattern A:");
        patternA(size);

        System.out.println("\nPattern C:");
        patternC(size);

        input.close();
    }
}
