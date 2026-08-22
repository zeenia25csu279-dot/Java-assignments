public class SearchArray {
    public static void main(String[] args) {
        
        int[]numbers = {10,20,30,40,50};

        int search = 30;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == search){
                found = true;
                System.out.println(search + "found");
            }
        }

        if(found == false)
        {
            System.out.println(  search + "not found");
        }
        
        //System.out.println("Search =" + search);
    }
    
}
