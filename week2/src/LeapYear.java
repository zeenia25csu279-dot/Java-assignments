import java.util.Scanner;

public class LeapYear {

    public void IsLeapYear() {
     Scanner input = new Scanner(System.in);
     
     System.out.println("(Enter the year to check)");
     int year = input.nextInt();

     if(year % 400== 0 ){
        System.out.println("Its a leap year");
     }
     else {
        System.out.println("(Not a leap year)");
     }
     input.close();
    }
    
}
