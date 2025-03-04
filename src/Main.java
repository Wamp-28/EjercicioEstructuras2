import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        Random ale = new Random();

        System.out.println("""
                Bienvenido al casino :)
                Si le sale 1 se le multiplicara el valor 
                si le sale 2 se le restara la mitad del valor
                si le sale 3 lo perdera todo :x
                """);

        int m1;
        int max =3;
        int min =1;
        int rt;
        int seguir;

        System.out.println("Digite monto inicial: ");
        m1=teclado.nextInt();

        rt=ale.nextInt((max-min+1))+min;
        System.out.println("**"+rt+"**");

        do {
            if(rt==1){
                m1=m1*2;
                System.out.println("Su dinero es: "+m1);
                System.out.println("se le ha multiplicado el valor :)");
                System.out.println("""
                    ¿Desea Seguir jugando?
                    1)Si
                    2)No
                    """);
                seguir= teclado.nextInt();
                if (seguir==1){
                    rt=ale.nextInt((max-min+1))+min;
                    System.out.println("**"+rt+"**");

                    continue;

                } else {
                    System.out.println("Se ha ganado un monto de: "+m1);
                    System.out.println("saliendo...");
                    break;
                }
            } else if (rt==2) {
                m1=m1/2;
                System.out.println("Su dinero es: "+m1);
                System.out.println("acabas de perder la mitad :/");
                System.out.println("""
                    ¿Desea seguir jugando?
                    1)Si
                    2)No
                    """);
                seguir= teclado.nextInt();
                if (seguir==1){
                    rt=ale.nextInt((max-min+1))+min;
                    System.out.println("**"+rt+"**");
                    continue;

                } else {
                    System.out.println("Se ha ganado un monto de: "+m1);
                    System.out.println("saliendo...");
                    break;
                }
            } else if (rt==3) {
                m1=m1-m1;
                System.out.println(" "+m1);
                System.out.println("Perdio todo :(");
                break;
            }
        }while (m1>0);
    }
}