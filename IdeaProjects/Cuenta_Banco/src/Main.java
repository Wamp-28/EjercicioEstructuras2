import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        int tel, opc;
        double sal, cons, ret, ext;
        String nom;
        String dir;

        System.out.println("\n ***** BIENVENIDO A TU CUENTA BANCARIA ***** \n");
        System.out.println("--- DATOS DEL CLIENTE --- \n");
        System.out.println("INGRESE SU NOMBRE: ");
        nom = teclado.nextLine();
        System.out.println("INGRESE SU DIRECCION: ");
        dir = teclado.nextLine();
        System.out.println("INGRESE SU TEEFONO: ");
        tel = teclado.nextInt();
        System.out.println("INGRESE SU SALDO: ");
        sal = teclado.nextDouble();
        teclado.nextLine();

        do{
        System.out.println("""
                            
                            ***** MENÚ PRINCIPAL *****
                            1.CONSIGNAR.
                            2.RETIRAR.
                            3.EXTRACCION RÁPIDA 20%.
                            4.CONSULTAR SALDO.
                            5.SALIR.
                            """);
        System.out.println("INGRESE LA OPCION");
        opc = teclado.nextInt();

        switch (opc){
            case 1->{
                System.out.println("CUANTO DESEAS CONSIGNAR: ");
                cons = teclado.nextDouble();
                sal= cons+sal;
                System.out.println("\n TU SALDO ACTUAL ES: "+sal);

            } case 2->{
                System.out.println("TU SALDO ACTUAL ES: $ "+ sal+"\n");
                System.out.println("¿CUANTO DESEAS RETIRAR: ");
                ret= teclado.nextDouble();

                 if(ret > sal) {

                     System.out.println("\n SALDO INSUFICIENTE. INGRESA UN MONTO MENOR O IGUAL A $" + sal);
                 } else if (ret<=sal) {

                     sal -= ret;
                     System.out.println("\n ***** RETIRO EXITOSO. TU NUEVO SALDO ES: $" + sal + "*****");
                     break;
                 }

            } case 3->{
                if (sal > 0) {
                    ext = sal * 0.20;
                    sal -= ext;
                    System.out.println("\n SE HA RETIRADO EL 20% DE TU SALDO ($" + ext + ").");
                    System.out.println(" TU NUEVO SALDO ES: $" + sal);
                } else {
                    System.out.println("\n ***** NO SE PUEDE REALIZAR EXTRACCIÓN. SALDO INSUFICIENTE *****");
                }
            } case 4->{

                System.out.println("TU SALDO ACTUAL ES: $"+sal);

            } case 5->{
                System.out.println("\n***** BANCO CALIMO TU MEJOR AMIGO *****\n");
                System.out.println("NOMBRE CLIENTE: "+nom);
                System.out.println("DIRECCION: "+dir);
                System.out.println("TELEFONO: "+tel);
                System.out.println("CUENTA N° XXXXXXX");
                System.out.println("SALDO ACTUAL DE LA CUENTA: "+sal);

            } default -> {
                System.out.println("\n ***** OPCIÓN NO VÁLIDA. INTENTA DE NUEVO. *****");
            }
        }
    } while (opc != 5);

        teclado.close();

    }
}