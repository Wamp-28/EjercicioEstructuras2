
public class TestJuego {
    public static void main(String[] args) {
        Robot robot = new Robot();

        Hombre hombre1 = new Hombre("Carlos");
        Hombre hombre2 = new Hombre("Pedro");

        System.out.println("\n" + hombre1.nombre + " empieza a jugar:");
        hombre1.jugarConRobot(robot);

        if (robot.estaDormido()) {
            System.out.println("\n" + hombre2.nombre + " intenta jugar:");
            robot.despertar();
        }

        hombre2.jugarConRobot(robot);

        System.out.println("\nPrograma finalizado.");
    }
}
