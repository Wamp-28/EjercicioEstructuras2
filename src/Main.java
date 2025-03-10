import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc;
        String nombre;
        String fecha;
        String tel;
        int mouse=0,tecla=0,monitor=0,discos=0,ram=0;
        double t1=0,t2=0,t3=0,t4=0,t5=0,st=0,t;
        double iva;



        System.out.println("Digite su nombre:");
        nombre = teclado.nextLine();
        System.out.println("Digite la fecha:");
        fecha = teclado.nextLine();
        System.out.println("Digite su numero telefonico: ");
        tel = teclado.nextLine();
       do{
        System.out.println("""
                Tecnologia
                1)Mouse-80.000
                2)Teclados-320.000
                3)Monitor-940.000
                4)Discos Duros-230.000
                5)RAM-180.000
                6)Salir
                Digite su opcion:
                """);
        opc = teclado.nextInt();

        switch (opc){
            case 1 ->{
                System.out.println("Cuantos desea comprar:");
                mouse = teclado.nextInt();
                mouse= mouse +mouse;
                t1 = t1 + mouse*80000;
            }
            case 2 ->{
                System.out.println("Cuantos desea comprar:");
                tecla = teclado.nextInt();
                tecla = tecla+tecla;
                t2 = t2 + tecla*320000;

            }
            case 3 ->{
                System.out.println("Cuantos desea comprar:");
                monitor = teclado.nextInt();
                monitor = monitor+monitor;
                t3 = t3 + monitor*940000;
            }
            case 4 ->{
                System.out.println("Cuantos desea comprar:");
                discos = teclado.nextInt();
                discos = discos + discos;
                t4 = t4 + discos*230000;
            }
            case 5 ->{
                System.out.println("Cuantos desea comprar:");
                ram = teclado.nextInt();
                ram = ram + ram;
                t5 = t5 + ram*180000;
            }
            case 6 ->{
                System.out.println("Saliendo.....");

            }
        }
       }while(opc !=6);

        st = t1+t2+t3+t4+t5;
        iva = st*0.16;
        t = st+iva;
        System.out.println("Tienda tecnologica");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Fecha: "+fecha);
        System.out.println("Telefono: "+tel);
        System.out.println("Producto");
        System.out.println("Mouse : "+mouse+" - 80000 - "+t1);
        System.out.println("Teclados : "+tecla+" -  320000 - "+t2);
        System.out.println("Monitor : "+monitor+" - 940000 - "+t3);
        System.out.println("Discos Duros : "+discos+"-   230000 - "+t4);
        System.out.println("Ram : "+ram+"- 180000 - "+t5);
        System.out.println("Subtotal: "+st);
        System.out.println("Iva:"+iva);
        System.out.println("Total : "+t);


    }

}