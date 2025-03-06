import java.util.Scanner;

class CuentaBancaria {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);


        String nombre;
        String direccion;
        int telefono;
        int opcion;
        double saldo;
        double consignar;
        double retiro;
        double extra;

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

        do {
            System.out.println("""
                       -----Menu Opciones-----
                       1. Consignar
                       2. Retirar
                       3. Extraccion Rapida (20%)
                       4. Consultar saldo
                       5. Salir
                       """);
            System.out.println("Ingrese la opcion");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1->{
                    System.out.println("Cuanto dinero va a consignar: ");
                    consignar = teclado.nextDouble();
                    saldo = consignar + saldo;
                    System.out.println("Saldo actualizado a: ");
                }
                case 2->{
                    System.out.println("Su saldo actual es: " + saldo);
                    System.out.println("¿Cuanto desea retirar?: ");
                    retiro = teclado.nextDouble();

                    if (retiro > saldo){
                        System.out.println("Saldo insuficiente, ingrese nuevamente otro valor: " + saldo);
                    }else if (retiro<=saldo){
                        saldo -= retiro;

                        System.out.println("Su retiro fue exitoso. Excelente dia");
                        System.out.println("Saldo actualizado a: " + saldo);
                        break;
                    }

                } case 3->{
                    if (saldo > 0) {
                        extra = saldo * 0.20;
                        saldo -= extra;
                        System.out.println("Se acaba de retirar el 20% de tu saldo ($" + extra + ").");
                        System.out.println("Saldo actualizado a: $" + saldo);
                    } else {
                        System.out.println("Saldo insuficiente, intente nuevamente");
                    }
                } case 4->{

                    System.out.println("El saldo actual de tu cuenta es: $"+saldo);

                } case 5->{
                    System.out.println("-----Banco AV Villas-----");
                    System.out.println("Nombre del cliente: " + nombre);
                    System.out.println("Direccion: " + direccion);
                    System.out.println("Telefono: " + telefono);
                    System.out.println("Saldo de la cuenta: " + saldo);

                } default -> {
                    System.out.println("La Opcion NO es valida, Intentelo nuevamente");
                }
            }
        }while (opcion !=5);

        teclado.close();

    }
}


