import java.util.Random;
import java.util.Scanner;
//Oscar Alejandro Velasquez Fajardo
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valor;
        Random aleatorio = new Random();
        int max = 3;
        int min = 1;
        int dado;
        boolean continuar = true;
        int opcion;
        System.out.println("Ingrese su monto inicial: ");
        valor = teclado.nextDouble();
        dado = aleatorio.nextInt((max - min + 1)) + min;
        System.out.println("Su opcion es : "+dado);
        do{
        if(dado == 1){
            System.out.println("Su monto se duplica :) ");
            valor*=2;
            System.out.println("Su nuevo valor es: "+ valor);
            System.out.println("¿Desea continuar jugando? (1 para Sí, 2 para No):");
            opcion =  teclado.nextInt();
        if(opcion == 1){
            dado = aleatorio.nextInt((max - min + 1)) + min;
            System.out.println("su opcion es : "+dado);
            continue;
        }else{
            System.out.println("Su valor final es: "+ valor);
            break;
        }
        }
        else if(dado == 2){
            System.out.println("Perdiste la mitad de tu monto :(");
            valor = valor/2;
            System.out.println("Su nuevo valor es: "+ valor);
            System.out.println("Desea continuar jugando? 1 para Si y 2 para No: ");
            opcion =  teclado.nextInt();
            if(opcion == 1){
                dado = aleatorio.nextInt((max - min + 1)) + min;
                System.out.println("su opcion es : "+dado);
                continue;
            }else{
                System.out.println("Su valor final es: "+ valor);
                break;
            }
        }else{
            System.out.println("Pierdes todo");
            valor = 0;
            System.out.println("Su valor final es: "+ valor);
            continuar = false;
        }
        }while(continuar);

    }
}