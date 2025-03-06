import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        String nom;
        int confi;
        int tel;
        String rta;
        double sal1 = 0;
        double sal2=0;

        System.out.println("Digite su nombre: ");
        nom=teclado.next();
        System.out.println("Digite su telefono");
        tel= Integer.parseInt(teclado.next());
        System.out.println("Digite su saldo");
        sal1= Double.parseDouble(teclado.next());
        do {
        System.out.println("""
                Menu de opciones:
                1)Consignar
                2)Retirar
                3)Extraccion rapida
                4)Consultar Saldo""");
        rta= teclado.next();

            if (rta.equals("1")){
                System.out.println("Digite el valor que va a consignar: ");
                sal2= Double.parseDouble((teclado.next()));
                sal1=sal1+sal2;
                System.out.println("Su nuevo saldo es:"+sal1);
            }
            else if (rta.equals("2")) {
                if (sal2>sal1){
                    System.out.println("Saldo insuficiente ");
                }else {
                    System.out.println("Ingrese el valor a retirar: ");
                    sal2= Double.parseDouble(teclado.next());
                    sal1=sal1-sal2;
                    System.out.println("Su nuevo saldo es: "+sal1);
                }

            } else if (rta.equals("3")) {
                if (sal1<0){
                    System.out.println("Saldo induficiente para la extraccion rapida ");
                }else {
                    double rtro;
                    rtro=sal1*0.20;
                    sal1=sal1-rtro;
                    System.out.println("Su nuevo saldo es: "+sal1);
                }

            } else if (rta.equals("4")) {
                System.out.println("Su saldo es: "+sal1);
            }else {
                System.out.println("***Opcion no reconocida***");
            }System.out.println("""
                        ¿Desea salir?
                        1)si
                        2)no
                        """);
            confi= Integer.parseInt(teclado.next());

        }while (confi!=1);
        teclado.close();
        System.out.println("Banco caja feliz ");
        System.out.println("Nombre: "+nom);
        System.out.println("Telefono: "+tel);
        System.out.println("Su saldo es: "+sal1);
    }
}