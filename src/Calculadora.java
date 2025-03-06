import java.util.Random;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continuar = true;
        double resultado;
        int max = 100;
        int min = 1;

        while (continuar) {
            int n1 = random.nextInt((max - min + 1)) + max;
            int n2 = random.nextInt((max - min + 1)) + max;

            System.out.print("Ingrese un signo aritmético (+, -, *, /, ^, %): ");
            String signo = scanner.next();

            switch (signo) {
                case "+":
                    resultado = n1 + n2;
                    break;
                case "-":
                    resultado = n1 - n2;
                    break;
                case "*":
                    resultado = n1 * n2;
                    break;
                case "/":
                    resultado = (double) n1 / n2;
                    break;
                case "^":
                    resultado = Math.pow(n1, n2);
                    break;
                case "%":
                    resultado = n1 % n2;
                    break;
                default:
                    System.out.println("Signo aritmético no válido.");
                    continue;
            }

            System.out.println("Resultado: " + resultado);

            System.out.print("¿Desea realizar otra operación? (s/n): ");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }
    }
}