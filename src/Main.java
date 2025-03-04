import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random ale = new Random();

        int suma, resta, mult, raiz, num1, num2, mod;
        double div;
        int max = 100, min = 1;
        int max1 = 100, min1 = 1;
        String res ;
         String operador;

do {
    num1 = ale.nextInt((max - min + 1)) + min1;
    num2 = ale.nextInt((max1 - min1 + 1)) + min1;
    System.out.println("\nLOS NÚMEROS GENERADOS SON: " + num1 + " y " + num2 + "\n");

    do{
    System.out.println("DIGITE QUE OPERACION DECEA REALIZAR (+, -, *, /, ^, %): ");
    operador = scanner.next();

    if (!(operador.equals("+") || operador.equals("-") || operador.equals("*") || operador.equals("/") || operador.equals("^") || operador.equals("%"))) {
        System.out.println("***** OPERADOR NO VÁLIDO. INTENTE NUEVAMENTE. ***** \n");
    }
    } while (!(operador.equals("+") || operador.equals("-") || operador.equals("*") || operador.equals("/") || operador.equals("^") || operador.equals("%")));


    switch (operador) {

        case "+" -> {
            suma = num1 + num2;
            System.out.println("EL RESULTADO ES: " + suma+ "\n");
        }
        case "-" -> {
            resta = num1 - num2;
            System.out.println("EL RESULTADO ES: " + resta+ "\n");
        }
        case "*" -> {
            mult = num1 * num2;
            System.out.println("EL RESULADO ES: " + mult+ "\n");
        }
        case "/" -> {
            div = Math.floorDiv(num1, num2) + (num1 % num2) / (double) num2;
            System.out.println("EL RESULTADO ES: " + div+ "\n");
        }
        case "^" -> {
            raiz = (int) Math.pow(num1, num2);
            System.out.println("E RESULTADO ES: " + raiz+ "\n");
        }
        case "%" -> {
            mod = Math.floorMod(num1, num2);
            System.out.println("EL RESULTADO ES: " + mod+"\n");

        }

    }

    System.out.println("¿DECEAS REALIZAR OTRA OPERACION? (s,n)");git
     res=scanner.next();


}while (res.equalsIgnoreCase("s"));

        System.out.println("\n***** GRACIAS POR USAR LA CALCULADORA *****");
        scanner.close();
    }
}