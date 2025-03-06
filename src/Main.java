import java.util.Scanner;
//Oscar Alejandro Velasquez Fajardo
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String direccion;
        String tel;
        double saldo;
        int opc;
        double consignar;
        double retirar;
        double rapido;


        System.out.println("Digite su nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Digite su direccion: ");
        direccion = teclado.nextLine();
        System.out.println("Digite su telefono:");
        tel = teclado.nextLine();
        System.out.println("Digite su saldo: ");
        saldo = teclado.nextDouble();
        do{
        System.out.println("""
               1)Consignar
               2)Retirar
               3)Extraccion rapida
               4)Consultar saldo
               5)Salir
               Digite su opcion :
               """);
        opc = teclado.nextInt();

        switch(opc){
            case 1 ->{
                System.out.println("Cuanto quieres consignar: ");
                consignar = teclado.nextDouble();
                if(consignar>=0){
                    saldo = saldo + consignar;
                    System.out.println("Su nuevo saldo es: "+ saldo);
                }else{
                    System.out.println("Digite un valor valido");
                }

            }
            case 2 ->{
                System.out.println("Cuanto quieres retirar: ");
                retirar = teclado.nextDouble();
                if(saldo>=retirar){
                    saldo = saldo - retirar;
                }else{
                    System.out.println("Su saldo es insuficiente");
                }

            }
            case 3 ->{
                System.out.println("Cuanto desea retirar :");
                rapido =  teclado.nextDouble();
                rapido = rapido*0.2;
                saldo = saldo - rapido;

            }
            case 4 ->{
                System.out.println("Su saldo es: " + saldo);
            }
            case 5 ->{
                System.out.println("Nombre : "+ nombre);
                System.out.println("Direccion : "+direccion);
                System.out.println("Telefono : "+tel);
                System.out.println("Saldo : "+saldo);
                System.out.println("Saliendo....");
            }
            default -> {
                System.out.println("******Opcion no valida******");
            }


        }
}while(opc != 5);;





    }
}