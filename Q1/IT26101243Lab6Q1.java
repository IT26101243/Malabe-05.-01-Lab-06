import java.util.Scanner;

public class IT26101243Lab6Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();

        // Calculate square and square root
        double square = num * num; // or Math.pow(num, 2)
        double squareRoot = Math.sqrt(num);

        // Print outputs matching expected format
        System.out.println("The square of " + num + " is: " + square);
        System.out.println("The square root of " + num + " is: " + squareRoot);

        scanner.close();
    }
}