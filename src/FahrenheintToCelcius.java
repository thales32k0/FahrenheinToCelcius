import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                // Ask the user to enter a temperature in Celsius Fahrenheit
                System.out.print("Enter the temperature in degrees fahrenheint (or type 'q' to exit): ");
                String input = scanner.next();

                if (input.equalsIgnoreCase("q")) {
                    System.out.println("Leaving the programing.");
                    break;
                }

                double fahrenheit = Double.parseDouble(input);

                // Convert from Fahrenheit to Celsius using the formula (F - 32) * 5/9
                double celsius = (fahrenheit - 32) * 5.0 / 9.0;

                // Display the result
                System.out.println("The temperature in degrees Celsius is: " + celsius);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please, Enter a valid number.");
            }
        }

        // Close the scanner object
        scanner.close();
    }
}

