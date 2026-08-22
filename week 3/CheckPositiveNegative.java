public class CheckPositiveNegative {
    public static void main(String[] args) {
        
        int[] numbers = {1,0,23,4,-3,-2,-9,0};

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for(int i = 0; i < numbers.length; i++){
            
            if(numbers[i] > 0){
                System.out.println(numbers[i] + "is positive");
                positive++;
            }
            else if (numbers[i] < 0 ){
                System.out.println(numbers[i] + "is negative");
                negative++;
            }
            else{
                System.out.println(numbers[i] +" is zero");
                zero++;
            }

        }
        System.out.println("Positive = " + positive);
        System.out.println("Negative =" + negative);
        System.out.println("Zero =" + zero);
    }
    }
