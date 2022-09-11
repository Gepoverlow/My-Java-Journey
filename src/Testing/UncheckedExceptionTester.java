package Testing;

public class UncheckedExceptionTester {

    int firstNumber;
    int secondNumber;

    public UncheckedExceptionTester (int a, int b) {

        firstNumber = a;
        secondNumber = b;

    }

    public static void main(String[] args) {

        UncheckedExceptionTester testerObject = new UncheckedExceptionTester(7, 0);
        int dividedNumber = testerObject.divide(testerObject.firstNumber, testerObject.secondNumber);
        System.out.println(dividedNumber);

    }

    public int divide(int a, int b){

        return  a / b;

    }

}
