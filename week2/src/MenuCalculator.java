import java.util.Scanner;

public class MenuCalculator {

    public void PrintMenu() 
    {
        Scanner input = new Scanner(System.in);

        int Choice;

        do
        {            

            System.out.println("\n---Calculator Menu");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("0. Exit ");

            System.out.println("Enter your choice");
            Choice = input.nextInt();

            if(Choice != 0)
            {
                System.out.println("Enter the first number");
                int FirstNumber =  input.nextInt();

                System.out.println("Enter the second number");
                int SecondNumber = input.nextInt();

                switch (Choice) {
                    case 1 :
                        System.out.println(FirstNumber + SecondNumber);
                        break;
                    case 2:
                        System.out.println(FirstNumber - SecondNumber);
                        break;
                    case 3:
                        System.out.println(FirstNumber * SecondNumber) ;
                        
                    case 4:
                        System.out.println(FirstNumber / SecondNumber) ;
                    
                }
            }
        }
        while(Choice != 0);
        

        input.close();

    }

}
