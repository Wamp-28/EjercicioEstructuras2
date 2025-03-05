import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();

        String sim, rta;
        int max=100;
        int min=1;
        int alt1;
        int alt2;
        double suma,resta,mul,di,pot,mod;

        alt1=ale.nextInt((max-min+1))+min;
        alt2=ale.nextInt((max-min+1))+min;

        System.out.println(" "+alt1);
        System.out.println(" "+alt2);

        do {
            System.out.println("Digite el simbolo que quiere operar: ");
            sim=teclado.next();

            if (sim.equals("+")){
                suma= alt1+alt2;
                System.out.println("El resultado de la suma es: "+suma);
            }else if (sim.equals("-")){
                resta= alt1-alt2;
                System.out.println("El resultado de la resta es: "+resta);
            } else if (sim.equals("*")) {
                mul=(double) alt1*alt2;
                System.out.println("El resultado de la multiplicacion es: "+mul);
            } else if (sim.equals("/")) {
                di= (double) alt1 /alt2;
                System.out.println("El resultado de la division  es: "+di);
            } else if (sim.equals("^")) {
                pot=(double) Math.pow(alt1,alt2);
                System.out.println("El resultado de la potencia es:"+pot);
            } else if (sim.equals("%")) {
                mod=(double) alt1 % alt2;
                System.out.println("El resultado del modulo es:"+mod);
            } else {
                System.out.println("Simbolo no valido ");
            }
            System.out.println("""
                    ¿Desea seguir haciendo operaciones?
                    1)Si
                    2)no""");
            rta= teclado.next();
        }while ("1".equalsIgnoreCase(rta));
        teclado.close();
        System.out.println("Operaciones terminadas...");

    }
}