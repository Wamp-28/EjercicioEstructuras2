import java.util.Scanner;

public class CuentaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre, direccion, telefono;
        double montoRetiro, montoConsignacion, retiroRapido, saldo;
        int opc;

        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese su dirección: ");
        direccion = scanner.nextLine();

        System.out.print("Ingrese su teléfono: ");
        telefono = scanner.nextLine();

        do {
            System.out.print("Ingrese el saldo inicial de su cuenta: ");
            saldo = scanner.nextDouble();
            if (saldo < 0) {
                System.out.println("No puede consignar esa cantidad");
            }
        }while (saldo>0);

        do {
            System.out.println(""" 
                    MENU BANCO CD
            1. Consignar saldo
            2. Retirar saldo
            3. Retiro rápido (20%)
            4. Salir)
            Seleccione una opción:""");

            opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("Ingrese el monto a consignar: ");
                    montoConsignacion = scanner.nextDouble();
                    saldo += montoConsignacion;
                    if (saldo>0){
                    System.out.println("Consignación exitosa. Nuevo saldo: " + saldo);
                    }else{
                        System.out.println("No puede consignar numeros negativos");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el monto a retirar: ");
                    montoRetiro = scanner.nextDouble();
                    if (montoRetiro <= saldo) {
                        saldo -= montoRetiro;
                        System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    if(saldo==0){
                        System.out.println("No se puede retirar");
                    }else{
                    retiroRapido = saldo * 0.20;
                    saldo -= retiroRapido;
                    System.out.println("Retiro rápido exitoso. Nuevo saldo: " + saldo);
                    }
                    break;

                case 4:
                    System.out.println("\tBANCO CD ");
                    System.out.println("Nombre: "+ nombre);
                    System.out.println("Telefono: "+ telefono);
                    System.out.println("Direccion: "+ direccion);
                    System.out.println("Saldo total: "+ saldo);
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opc != 4);
    }
}
