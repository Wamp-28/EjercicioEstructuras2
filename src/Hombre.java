import java.util.Scanner;

public class Hombre {
    protected String nombre;

    public Hombre(String nombre) {
        this.nombre = nombre;
    }

    public void jugarConRobot(Robot robot) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Avanzar pasos");
            System.out.println("2. Retroceder pasos");
            System.out.println("3. Ver energía actual");
            System.out.println("4. Dormir al robot ");
            System.out.println("5. Despertar al robot");
            System.out.println("6. Recargar batería");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    if (robot.seDurmio()) {
                        System.out.println("El robot está dormido. No puede avanzar.");
                    } else if (robot.bateriaVacia()) {
                        System.out.println("La batería está vacía. Recargue primero.");
                    } else {
                        System.out.print("Ingrese cantidad de pasos a avanzar: ");
                        int pasos = scanner.nextInt();
                        robot.avanzar(pasos);
                    }
                }
                case 2 -> {
                    if (robot.seDurmio()) {
                        System.out.println("El robot está dormido. No puede retroceder.");
                    } else if (robot.bateriaVacia()) {
                        System.out.println("La batería está vacía. Recargue primero.");
                    } else {
                        System.out.print("Ingrese cantidad de pasos a retroceder: ");
                        int pasos = scanner.nextInt();
                        robot.retroceder(pasos);
                    }
                }
                case 3 -> {
                    System.out.println("Energía actual del robot: " + robot.energiaActual() + " unidades.");
                }
                case 4 -> {
                    robot.dormir();
                    System.out.println("Sesión fializada ");
                }
                case 5 -> {
                    robot.despertar();
                }
                case 6 -> {
                    robot.recargar();
                }
                default -> {
                    System.out.println("Opción no válida. Intente nuevamente.");
                }
            }
        } while (!robot.seDurmio());

        System.out.println(nombre + " ha terminado de jugar. El robot quedó dormido.");
    }
}
