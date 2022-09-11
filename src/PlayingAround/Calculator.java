package PlayingAround;

import java.util.Scanner;

public class Calculator {

    public static void runCalculator(){

        Scanner console = new Scanner(System.in);
        int numberOne;
        int operatorId;
        int numberTwo;


        System.out.println("Pick first number");
        numberOne = console.nextInt();
        console.nextLine();

        System.out.println("Choose an Operator:");
        printOptions();

        while (!console.hasNextInt()) {

            System.out.println("Please select a number that corresponds to an operator:");
            printOptions();
            console.nextLine();

        }

        do {

                operatorId = console.nextInt();

            if(!validateOperatorInput(operatorId)){

                System.out.println("Please enter a valid operator:");
                printOptions();

            }

        } while(!validateOperatorInput(operatorId));


        System.out.println("Pick the second number");
        numberTwo = console.nextInt();

        System.out.println("Result:  " + handleCalculation(numberOne, operatorId, numberTwo));

    }

    public static String handleCalculation(int num1, int operandInput, int num2){

        String result;

        switch (operandInput){

            case 1:
                result = sum(num1, num2);
            break;
            case 2:
               result = subtract(num1, num2);
            break;
            case 3:
               result = multiply(num1, num2);
            break;
            case 4:
                result = divide(num1, num2);
            break;
            default:
               result = "impossible";

        }

        return result;

    };

    public static String sum(int firstNumber, int secondNumber){

        return Integer.toString(firstNumber + secondNumber) ;

    }

    public static String subtract(int firstNumber, int secondNumber){

        return Integer.toString(firstNumber - secondNumber) ;

    }

    public static String multiply(int firstNumber, int secondNumber){

        return Integer.toString(firstNumber * secondNumber) ;

    }

    public static String divide(int firstNumber, int secondNumber){

        if(secondNumber == 0){

            return "You cant divide by 0";

        } else {

            String result = Integer.toString(firstNumber / secondNumber);
            return result;

        }
    }

    public static boolean validateOperatorInput(int input) {

        return input == 1 || input == 2 || input == 3 || input == 4;

    }

    public static void printOptions(){

        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");

    }

}
