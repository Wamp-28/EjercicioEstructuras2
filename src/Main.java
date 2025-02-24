public class Main {
    public static void main(String[] args) {


        //uso del switch antiguo
        int A = 1;
        switch (A){
            case 1: System.out.println("A es igual a 1"); break;
            case 2: System.out.println("A es igual a 2"); break;
            case 3: System.out.println("A es igual a 3"); break;
            default: System.out.println("No se cumplio ningun caso");
        }
        //el switch evalua los casos y ejecuta el cual se alinea con la condicion
        // A al ser igual a 1 nos arroja la impresion del caso 1

        //uso del switch nuevo

        int Dia = 1;
        String Materia = switch (Dia) {
            case 1 , 3 -> "Estructura de datos";
            case 2, 4 -> "Algebra lineal" ;
            case 5 -> "Calculo";
            default -> "Es fin de semana";

        };
        System.out.println(Materia); 
    }
    // Como funciona este nuevo switch:
    /*Permite retornar un Dato dependiendo de los casos
    en este caso devuelve un string que es la materia segun el caso del dia */



    }
