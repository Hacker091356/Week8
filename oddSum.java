//Imports
import java.util.Scanner;

public class oddSum{
    public static void main(String[] args){
        //Initializing scanner
        Scanner userInput = new Scanner(System.in);
        //Asking the user for input
        System.out.print("Enter a number: ");
        int sum = 1;
        int num = userInput.nextInt();
            for (int i =3; i <= num; i++){
            sum = sum + i;
            if (i == num)
            {
            System.out.print(i + "; Ans = " + sum);
            }
            else
            {
                System.out.print(i +"+");
            }
    }
}