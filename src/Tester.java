class AppRunner {

    public static void main(String[] args) {

        try{

            ExamplePrinter exampleObject = new ExamplePrinter();

            exampleObject.printExample();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

}

class ExamplePrinter {

    String example = "Hello World - example version";

    public void printExample(){

        System.out.println(example);

    }

}