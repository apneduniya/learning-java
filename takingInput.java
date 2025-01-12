import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int a = inputScanner.nextInt();

        System.err.print("Enter second num: ");
        int b = inputScanner.nextInt();


        System.err.printf("The sum of your num is %d \n", a + b);
        inputScanner.close();
    }
}


