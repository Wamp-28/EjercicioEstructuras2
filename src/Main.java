import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        String nombre;
        String direccion;
        String telefono;
        int saldo;
        int opcion;
        int D;
        do {
            System.out.println("---Porfavor Ingrese sus Datos Bancarios---");
            System.out.println("Nombre: ");
            nombre = Teclado.nextLine();
            System.out.println("Direccion: ");
            direccion = Teclado.nextLine();
            System.out.println("Telefono: ");
            telefono = Teclado.nextLine();
            System.out.println("Saldo: ");
            saldo = Teclado.nextInt();
            if (saldo<=0){
                System.out.println("Su saldo no puede ser 0 o inferior digite sus datos nuevamente");
            }
        }while(saldo<=0);
        do {
            System.out.println("""
                    ___________________________   
                       ***Cuenta Bancaria***
                    
                    1)Consignar
                    2)Retirar
                    3)Extraccion rapida 20%
                    4)Consultar Saldo
                    5)Salir
                    ____________________________
                    """);
            opcion = Teclado.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("""
                            ______________________________________
                                      ---Consignacion---
                            
                            Ingrese cuanto dinero desea consignar:
                            
                            _______________________________________
                            """);
                    D = Teclado.nextInt();
                    if (D>0){
                        saldo = saldo + D;
                    }else {
                        System.out.println("Ingrese un valor Correcto");
                    }

                }
                break;
                case 2: {
                    System.out.println("""
                            ______________________________________
                                        ---Retiro---
                            
                            Ingrese cuanto dinero desea retirar:
                            
                            _______________________________________
                            """);
                    D = Teclado.nextInt();
                    if (D>0 && saldo>0 && saldo>=D){
                        saldo = saldo - D;
                    }else {
                        System.out.println("Ingrese un valor Correcto");
                    }

                }
                break;
                case 3: {
                    System.out.println("""
                            ______________________________________
                                    ---Extraccion Rapida---
                            
                            Se ha retirado el 20% de su saldo
                            
                            _______________________________________
                            """);
                    saldo = (int) (saldo-(saldo*0.2));
                }
                break;
                case 4: {
                    System.out.println("""
                            ______________________________________
                                    ---Consulta de Saldo---
                            """);
                    System.out.println("Su saldo actual es de: " + saldo);
                    System.out.println("________________________________");
                }
                break;
                case 5: {
                    System.out.println("""
                            ______________________________________
                                           SALIENDO
                            --------------------------------------
                            """);
                }
                break;
                default: {
                    System.out.println("Ingrese una opcion valida");
                }
                break;
            }
        }while(opcion!=5);
        System.out.println("---------------------");
        System.out.println("---Factura---");
        System.out.println("Nombre: "+nombre);
        System.out.println("Direccion: "+direccion);
        System.out.println("Telefono: "+ telefono);
        System.out.println("Saldo: "+saldo);
        System.out.println("---------------------");
    }
}