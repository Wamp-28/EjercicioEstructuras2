public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int vida = 15;
        int experiencia = 0;
        boolean envenenado = false;

        while (vida > 0 && experiencia < 50) {
            System.out.println("Presiona Enter para lanzar el dado...");
            scanner.nextLine();

            int dado = random.nextInt(12) + 1;
            System.out.println("Sacaste un " + dado);

            switch (dado) {
                case 1:
                case 2:
                    vida += 1;
                    System.out.println("Encuentras una fuente de vida. +1 vida. Vida actual: " + vida);
                    break;
                case 3:
                case 4:
                case 5:
                    vida -= 5;
                    System.out.println("Eres atacado brutalmente. -5 vida. Vida actual: " + vida);
                    break;
                case 6:
                case 7:
                    experiencia += 3;
                    System.out.println("Ganas experiencia en la aventura. +3 experiencia. Experiencia actual: " + experiencia);
                    break;
                case 8:
                case 9:
                    experiencia -= 6;
                    if (experiencia < 0) experiencia = 0;
                    System.out.println("Cometes un error grave. -6 experiencia. Experiencia actual: " + experiencia);
                    break;
                case 10:
                case 11:
                    vida -= 8;
                    System.out.println("Caes en una trampa letal. -8 vida. Vida actual: " + vida);
                    break;
                case 12:
                    int eventoEspecial = random.nextInt(3) + 1;
                    switch (eventoEspecial) {
                        case 1:
                            experiencia += 10;
                            System.out.println("Encuentras un pergamino antiguo. +10 experiencia. Experiencia actual: " + experiencia);
                            break;
                        case 2:
                            envenenado = true;
                            System.out.println("Te infectas con veneno. Perderás -2 de vida por turno.");
                            break;
                        case 3:
                            vida /= 2;
                            System.out.println("Un demonio te ataca. Tu vida se reduce a la mitad. Vida actual: " + vida);
                            break;
                    }
                    break;
            }

            if (envenenado) {
                vida -= 2;
                System.out.println("El veneno te hace perder -2 de vida. Vida actual: " + vida);
            }

            if (vida <= 0) {
                System.out.println("Tu vida llegó a 0. ¡Has muerto!");
                break;
            }

            if (experiencia >= 50) {
                System.out.println("¡Has alcanzado 50 puntos de experiencia y escapado de la dimensión mágica!");
                break;
            }
        }

        scanner.close();
    }
}