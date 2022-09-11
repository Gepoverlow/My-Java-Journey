package Testing;

class InstanceVariableTester {

    public String exampleString; // Declare Instance Variable

    public InstanceVariableTester() { // Default Constructor

        this.exampleString = "Hello World - variable edition"; // initializing Instance Variable

    }
    //PlayingAround.Main Method
    public static void main(String[] args) {

        // Object Creation
        InstanceVariableTester exampleObject = new InstanceVariableTester();
        // Displaying O/P
        System.out.println("Version: " + exampleObject.exampleString);

    }
}
