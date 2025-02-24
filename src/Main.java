public class Main {
    public static void main(String[] args) {

        /*System.out.println("Comandos Git");
        System.out.println("git status");
        System.out.println("git add .");
        System.out.println("git commit -m");
        System.out.println("git push origin rama");
        System.out.println("git switch -c rama");
        System.out.println("git switch rama");
        System.out.println("git branch");

        System.out.println("Luis Alejandro Quiroga Diaz");
        System.out.println("Dibujar");
        System.out.println("Videojuegos");
        System.out.println("No tengo mascota");*/

        //SWITCH ANTIGUO
        /*El switch antiguo necesita de un "break" para evitar
        la ejecucion continua.*/

        int dia=3;
        String nombreDia;
        switch(dia){
            case 1:nombreDia = "Lunes";
                break;
            case 2:nombreDia = "Martes";
                break;
            case 3:nombreDia = "Miercoles";
                break;
            case 4:nombreDia = "Jueves";
                break;
            case 5:nombreDia = "Viernes";
                break;
            default:
                nombreDia = "Dia no valido";

        }
            System.out.println(nombreDia);

        //SWITCH NUEVO
        /*El switch nuevo se podria decir que tiene menos errores, ya que
        * no es necesario utilizar el break, si no que se utiliza "->" para
        * indicar el resultado de cada case*/
        String idioma = "ingles";

        String saludo = switch (idioma) {
            case "español" -> "¡Hola!";
            case "ingles" -> "Hello!";
            case "francés" -> "Bonjour!";
            default -> "Idioma no reconocido";
        };

        System.out.println(saludo);
    }
}