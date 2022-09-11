package Testing;

import java.util.Scanner;

public class MethodTester {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Pick the first number");
        int firstNumber = console.nextInt();

        System.out.println("Pick the second number");
        int secondNumber = console.nextInt();

        int result = calculateSumOfTwoNumbers(firstNumber, secondNumber);

        System.out.println("The sum of those numbers is: " + result);

    }

    public static int calculateSumOfTwoNumbers(int numberOne, int numberTwo){

        //This method should return an int as indicated on the method declaration.
        return numberOne + numberTwo;

    }
}
