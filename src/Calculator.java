import java.util.Scanner;

public class Calculator {

    public static void runCalculator(){

        Scanner console = new Scanner(System.in);

        System.out.println("Pick first number");
        int numberOne = console.nextInt();

        System.out.println("Choose an Operator:");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");

        int operatorId = console.nextInt();

        System.out.println("Pick the second number");
        int numberTwo = console.nextInt();

        System.out.println("The result of your calculation is " + handleCalculation(numberOne, operatorId, numberTwo));

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

}
