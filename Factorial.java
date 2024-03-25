//Importing scanner
import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        //Initializing scanner
        Scanner userInput = new Scanner(System.in);
        //Asking the user for input
        System.out.print("Enter a number: ");
        int factorial = 1; 
        int num = userInput.nextInt();
        //Closing scanner
        userInput.close();
        //initializing variable for factorial 
    
        for (int i =1; i <= num; i++){
            factorial = factorial * i;
            if (i == num)
            {
            System.out.print(i + "; Ans = " + factorial);
            }
            else
            {
                System.out.print(i +"*");
            }
            

        
            
        }
        
    }
}