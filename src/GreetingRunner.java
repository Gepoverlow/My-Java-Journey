import java.util.Scanner;

public class GreetingRunner {

    public static void receiveGreetingTo(String name, int age) {

        System.out.println("Nice to meet you " + name + ", of age " + age);

    }
    public static void talkToTheConsole() {
        Scanner console = new Scanner(System.in);
        String name;
        int age;

        System.out.println("What is your name?");
        name = console.nextLine();

        System.out.println("Hello " + name + ", what is your age?");

        while (!console.hasNextInt()) {
            System.out.println("Please enter a valid age");
            console.nextLine();
        }
        age = console.nextInt();

        System.out.println("Nice to meet you " + name + ", of age " + age);
    };
}
