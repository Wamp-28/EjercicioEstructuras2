import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        double resultado;


        int calculadora;


        do {
            int n1 = random.nextInt(100)+1 ;
            int n2 = random.nextInt(100)+1;
            System.out.println("Los numeros generados son: " + n1 + " y 1" + n2);
            System.out.println("""
                    CALCULADORA ARITMETICA
                    1. SUMA
                    2. RESTA
                    3. MULTIPLICACION
                    4. DIVISION
                    5. CONDICIONAL ^
                    6. MODULO
                    7. SALIR
             
                    """);
            String operador = teclado.next();

            switch (operador){
                case "1":
                    System.out.println("El resultado es:" + (n1 + n2));
                    break;
                case "2":
                    System.out.println("El resultado es:" + (n1 - n2));
                    break;

                case "3":
                    System.out.println("El resultado es:" + (n1 * n2));
                    break;

                case "4":
                    if (n2 !=0){
                        System.out.println("El resultado es:" + ((double) n1 / n2));
                    }else {
                        System.out.println("No se puede dividir por cero.");
                    }
                    break;

                case "5":
                    System.out.println("El resultado es:" + Math.pow(n1 , n2));
                    break;

                case "6":
                    if (n2 !=0){
                        System.out.println("El resultado es:" + (n1 % n2));
                    }else{
                        System.out.println("No se puede calcular el modulo con divisor 0.");
                    }
                    break;
                default:
                    System.out.println("Operador no valido.");
                    break;
            }

            System.out.println("¿Desea realizar otra operacion? (1. SI, 2. NO):");
            calculadora = teclado.nextInt();
         } while (calculadora ==1);
        System.out.println("Gracias por usar la calculadora.");
        teclado.close();

        }
    }
