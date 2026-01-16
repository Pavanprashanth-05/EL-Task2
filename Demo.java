package Task2;

import java.util.Scanner;

public class Demo {

    // Static variable
    static double staticValue = 100.0;

    // Instance variable
    int instanceValue = 50;

    public static void main(String[] args) {

        // 1. Primitive Data Types
        byte b = 10;        // 1 byte
        short s = 100;      // 2 bytes
        int i = 1000;       // 4 bytes
        long l = 100000L;   // 8 bytes
        float f = 10.5f;    // 4 bytes
        double d = 99.99;   // 8 bytes
        char c = 'A';       // 2 bytes
        boolean flag = true;// 1 bit

        // 2. Scanner Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        if (num2 == 0) {
            System.out.println("Division by zero is not allowed.");
        }

        // 3. Arithmetic Operations
        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;
        double quotient = (num2 != 0) ? (num1 / num2) : 0;

        System.out.printf("\nResults:\n");
        System.out.printf("Addition: %.2f\n", sum);
        System.out.printf("Subtraction: %.2f\n", diff);
        System.out.printf("Multiplication: %.2f\n", product);
        System.out.printf("Division: %.2f\n", quotient);

        // 4. Type Casting
        int castedInt = (int) d;      // Explicit
        double implicitCast = i;      // Implicit

        System.out.println("\nType Casting:");
        System.out.println("Double to Int: " + castedInt);
        System.out.println("Int to Double: " + implicitCast);

        // 5. Variable Types
        int localValue = 20;          // Local variable
        Demo obj = new Demo();

        System.out.println("\nVariable Types:");
        System.out.println("Local Variable: " + localValue);
        System.out.println("Instance Variable: " + obj.instanceValue);
        System.out.println("Static Variable: " + staticValue);

        sc.close();
    }
}
