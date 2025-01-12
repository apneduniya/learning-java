public class operators {
    public static void main(String[] args) {
        // Arithmatic Operators
        int a = 2, b = 2;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Relations Operators || value by default is either true or false
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);

        // Logical Operator
        // `&&` is and || i.e. true && true = true
        // `||` is or || i.e. true || false = true
        // `!` is not || i.e. !true = false

        System.out.println(true && false);
        System.out.println(false || false);
        System.out.println(!true);
    }
}

/*
 * NOTES:
 * 
 * 1. Single equal to `=` is called Assignment Operator
 * 2. The assignemt is done from right to left.
 */
