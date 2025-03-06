import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion, saldo=0, telefono=12345, deposito, retiro;
        String nombre="Andres", direccion="Acasias";

        do {
            System.out.println("\n----CUENTA BANCARIA----\n");
            System.out.println("1. Depositar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Retiro rápido");
            System.out.println("4. Informacion de la cuenta");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: \n");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("---DEPOSITO DE DINERO---");
                    System.out.println("Ingrese el monto a depositar");
                    deposito = teclado.nextInt();
                    if(deposito<0){
                        System.out.println("La cantidad ingresada no es posible depositarla");
                    }
                    else{
                        saldo+=deposito;
                        System.out.println("Deposito exitoso");
                    }
                    break;


                case 2:
                    System.out.println("---RETIRO DE DINERO---");
                    System.out.println("Ingrese el monto a retirar");
                    retiro = teclado.nextInt();
                    if(retiro>saldo){
                        System.out.println("La cuenta no tiene el saldo suficiente para retirar");
                    }
                    else{
                        saldo-=retiro;
                        System.out.println("Retiro exitoso");
                    }
                    break;

                case 3:
                    System.out.println("---DEPOSITO RAPIDO---");
                    if(saldo<=0){
                        System.out.println("Saldo insuficiente");
                    }
                    else{
                        saldo=saldo-((saldo*20)/100);
                        System.out.println("Retiro exitoso");
                    }
                    break;

                case 4:
                    System.out.println("---INFOMRACION DE LA CUENTA");
                    System.out.println("Nombre: "+nombre);
                    System.out.println("Direccion: "+direccion);
                    System.out.println("Telefono: "+telefono);
                    System.out.println("Saldo: "+saldo);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");

                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }
}