import java.util.Scanner;

public  class scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the length");
        int length = input.nextInt();

        System.out.println("Enter the breadth");
        int breadth = input.nextInt();

        System.out.println("Area" + (length*breadth));
        System.out.println("Perimeter" + (2*(length + breadth)));

        input.close();
    }
}