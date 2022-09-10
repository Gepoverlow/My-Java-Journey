class StaticVariableTester {

    //Declared static variable
    public static String staticVariable = "Hello World - static variable edition";

    public static void main (String[] args) {

        //staticVariable variable can be accessed without object creation
        //Displaying O/P
        //GFG.geek --> using the static variable
        System.out.println("Version : "+StaticVariableTester.staticVariable);

    }

}
