import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Ingrese el primer número: ");
            int num1 = scanner.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int num2 = scanner.nextInt();

            System.out.println("Número 1: " + num1);
            System.out.println("Número 2: " + num2);
            System.out.print("Ingrese una operación (+, -, *, /, °, %): ");
            String operacion = scanner.next();

            double resultado = 0;
            boolean operacionValida = true;

            switch (operacion) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    resultado = num1 / num2;
                    break;
                case "°":
                    resultado = Math.pow(num1, num2);
                    break;
                case "%":
                    resultado = num1 % num2;
                    break;
            }
            if (operacionValida) {
                System.out.println("Resultado: " + resultado);
            }

        } while  (true);
    }
}
