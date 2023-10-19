import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Peça ao usuário para inserir a temperatura em graus Fahrenheit
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        scanner.close();

        // Converta de Fahrenheit para Celsius usando a fórmula (F - 32) * 5/9
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;

        System.out.println("A temperatura em graus Celsius é: " + celsius);
    }
}
