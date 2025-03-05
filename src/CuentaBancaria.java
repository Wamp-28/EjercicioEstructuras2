import java.util.Random;
import java.util.Scanner;

class CuentaBancaria {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        Random Alt = new Random();

        String nombre;
        int telefono;
        String direccion;
        double saldo;

        System.out.println("Bienvenido, ingrese por favor sus datos personales");
        System.out.println("Ingrese su nombre");
        nombre = teclado.nextLine();
        System.out.println("Ingrese su direccion:");
        direccion = teclado.nextLine();
        System.out.println("Ingrese su telefono:");
        telefono = teclado.nextInt();
        System.out.println("Ingrese el saldo");
        saldo = teclado.nextDouble();

        teclado.nextLine();

        do{
            System.out.println("""
                       -----Menu Opciones-----
                       1. Consignar
                       2. Retirar
                       3. Extraccion Rapida (20%)
                       4. Consultar saldo
                       5. Salir
                       """);
        }









    }

}