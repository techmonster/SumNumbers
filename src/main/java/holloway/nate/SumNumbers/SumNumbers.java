package holloway.nate.SumNumbers;

import java.util.Scanner;

/**
 * Created by nathanielholloway on 9/9/16.
 * This program displays the sum of all numbers 1 through n
 */
public class SumNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Logic theLogic = new Logic();
        Display theDisplay = new Display();


        theDisplay.print("Enter a number...");
        int num = input.nextInt();
        theDisplay.print("The answer is: "+ theLogic.sumAllNumbers(num));

    }
}
