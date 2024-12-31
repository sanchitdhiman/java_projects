import java.util.Scanner;

public class SimpleCalculator {
    public static void calculator() {
        System.out.println("\nAvailable operations:\n1. Addition (+)\n2. Subtraction (-)\n3. Multiplication (*)\n4. Division (/)\n");
        System.out.print("Enter the operation you want to perform: ");
        
        Scanner sc = new Scanner(System.in);

        char operation = sc.next().charAt(0);

        if (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
            System.out.println("Invalid Input!");
            sc.close();
            return;
        }

        System.out.print("\nEnter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        sc.close();
        System.out.println();

        switch (operation) {
            case '+' -> System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2) + ".");
            case '-' -> System.out.println("The difference of " + num1 + " and " + num2 + " is " + (num1 - num2) + ".");
            case '*' -> System.out.println("The product of " + num1 + " and " + num2 + " is " + (num1 * num2) + ".");
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed!");
                } else {
                    System.out.println("The quotient of " + num1 + " by " + num2 + " is " + (num1 / num2) + ".");
                }
            }
            default -> {
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator!");

        calculator();
    }
}