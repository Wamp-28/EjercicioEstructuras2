import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();

        int max = 100;
        int min = 1;
        int n1;
        int n2;

        double resultado;
        String signo;


        n1= ale.nextInt((max - min + 1)) + min;
        n2= ale.nextInt((max - min + 1)) + min;

        System.out.println("Sus numeros son: " + n1 + " y " + n2);

        do {



        System.out.println("""
                ¿Que operación quieres que haga?
                +: Suma
                -: Resta
                *: Multiplicación
                /:División
                ^: Potenciación
                %: Módulo
                Z: Salir""");

        signo = teclado.next();

        switch (signo){

            case "+" ->{
                resultado = n1 + n2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            }

            case "-" ->{
                resultado = n1 - n2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            }

            case "*" ->{
                resultado = n1 * n2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            }

            case "/" ->{
                resultado = n1 / n2;
                System.out.println("El resultado de la División es: " + resultado);
                break;
            }

            case "^" ->{
                resultado = Math.pow(n1, n2);
                System.out.println("El resultado de la Potenciación es: " + resultado);
                break;
            }

            case "%" ->{
                resultado = n1 % n2;
                System.out.println("El resultado del Módulo es: " + resultado);
                break;
            }

            case "z" -> {
                System.out.println("Saliste de la Calculadora");
                break;
            }

            default ->{
                System.out.println("Signo no valido");
            }


        }

        }while (!signo.equals("z+"));


    }
}