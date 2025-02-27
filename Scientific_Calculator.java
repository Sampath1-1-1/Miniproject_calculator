import java.util.Scanner;

public class Scientific_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            // Display menu
            System.out.println("\nScientific Calculator - Choose an operation:");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power Function (x^b)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Square root function
                    System.out.print("Enter a number (x): ");
                    double num = scanner.nextDouble();
                    if (num < 0) {
                        System.out.println("Error: Square root of a negative number is not real.");
                    } else {
                        System.out.println("Result: √" + num + " = " + Math.sqrt(num));
                    }
                    break;

                case 2:
                    // Factorial function
                    System.out.print("Enter a number (x): ");
                    int n = scanner.nextInt();
                    if (n < 0) {
                        System.out.println("Error: Factorial of a negative number is not defined.");
                    } else {
                        System.out.println("Result: " + n + "! = " + factorial(n));
                    }
                    break;

                case 3:
                    // Natural logarithm
                    System.out.print("Enter a number (x): ");
                    double x = scanner.nextDouble();
                    if (x <= 0) {
                        System.out.println("Error: Logarithm is not defined for zero or negative values.");
                    } else {
                        System.out.println("Result: ln(" + x + ") = " + Math.log(x));
                    }
                    break;

                case 4:
                    // Power function (x^b)
                    System.out.print("Enter base (x): ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent (b): ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Result: " + base + "^" + exponent + " = " + Math.pow(base, exponent));
                    break;

                case 5:
                    // Exit the program
                    System.out.println("Exiting the calculator. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        }
    }

    // Method to calculate factorial of a number
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}