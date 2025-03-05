import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();
        boolean seguirCalculando = true;

        while (seguirCalculando) {
            int numero1 = ale.nextInt(100) + 1;
            int numero2 = ale.nextInt(100) + 1;

            System.out.println("Numero 1: " + numero1);
            System.out.println("Numero 2: " + numero2);

            System.out.println("Digite un signo (+, -, *, /, ^, %):");
            String signo = teclado.next();

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
                        System.out.println(" Error");
                    }
                    break;
                case "^":
                    System.out.println("Resultado: " + Math.pow(numero1, numero2));
                    break;
                case "%":
                    if (numero2 != 0) {
                        System.out.println("Resultado: " + (numero1 % numero2));
                    } else {
                        System.out.println("Error");
                    }
                    break;
                default:
                    System.out.println("Signo no válido.");
                    break;
            }

            System.out.println("¿Desea realizar otra operación? 1=Sí 2=No");
            int respuesta = teclado.nextInt();
            seguirCalculando = (respuesta == 1);
        }

        teclado.close();
    }
}
