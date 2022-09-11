package Testing;

class MyUserException extends Exception {
    public MyUserException (String s) {

        // Call constructor of parent class 'Exception'
        super(s);

    }
}

public class ExceptionTester {
    public static void main(String[] args) {
        try {

            throw new MyUserException("Here would a description of the exception go");

        } catch (MyUserException example) {

            System.out.println("Exception caught");
            System.out.println(example.getMessage());

        }
    }
}
