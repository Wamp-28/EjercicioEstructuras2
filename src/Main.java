import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random Ale = new Random();
        int max = 100;
        int min = 1;
        double resultado;
        int n1;
        int n2;
        String signo;

        n1 = Ale.nextInt((max - min + 1)) + 1;
        n2 = Ale.nextInt((max - min + 1)) + 1;

            System.out.print("***CALCULADORA ALEATORIA***\n" + "Los numeros generados son: " + n1 + " y " + n2);
            do {
            System.out.print("""
                    
                    ELIGE QUE OPERACION QUIERES REALIZAR
                    
                    +)=(Suma)
                    -)=(Resta)
                    *)=(Multiplicacion)
                    /)=(Division)
                    ^)=(Potencia)
                    %)=(Modulo)
                    s) Salir del programa
                    """);


            signo = teclado.next();

            switch (signo) {
                case "+": {
                    resultado = n1 + n2;
                    System.out.print("Su resultado es: " + resultado);
                }
                break;
                case "-": {
                    resultado = n1 - n2;
                    System.out.print("Su resultado es: " + resultado + "\n");
                }
                break;
                case "*": {
                    resultado = n1 * n2;
                    System.out.print("Su resultado es: " + resultado + "\n");
                }
                break;
                case "/": {
                    resultado = (double) n1 / n2;
                    System.out.print("Su resultado es: " + resultado + "\n");
                }
                break;
                case "^": {
                    resultado = Math.pow(n1, n2);
                    System.out.print("Su resultado es: " + resultado + "\n");
                }
                break;
                case "%": {
                    resultado = (double) n1 % n2;
                    System.out.print("Su resultado es: " + resultado + "\n");
                }
                break;
                case "s" :{
                    System.out.print("Saliendo...");
                }break;
                default: {
                    System.out.print("Ingrese una opcion valida" + "\n");
                }
                break;


            }
        }while(!signo.equals("s"));
    }
}