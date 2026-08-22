
public class ArrayBasics2 {
    public static void main(String[] args) {
/*        
        Scanner input = new Scanner(System.in);

        int [] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++){
            System.out.println("Enter the number");
            numbers [i] = input.nextInt();
        }
        System.err.println("The numbers in arrays are");
        WE DONT NEED INPPUT FROM UDER IN ARRAYS
*/

        int sum = 0;
        int[] numbers = {10, 20, 30, 40, 50};
        for( int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
       System.out.println("Reversed array is");
        for (int i = numbers.length - 1; i>= 0;i--) {
            System.out.println(numbers[i]);
            
        }
        //input.close();
    }
    
}
