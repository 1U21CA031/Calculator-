mport java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Basic Calculator!");
            System.out.println("Please enter the first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Please enter the second number:");
            double num2 = scanner.nextDouble();

            System.out.println("Select an operation: (+, -, *, /) or 'q' to quit:");
            char operator = scanner.next().charAt(0);

            double result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                        continue;
                    }
                    break;
                case 'q':
                    System.out.println("Exiting calculator. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid operator! Please try again.");
                    continue;
            }

            System.out.println("Result: " + result);
        }
    }
}