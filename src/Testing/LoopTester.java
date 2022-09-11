package Testing;

public class LoopTester {
    int x;
    int y;

    public LoopTester(int firstNumber, int secondNumber) {

        x = firstNumber;
        y = secondNumber;

    }

    public static void main(String[] args) {

        LoopTester loopObject = new LoopTester(5, 10);
        // loopObject.whileLoopMethod(loopObject.x, loopObject.y);
        loopObject.forLoopMethod(loopObject.x, loopObject.y);

    }

    public void whileLoopMethod(int a, int b){

            while (a < b) {

                System.out.println(a);
                a++;

            }

    }

    public void forLoopMethod(int a, int b){

        for (int i = 0; i <= b; i++){

            System.out.println(a);
            a++;

        }

    }
}
