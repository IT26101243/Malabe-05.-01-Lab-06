import java.util.Scanner;

public class IT26101243Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumOfSquares = 0;
        int count = 0;

        System.out.println("Enter positive integers (terminate input with -99):");

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        while (num != -99) {
            
            if (num > 0) {
                sumOfSquares = sumOfSquares + (num * num);
                count++;
            } else {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
            }

            System.out.print("Enter a number: ");
            num = scanner.nextInt();
        }

        if (count > 0) {
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.println("\nThe Root Mean Square (RMS) is: " + rms);
        }
    }
}
