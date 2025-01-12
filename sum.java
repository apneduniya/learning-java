// Write a code in java to take 3 variables and find the sum, difference, product, quotient and remainder

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int a, b, c;
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the first num: ");
        a = inputScanner.nextInt();
        System.out.print("Enter the second num: ");
        b = inputScanner.nextInt();
        System.out.print("Enter the thrid num: ");
        c = inputScanner.nextInt();

        System.out.printf("The sum of a, b and c is %d\n", a + b + c);
        System.out.printf("The difference of a and b is %d\n", a - b);
        System.out.printf("The product of a, b and c is %d\n", a * b * c);
        System.out.printf("The quotient of a and b is %d\n", a / b);
        System.out.printf("The remainder of a and b is %d\n", a % b);

        inputScanner.close();

    }
}
