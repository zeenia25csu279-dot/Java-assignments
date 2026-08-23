
import java.util.Scanner;

public class GradingSystem {

    public void PrintGrades() {
      Scanner input = new Scanner (System.in);

      System.out.println("(Enter the marks)");
      int marks = input.nextInt();
      
      if(marks >= 80 && marks <= 100){
        System.err.println("Distinction");
      }
      else if (marks >= 70 && marks < 80){
        System.out.println("(Merit)");
      }
      else if (marks >= 50 && marks < 70){
        System.out.println("(Pass)");
      }
      else if (marks >=0 && marks < 50){
        System.out.println("(Fail)");
      }
      else {
        System.out.println("(Invalid marks)");
      }

      input.close();

        
    }
    
}

