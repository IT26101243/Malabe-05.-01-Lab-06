import java.util.Scanner;

public class IT26101243Lab6Q2C {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String numbersEntered = "";
        double sum = 0;
        int count = 1;
        double average ;
        
        System.out.println("Please enter 10 numbers:");

        while (count <= 10) {

            System.out.print("Enter number " + count + ":");
            int num = scanner.nextInt();

            // Store each number into string
            numbersEntered = numbersEntered + num + " ";

            sum = sum + num;

            count++;
        }

        average = sum / 10;

        System.out.println("The numbers you entered are:");
        System.out.println(numbersEntered);
        System.out.println("");
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}
