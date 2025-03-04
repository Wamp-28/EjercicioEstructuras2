import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcionContinuar;
        int num1;
        int num2;
        double resultado;
        int contador;

        do {
            System.out.println("Seleccione la operación a realizar:");
            System.out.println("1. Sumar +");
            System.out.println("2. Restar -");
            System.out.println("3. Multiplicar *");
            System.out.println("4. Dividir /");
            System.out.println("5. Potencia ^");
            System.out.println("6. Módulo %");
            System.out.print("Ingrese la opción 1-6: ");
            int opcionMenu = teclado.nextInt();

            if (opcionMenu < 1 || opcionMenu > 6) {
                System.out.println("Opción no válida. Debe elegir un número entre 1 y 6.");
            } else {
                System.out.print("Ingrese el primer número entre 1 y 100: ");
                num1 = teclado.nextInt();
                System.out.print("Ingrese el segundo número entre 1 y 100: ");
                num2 = teclado.nextInt();

                if (num1 < 1 || num1 > 100 || num2 < 1 || num2 > 100) {
                    System.out.println("Número(s) fuera de rango. Deben estar entre 1 y 100.");
                } else {
                    resultado = 0;

                    switch (opcionMenu) {
                        case 1:
                            resultado = num1 + num2;
                            System.out.println("El resultado de la suma es: " + resultado);
                            break;
                        case 2:
                            resultado = num1 - num2;
                            System.out.println("El resultado de la resta es: " + resultado);
                            break;
                        case 3:
                            resultado = num1 * num2;
                            System.out.println("El resultado de la multiplicación es: " + resultado);
                            break;
                        case 4:
                            resultado = (double) num1 / num2;
                            System.out.println("El resultado de la división es: " + resultado);
                            break;
                        case 5:
                            resultado = 1;
                            contador = 0;
                            do {
                                resultado *= num1;
                                contador++;
                            } while (contador < num2);
                            System.out.println("El resultado de la potencia es: " + resultado);
                            break;
                        case 6:
                            resultado = num1 % num2;
                            System.out.println("El resultado del módulo es: " + resultado);
                            break;
                    }
                }
            }

            System.out.print("¿Desea realizar otra operación? (1 = Sí, 2 = No): ");
            opcionContinuar = teclado.nextInt();
            System.out.println();

        } while (opcionContinuar == 1);

        System.out.println("Gracias por utilizar la Calculadora. ¡Hasta luego!");
        teclado.close();
    }
}

