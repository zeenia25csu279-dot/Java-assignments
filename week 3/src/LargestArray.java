 class LargestArray {
    public static void main(String[] args) {
        
        int [] numbers = {5,10,15,20,25};

        int largest = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers [i] > largest){
                largest = numbers[i];
            }

        }
        System.out.println("Largest =" + largest);

        int smallest = numbers [0];

      for (int i = 0; i < numbers.length; i++){
        if (numbers[i] < smallest){
            smallest = numbers[i];
        }
      }  
      System.out.println("Smallest =" + smallest );
    }
    
}
