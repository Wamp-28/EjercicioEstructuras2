import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre, direccion, telefono;
        double saldo;
        int opcion;

        System.out.println(" Bienvenido al  Banco JDRG ");
        System.out.print("""
        *****************
        Ingrese su nombre: 
        *****************
        """);
        nombre = teclado.nextLine();
        System.out.print("""
        ********************
        Ingrese su dirección: 
        ********************
        """);
        direccion = teclado.nextLine();
        System.out.print("""
        *******************
        Ingrese su teléfono: 
        *******************
        """);
        telefono = teclado.nextLine();
        System.out.print("""
        ************************
        Ingrese su saldo inicial: 
        ************************
        """);
        saldo = teclado.nextDouble();

        do {
            System.out.println("\n Menú Bancorn ");
            System.out.println("""
            ************
            1. Consignar
            ************
            """);
            System.out.println("""
            **********
            2. Retirar
            **********
            """);
            System.out.println("""
            ****************************
            3. Extracción rápida del 20%
            ****************************
            """);
            System.out.println("""
            ******************
            4. Consultar saldo
            ******************
            """);
            System.out.println("""
            ********
            5. Salir
            ********
            """);
            System.out.print("""
            **********************
            Seleccione una opción: 
            **********************
            """);
            opcion = teclado.nextInt();

            if (opcion < 1 || opcion > 5) {
                System.out.println("""
            ***********************************
            Opción no válida. Intente de nuevo.
            ***********************************
            """);
            } else {
                switch (opcion) {
                    case 1:
                        System.out.print("""
                        *****************************
                        Ingrese el valor a consignar: 
                        *****************************
                        """);
                        double consignacion = teclado.nextDouble();
                        if (consignacion > 0) {
                            saldo += consignacion;
                            System.out.println("""
                        **********************************
                        Consignación exitosa. Nuevo saldo:
                        **********************************
                        """ + saldo);
                        } else {
                            System.out.println("""
                        ***********************************
                        Error: El monto debe ser mayor a 0.
                        ***********************************
                        """);
                        }
                        break;

                    case 2:
                        System.out.print("""
                        ***************************
                        Ingrese el valor a retirar: 
                        ***************************
                        """);
                        double retiro = teclado.nextDouble();
                        if (retiro > 0 && retiro <= saldo) {
                            saldo -= retiro;
                            System.out.println("""
                        ****************************
                        Retiro exitoso. Nuevo saldo:
                        ****************************
                        """ + saldo);
                        } else if (retiro > saldo) {
                            System.out.println("""
                        **************************
                        Error: Saldo insuficiente.
                        **************************
                        """);
                        } else {
                            System.out.println("""
                        ***********************************
                        Error: El monto debe ser mayor a 0.
                        ***********************************
                        """);
                        }
                        break;
                    case 3:
                        double extraccion = saldo * 0.2;
                        if (saldo >= extraccion) {
                            saldo -= extraccion;
                            System.out.println("""
                        ***************************************
                        Extracción rápida exitosa. Nuevo saldo:
                        ***************************************
                        """ + saldo);
                        } else {
                            System.out.println("""
                        **************************
                        Error: Saldo insuficiente.
                        **************************
                        """);
                        }
                        break;

                    case 4:
                        System.out.println("""
                        *******************
                        Su saldo actual es:
                        *******************
                        """ + saldo);
                        break;

                    case 5:
                        System.out.println("\n Datos de la jairCuenta ");
                        System.out.println("""
                        *****************
                        Banco: Banco JDRG
                        *****************
                        """);
                        System.out.println("""
                        ********
                        Titular: 
                        ********
                        """ + nombre);
                        System.out.println("""
                        **********
                        Dirección: 
                        **********
                        """ + direccion);
                        System.out.println("""
                        *********
                        Teléfono: 
                        *********
                        """ + telefono);
                        System.out.println("""
                        ************
                        Saldo final: 
                        ************
                        """ + saldo);
                        System.out.println("""
                        *******************************************
                        Gracias por usar Banco JDRG. ¡Hasta pronto!
                        *******************************************
                        """);
                        break;
                }
            }
        } while (opcion != 5);

        teclado.close();
    }
}