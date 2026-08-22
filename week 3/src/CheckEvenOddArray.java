public class CheckEvenOddArray {
    public static void main(String[] args) {
        
        int [] numbers = {2,4,5,7,9,1};

        int even = 0;
        int odd = 0;

        for(int i = 0; i < numbers.length; i++){
            if (numbers [i] % 2 == 0){
              even++;
              System.out.println(numbers[i] +"is even");
            }
            else{
                odd++;
                System.out.println(numbers[i] +"is odd");
            }
        }

        System.out.println("Even =" + even);
        System.out.println("Odd =" + odd);
    }
}
