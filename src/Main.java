import java.util.Random;
import java.util.Scanner;
//Oscar Alejandro Velasquez Fajardo
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int min = 1;
        int max = 100;
        int ale1;
        int ale2;
        double resultado;
        String operador;
        String continuar;


        ale1 = aleatorio.nextInt((max - min + 1)) + min;
        ale2 = aleatorio.nextInt((max - min + 1)) + min;
        do{
        System.out.println("El numero aleatorio 1 es : "+ale1+"\n"+"El numero aleatorio 2 es : "+ale2);
        System.out.println("""
                +)(suma los operandos)
                -)(resta los operandos)
                *)(multiplica los operandos)
                /)(Divide los operandos)
                ^)(1º operando como base y 2º como exponente)
                %)(resto de la división entre operando1 y operando2)
                DIGITE EL SIGNO DE LA OPERACION QUE DESEA REALIZAR: 
                
                """);
        operador = teclado.next();


        switch(operador){
            case "+" ->{
                resultado = ale1 + ale2;
                System.out.println("La suma de los aleatorios es: " + resultado);
            }
            case "-" ->{
                resultado = ale1 - ale2;
                System.out.println("La resta de los aleatorios es: " + resultado);
            }
            case "*" ->{
                resultado = ale1 * ale2;
                System.out.println("La multiplicacion de los aleatorios es: " + resultado);
            }
            case "/" ->{
                resultado =  (double) ale1/ale2;
                System.out.println("La division de los aleatorios es: " + resultado);
            }
            case "^" ->{
                resultado = Math.pow(ale1, ale2);
                System.out.println("La Potencia de los aleatorios es: " + resultado);
            }
            case "%" ->{
                resultado = ale1%ale2;
                System.out.println("El modulo de los aleatorios es: " + resultado);
            }
            default -> System.out.println("Operación no válida.");
        }
         System.out.println("¿Desea realizar otra operación? (si/no): ");
         continuar = teclado.next().toLowerCase();

}while(continuar.equals("si"));


    }
}