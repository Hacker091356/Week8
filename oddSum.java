//Imports
import java.util.Scanner;

public class oddSum{
    public static void main(String[] args){
        //Initializing scanner
        Scanner userInput = new Scanner(System.in);
        //Asking the user for input
        System.out.print("Enter a number: ");
        int num = userInput.nextInt();
        //Closing scanner
        userInput.close();
        System.out.print("1 + ");
        int sum = 1;
            for (int i =3; i <= num; i+=2){
            sum = sum + i;
            if (i == num)
            {
            System.out.print(i + "; Ans = " + sum);
            }
            else
            {   
                System.out.print(i + " + ");
            }
    }
    }
}