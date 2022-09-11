package Testing;// Importing I/O classes
// Java I/O (Input and Output) is used to process the input and produce the output.
// Java uses the concept of a stream to make I/O operation fast. The java.io package contains all the classes required for input and output operations.
// We can perform file handling in Java by Java I/O API.
import java.io.*;

public class CheckedExceptionTester {

    public static void main(String[] args)  throws IOException {

        // Reading file from path in local directory
        FileReader file = new FileReader("Assets/example.txt");

        // Creating object as one of ways of taking input
        BufferedReader fileInput = new BufferedReader(file);

        // Printing first 3 lines of file "example.txt"
        for(int i = 0; i < 3; i++) {

            System.out.println(fileInput.readLine());

        }

        // To avoid memory leak, we close the fileInput
        fileInput.close();

    }

}
