import java.util.Scanner;

public class FinalValueOperations {
    public static void PrintOperations() {

        Scanner input = new Scanner(System.in);
        
        int x = 0;

        System.out.println("Enter the number of operations");
        int n = input.nextInt();


        input.nextLine();

        for(int i = 0; i < n; i++) {
              System.out.print("Enter operation " + i + ": ");
            String operation = input.nextLine();

            if (operation.contains("+")) {
                x++;
            } else {
                x--;
            }
        }

        System.out.println("Final value of X = " + x);

        input.close();

       }
     }

