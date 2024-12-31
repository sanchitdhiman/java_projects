import java.util.Scanner;

public class OddOrEvenChecker {

    public static boolean oddOrEvenChecker(int num) {
        return num % 2 == 1;
    }
    public static void main(String[] args) {

        System.out.println("Welcome to the Odd or Even Checker!");

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        int num = sc.nextInt();

        boolean odd = oddOrEvenChecker(num);

        if (odd) {
            System.out.println(num + " is an odd number.");
        } else {
            System.out.println(num + " is an even number.");
        }
    }
}