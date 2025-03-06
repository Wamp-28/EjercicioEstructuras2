//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.import java.util.Scanner;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = new String();

        do {
            System.out.println("Introduce el primer número (entre 1 y 100):");
            int numero1 = scanner.nextInt();

            System.out.println("Introduce el segundo número (entre 1 y 100):");
            int numero2 = scanner.nextInt();

            if (numero1 < 1 || numero1 > 100 || numero2 < 1 || numero2 > 100) {
                System.out.println("Error: Los números deben estar entre 1 y 100. Por favor, inténtalo de nuevo.");
                continue;
            }

            System.out.println("Introduce un signo aritmético (+, -, *, /, ^, %):");
            String signo = scanner.next();

            switch (signo) {
                case "+":
                    System.out.println("Resultado: " + (numero1 + numero2));
                    break;
                case "-":
                    System.out.println("Resultado: " + (numero1 - numero2));
                    break;
                case "*":
                    System.out.println("Resultado: " + (numero1 * numero2));
                    break;
                case "/":
                    if (numero2 != 0) {
                        System.out.println("Resultado: " + ((double) numero1 / numero2));
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                    }
                    break;
                case "^":
                    System.out.println("Resultado: " + Math.pow(numero1, numero2));
                    break;
                case "%":
                    if (numero2 != 0) {
                        System.out.println("Resultado: " + (numero1 % numero2));
                    } else {
                        System.out.println("Error: No se puede calcular el módulo con cero.");
                    }
                    break;
                default:
                    System.out.println("Error: Signo aritmético inválido.");
                    break;
            }

            System.out.println("¿Deseas realizar otra operación? (si/no):");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("sí"));

        scanner.close();
        System.out.println("¡Gracias por usar la calculadora!");
    }
}




