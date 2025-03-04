import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);
        Random ale1=new Random();

        int min = 1;
        int max = 100;
        int num1;
        int num2;
        double resultado = 0;
        String decicion;
        num1 = ale1.nextInt((max - min + 1)) + min;
        num2 = ale1.nextInt((max - min + 1)) + min;
        do {


            System.out.println(num1);
            System.out.println(num2);
            System.out.println("Ingrese el simbolo aritmetico (+, -, *, /, ^, %): ");
            String operador = teclado.next();



            switch(operador) {
                case "+" -> {
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                }
                case "-" -> {
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                }
                case "*" -> {
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                }
                case "/" -> {
                    resultado = (double) num1 / num2;
                    System.out.println("Resultado: " + resultado);
                }
                case "^" -> {
                    resultado = Math.pow(num1, num2);
                    System.out.println("Resultado: " + resultado);
                }
                case "%" -> {
                    resultado = num1 % num2;
                    System.out.println("Resultado: " + resultado);
                }
                default -> {
                    System.out.println("Operador no valido");
                }

            }


            System.out.print("¿Desea realizar otra operación? (s/n): ");
            decicion = teclado.next();


        }while("s".equalsIgnoreCase(decicion));
        teclado.close();
        System.out.println("Gracias por usar la calculadora.");




    }
}