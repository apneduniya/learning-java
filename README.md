# Learning Java

## 1. Write a program in Java to sort an array in ascending order.

```java
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        Arrays.sort(arr);

        System.out.println(“Sorted array: “ + Arrays.toString(arr));
    }
}
```

## 2. What is a Thread? How Many Ways Can We Create Threads?

A thread is a lightweight unit of execution within a process. It allows a program to perform multiple tasks concurrently. There are two primary ways to create threads in Java:
- **Extending the Thread class**: Create a new class that extends the Thread class and override its `run()` method.
```java
// Example just for understanding

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
```
- **Implementing the Runnable interface**: Create a new class that implements the Runnable interface and implement its `run()` method.
```java
// Example just for understanding

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
```

## 3. Explain each word in the statement: `public static void main(String[] args)`

- **public**: The __main method__ can be accessed from anywhere.
- **static**: The __main method__ belongs to the class itself and not to any specific object.
- **void**: The __main method__ does not return any value.
- **main**: The entry point of the Java program.
- **String[] args**: An array of strings used to pass command-line arguments to the program.

## 4. Difference Between Abstract Class and Interface

| Feature           | Abstract Class                                                                 | Interface                                                                 |
|-------------------|-------------------------------------------------------------------------------|--------------------------------------------------------------------------|
| Definition        | A class that contains at least one abstract method (a method without a body)  | A blueprint for a class that contains only abstract methods (no method implementations) |
| Fields            | Can have both abstract and non-abstract methods and fields                    | Can only have constants (final static variables) and abstract methods    |
| Inheritance       | A class can extend only one abstract class                                    | A class can implement multiple interfaces                                |
| Access Modifiers  | Can have any access modifier (public, protected, default, private)            | Can only have public and default access modifiers                        |
| Example           | `abstract class Shape { … }`                                                  | `interface Drawable { … }`                                               |

## 5. Write a program in JAVA to print the following pattern: 
```
*
**
***
****
*****
```

Solution:

```java
import java.util.Scanner;

public class PrintPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        scanner.close();
    }
}
```

## 6. Define constructor and state its role. Explain by a java program.

A constructor is a special method in Java that is automatically called when an object of a class is created. It is used to initialize the object’s fields with appropriate values.

```java
public class Student {
    String name;
    int age;

    // Constructor
    // Notice that the constructor has the same name as the class
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 25);

        System.out.println(student1.name + ", " + student1.age);
        System.out.println(student2.name + ", " + student2.age);
    }
}
```

## 7. Explain `final` keyword in java and write at least three purposes of using the keyword.

The `final` keyword in Java is used to make a variable, method, or class immutable. Here are some purposes of using `final`:
- **Making variables constant**: When a variable is declared as `final`, its value cannot be changed after it is initialized.
- **Preventing method overriding**: When a method is declared as `final`, it cannot be overridden by subclasses.
- **Preventing class inheritance**: When a class is declared as `final`, it cannot be inherited by other classes.

Example:
```java
final class Circle {
    final double PI = 3.14159;
    final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    final double area() {
        return PI * radius * radius;
    }
}
```

## 8. Write a Java Program to implement multilevel inheritance.

```java
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class GermanShepherd extends Dog {
    void guard() {
        System.out.println("German Shepherd guards");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        GermanShepherd germanShepherd = new GermanShepherd();
        germanShepherd.eat();
        germanShepherd.bark();
        germanShepherd.guard();
    }
}
```

## 9. Write a Java Program to catch multiple exceptions using try-catch block.

```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input");
        }
    }
}
```

## 10. Describe `Access Specifiers` in brief in Java with suitable example.

Access specifiers in Java control the visibility of classes, methods, and variables. There are four access specifiers:
- **public**: Accessible from anywhere.
- **protected**: Accessible within the same package and by subclasses in other packages.
- **default**: Accessible within the same package.
- **private**: Accessible only within the same class.

```java
public class MyClass {
    public int publicVariable; // Accessible from anywhere
    protected int protectedVariable; // Accessible within the same package and by subclasses
    int defaultVariable; // Accessible within the same package
    private int privateVariable; // Accessible only within the same class
}
```

## 11. Demonstrate using a program how we can create a user defined exception.

```java
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        int age = 15;

        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be greater than or equal to 18");
            }

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

## 12. Frame a class `Box` which contains length, breadth and width as data members. This class should contain a method `volume()` which will compute volume of a box. Write a program in Java that will create two objects of Box class and calculate the volume.

```java
class Box {
    double length;
    double breadth;
    double width;

