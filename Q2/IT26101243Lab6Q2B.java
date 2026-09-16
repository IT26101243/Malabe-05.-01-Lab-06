import java.util.Scanner;

public class IT26101243Lab6Q2B {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variable to hold all entered numbers
        String numbersEntered = "";

        System.out.println("Please enter 10 numbers:");

        int count = 1;
        while (count <= 10) {


            System.out.print("Enter number " + count + ":");
            int num = scanner.nextInt();

            // Store each number into the string
            numbersEntered = numbersEntered + num + " ";

            count++;
        }

        // Output all numbers together at the end
        System.out.println("The numbers you entered are:");
        System.out.println(numbersEntered);
    }
}
