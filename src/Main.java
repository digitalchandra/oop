import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //this scanner hold the data
        Scanner myObj = new Scanner(System.in);
        // send the message to the user for input data

        System.out.println("Please inter a word");

        String anyword = myObj.nextLine();
        //Out

        System.out.println("Hello =>"+anyword);

    }
}