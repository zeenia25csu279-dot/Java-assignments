public class ArrayStatics {
    public static void main(String[] args) {
        
        int[]values = {-2,-5,-8,0,2,5,8,10};

        if(values.length == 0){
            System.out.println("Array is empty");
            return;
        }
        int sum = 0;
        for(int i = 0; i < values.length; i++){
            sum = sum + values[i];
        }
        System.out.println("Sum =" +sum);

        double average = 0;
        for(int i  = 0; i < values.length; i++){
             average = (double)sum / values.length;
        }
        System.out.println("Average =" +average);
    }
    
}