    public Box(double length, double breadth, double width) {
        this.length = length;
        this.breadth = breadth;
        this.width = width;
    }

    public double volume() {
        return length * breadth * width;
    }
}

public class BoxVolume {
    public static void main(String[] args) {
        Box box1 = new Box(5, 4, 3);
        Box box2 = new Box(10, 8, 6);
        System.out.println("Volume of box1: " + box1.volume());
        System.out.println("Volume of box2: " + box2.volume());
    }
}
```

## 13. Why is Java called a platform-independent language? What is bytecode?

- **Platform Independence**: Java is platform-independent because it uses a concept called "write once, run anywhere". When you compile Java code, it generates an intermediate code called "bytecode".
- **Bytecode**: Bytecode is an instruction set for the Java Virtual Machine (JVM). The JVM interprets and executes this bytecode on any platform that has a JVM installed. 

## 14. Explain mutable and immutable strings. State differences between the `equals(`) method present in the String class in Java and `==` operator.

- **Mutable Strings**: Mutable strings can be modified after they are created. In Java, the `StringBuilder` and `StringBuffer` classes represent mutable strings.
```java
// Example just for understanding

StringBuilder mutableStr = new StringBuilder("Hello");
mutableStr.append(" World");
System.out.println(mutableStr); // Output: Hello World
```
- **Immutable Strings**: Immutable strings cannot be changed once they are created. In Java, the `String` class represents immutable strings.
```java
// Example just for understanding

public class ImmutableStringExample {
    public static void main(String[] args) {
        String str = "Hello";
        str.concat(" World");
        System.out.println(str); // Output: Hello

        String newStr = str.concat(" World");
        System.out.println(newStr); // Output: Hello World
    }
}
```

### `equals()` vs. `==`

- **equals()**: Compares the content of two strings. It returns true if the strings have the same characters in the same order.
- **==**: Compares the memory addresses of two strings. It returns true only if both strings refer to the same object in memory.

```java
String str1 = "hello";
String str2 = "hello";
String str3 = new String("hello");

System.out.println(str1 == str2); // Output: true (may vary depending on JVM optimization)
System.out.println(str1 == str3); // Output: false
System.out.println(str1.equals(str2)); // Output: true
System.out.println(str1.equals(str3)); // Output: true
```

## 15. Write a Java program to calculate the factorial of a given number.

```java
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
```

## 16. Write a program in Java to show how arguments can be passed from the command line.

```java
public class CommandLineArgs {
    public static void main(String[] args) {
        System.out.println("Number of arguments: " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }
}
```

## 17. Write a program to explain the use of `finally`.

```java
public class FinallyExample {
    public static void main(String[] args) {
        try {
            // Some code that might throw an exception
            int result = 10 / 0; // This will cause an ArithmeticException

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());

        } finally {
            // This block will always execute, even if an exception occurs
            System.out.println("Finally block executed.");
        }
    }
}
```

## 18. What is Constructor Overloading? Explain by a Java program.

Constructor overloading is the ability to define multiple constructors within a class, each with a different set of parameters.

```java
public class Student {
    String name;
    int age;

    // Default constructor
    public Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

## 19. Explain the `super` keyword in Java and write at least three purposes of using the keyword.

The `super` keyword in Java is used to refer to the parent class (superclass) of a subclass. It has several purposes:
- **Calling superclass constructors**: Use `super()` to call a constructor of the superclass from the subclass’s constructor.
- **Accessing superclass members**: Use `super.` to access members (fields and methods) of the superclass when they are hidden by members with the same name in the subclass.
- **Calling superclass methods**: Use `super.methodName()` to call a method of the superclass when you need to override it in the subclass.

## 20. Write a Java program to implement single-level inheritance.

```java
class Animal {
    void eat() {
        System.out.println("Animal eats.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
```

## 21. Write a Java program to show the use of the throws keyword.

```java
import java.io.IOException;

public class ThrowsExample {
    public static void readFile() throws IOException {
        // Code to read a file
    }

    public static void main(String[] args) throws IOException {
        readFile();
    }
}
```

## 22. Demonstrate using a program how we can create a user-defined exception.

```java
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        int balance = 100;
        int withdrawalAmount = 200;
        try {
            if (balance < withdrawalAmount) {
                throw new InsufficientFundsException("Insufficient funds.");
            } else {
                // Process withdrawal
            }
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

## 23. Frame an abstract class `Shape` which contains two double data members and an abstract method `area()`. Frame two derived classes `Rectangle` and `Triangle` (both should inherit `Shape` class) which will implement `area()` method to suit their requirement (to compute area of a rectangle and a triangle respectively). Create `Shape` class reference and dispatch the `area()` method in Rectangle and Triangle class dynamically to compute the area of a rectangle and a triangle.

```java
abstract class Shape {
    double dim1, dim2;

    Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double area();
}

class Rectangle extends Shape {
    Rectangle(double length, double width) {
        super(length, width);
    }

    double area() {
        return dim1 * dim2;
    }
}

class Triangle extends Shape {
    Triangle(double base, double height) {
        super(base, height);
    }

    double area() {
        return 0.5 * dim1 * dim2;
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(10, 5);
        Shape shape2 = new Triangle(10, 5);
        System.out.println("Area of rectangle: " + shape1.area());
        System.out.println("Area of triangle: " + shape2.area());
    }
}
```

## 24. Describe `String` and `StringBuffer` class. State differences between the `equals()` method present in String class in Java and `==` operator.

> _Note: "State differences between the `equals()` method present in String class in Java and `==` operator" has also been answered in question 14._

### String Class
- **Immutable**: Once a String object is created, its value cannot be changed.
- **Used for representing textual data**: Commonly used to store and manipulate textual information.

### StringBuffer Class
- **Mutable**: StringBuffer objects are mutable, meaning you can modify their contents without creating a new object.
- **Efficient for string manipulation**: Designed for situations where you need to frequently modify a string.

### `equals()` vs. `==`

- **equals()**: Compares the content of two String objects.
- **==**: Compares the references of two String objects.

```java
String str1 = "hello";
String str2 = "hello";
String str3 = new String("hello");

System.out.println(str1 == str2); // Output: true (may vary depending on JVM optimization)
System.out.println(str1 == str3); // Output: false
System.out.println(str1.equals(str2)); // Output: true
System.out.println(str1.equals(str3)); // Output: true
```

## 25. Why is Java Called Platform Independent?

> _Note: This question has also been answered in question 13._

Java is called platform-independent due to its use of the Java Virtual Machine (JVM). Here’s how it works:
- **Compilation**: Java code is compiled into bytecode, an intermediate language.
- **JVM Interpretation**: The JVM reads and executes bytecode on any platform with a JVM installed.
- **Platform Independence**: The same Java program can run on any platform with a compatible JVM, making Java highly portable.

## 26. Explain the use of the super keyword in Java.

> _Note: This question has also been answered in question 19._

The `super` keyword in Java has the following primary uses:
- **Accessing superclass members**: Use `super` to access members of the superclass.
- **Calling superclass constructors**: Use `super()` to call a constructor of the superclass.
- **Calling superclass methods**: If a subclass overrides a method from the superclass, you can use `super.methodName()` to call the superclass’s version of the method.
Example:
    ```java
    class Animal {
        void makeSound() {
            System.out.println("Generic animal sound");
        }
    }

    class Dog extends Animal {
        @Override
        void makeSound() {
            super.makeSound(); // Call the superclass’s makeSound() method
            System.out.println("Woof!");
        }
    }
    ```
- **Accessing superclass variables**: If a subclass has a variable with the same name as a variable in the superclass, you can use `super.variableName` to access the superclass’s variable.

Remember that the super keyword cannot be used within a static context.

## 27. What do you mean by compile-time polymorphism?

Compile-time polymorphism, also known as method overloading, is the ability to define multiple methods with the same name but different parameters within a class. The compiler determines which method to call based on the arguments passed at compile time.

```java
// Example just for understanding

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

## 28. What do you mean by JDK, JRE, and JVM?

- **JDK (Java Development Kit)**: A software development kit that provides tools and libraries for developing Java applications.
- **JRE (Java Runtime Environment)**: A runtime environment that includes the JVM and other necessary libraries for running Java applications.
- **JVM (Java Virtual Machine)**: A virtual machine that executes Java bytecode, providing a platform-independent environment for running Java programs.

## 29.  What is the difference between method overloading and method overriding?

- **Method Overloading**: Occurs within the same class. Methods have the same name but different parameters.
- **Method Overriding**: Occurs between a superclass and a subclass. Methods have the same name and parameters.

## 30. Explain Each Word in the Statement: `public static void main(String[] args)`

> _Note: This question has also been answered in question 3._

- **public**: The main method can be accessed from anywhere in the program.
- **static**: The main method is declared as static so that it can be called without creating an instance of the class.
- **void**: The main method does not return any value.
- **main**: The name of the method that the JVM looks for when it starts executing a Java program.
- **String[] args**: The parameter list for the main method. It accepts an array of strings as arguments, which can be used to pass command-line arguments to the program.

## 31. Explain the `static` non-access specifier.

In Java, the `static` keyword can be used with both variables and methods. When a variable is declared as `static`, it becomes a class variable, meaning that it is shared among all instances of the class. When a method is declared as `static`, it becomes a class method, meaning that it can be called without creating an instance of the class.

## 32. Explain single inheritance by a Java program.

> _Note: This question has also been answered in question 20 (but only code part). Explanation is done here._

Single inheritance is a concept in object-oriented programming where a class can inherit from only one other class. In Java, this is achieved using the `extends` keyword.

In this example, the `Dog` class inherits from the `Animal` class. This means that the `Dog` class inherits all the public and protected members of the `Animal` class.
```java
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}
```

## 33. What do you mean by multi-level inheritance?

> _Note: This question has also been answered in question 8 (but only code part). Explanation is done here._

Multi-level inheritance is a concept in object-oriented programming where a class can inherit from another class, which itself inherits from another class. In Java, this is achieved by chaining the `extends` keyword.


In this example, the `GermanShepherd` class inherits from the `Dog` class, which inherits from the `Animal` class.
```java
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

class GermanShepherd extends Dog {
    void guard() {
        System.out.println("Guarding");
    }
}
```

## 34. What do you mean by dynamic method dispatch?

**Dynamic method dispatch** is a concept in object-oriented programming where the method to be called is determined at runtime based on the actual type of the object. This is also known as **polymorphism or late binding**.

In this example, the `animal` variable is of type `Animal`, but it actually refers to a `Dog` object _(see class `Main`)_. When the `makeSound()` method is called, the `Dog` version of the method is executed, not the `Animal` version. This is because the JVM determines the actual type of the object at runtime.
```java
class Animal {
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound(); // Output: Woof!
    }
}
```

## 35. What are the differences between error and exception?

Errors and exceptions are both types of problems that can occur during program execution. However, there are some key differences between them:
- **Errors**: Typically serious problems that cannot be recovered from. They usually indicate a bug in the program or a problem with the system (e.g., `OutOfMemoryError`).
- **Exceptions**: Less serious than errors and can often be handled by the program. They usually indicate a problem that can be resolved or handled in some way (e.g., `IOException`).

## 36. What is exception handling? Explain by Java program.

Exception handling is a mechanism for dealing with errors and exceptions in a program. It allows you to write code that can continue to run even if an error or exception occurs. In Java, exception handling is done using the `try`, `catch`, and `finally` blocks. 

For example:
```java
try {
    // Code that may throw an exception
} catch (Exception e) {
    // Code to handle the exception
} finally {
    // Code that will always be executed, regardless of whether an exception occurred or not
}
```

## 37. The `finally` Block

> _Note: This question has also been answered in question 17 (just the code part). Explaination is done here_

The `finally` block is used to execute code that must be executed regardless of whether an exception occurred or not. This is often used to clean up resources, such as closing files or database connections.

For example,
```java
try {
    // Code that may throw an exception
} catch (Exception e) {
    // Code to handle the exception
} finally {
    // Close the file
}
```

## 39. What are Checked and Unchecked Exceptions? How Can We Handle Checked Exceptions?

### Checked Exceptions
Checked exceptions are exceptions that the compiler checks for at compile time. They must be either caught using a `try-catch` block or declared in the method signature using the `throws` keyword. Examples include `IOException` and `SQLException`.

### Unchecked Exceptions
Unchecked exceptions are exceptions that the compiler does not check for at compile time. They are also known as **runtime exceptions** and can be caught, but it is not mandatory. Examples include `NullPointerException` and `ArrayIndexOutOfBoundsException`.

### Handling Checked Exceptions
Checked exceptions can be handled in two ways:
- **Catch the exception**: This is done using a try-catch block.
    ```java
    try {
        // Code that may throw a checked exception
    } catch (IOException e) {
        // Handle the exception
    }
    ```
- **Declare the exception**: This is done by adding the `throws` clause to the method signature.
    ```java
    public void readFile() throws IOException {
        // Code that may throw a checked exception
    }
    ```
