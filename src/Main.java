import java.util.Random;
import java.util.Scanner;

public class Main {
            public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);
                Random dado = new Random();

                int vida = 15;
                int experiencia = 0;
                boolean envenenado = false;

                System.out.println("""
                        *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
                        ¡Bienvenido a la Dimensión Mágica!
                        *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
                        """);
                System.out.println("""
                        *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                        Tu objetivo es alcanzar 50 puntos de experiencia antes de que tu vida llegue a 0.
                        *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                        """);
                System.out.println("""
                        *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                        Presiona Enter para lanzar el dado
                        *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                        """);

                while (vida > 0 && experiencia < 50) {
                    teclado.nextLine();
                    int lanzamiento = dado.nextInt(12) + 1;
                    System.out.println("Lanzaste el dado y obtuviste: " + lanzamiento);

                    switch (lanzamiento) {
                        case 1, 2 -> {
                            vida += 1;
                            System.out.println("""
                                    *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
                                    Encuentras una fuente de vida. Ganas +1 punto de vida.
                                    *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
                                    """);
                        }
                        case 3, 4, 5 -> {
                            vida -= 5;
                            System.out.println("""
                                    *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
                                    Eres atacado brutalmente. Pierdes -5 puntos de vida.
                                    *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
                                    """);
                        }

                        case 6, 7 -> {
                            experiencia += 3;
                            System.out.println("""
                        *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
                        Ganas experiencia en la aventura. Obtienes +3 puntos de experiencia.
                        *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
                        """);
                        }

                        case 8, 9 -> {
                            experiencia -= 6;
                            if (experiencia < 0) experiencia = 0;
                            System.out.println("""
                        *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                        Cometes un error grave. Pierdes -6 puntos de experiencia.
                        *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                        """);
                        }
                        case 10, 11 -> {
                            vida -= 8;
                            System.out.println("Caes en una trampa letal. Pierdes -8 puntos de vida.");
                        }
                        case 12 -> {
                            int eventoEspecial = dado.nextInt(3) + 1;
                            switch (eventoEspecial) {
                                case 1 -> {
                                    experiencia += 10;
                                    System.out.println("""
                                *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
                                Encuentras un pergamino antiguo. Obtienes +10 puntos de experiencia.
                                *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
                                """);
                                }
                                case 2 -> {
                                    envenenado = true;
                                    System.out.println("""
                                *--*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
                                Te infectas con veneno. Perderás -2 puntos de vida por turno.
                                *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                                """);
                                }
                                case 3 -> {
                                    vida /= 2;
                                    System.out.println("""
                                *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
                                Un demonio te ataca. Tu vida se reduce a la mitad.
                                *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
                                """);
                                }
                            }
                        }
                    }

                    if (envenenado) {
                        vida -= 2;
                        System.out.println("""
                    *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                    El veneno hace efecto. Pierdes -2 puntos de vida.
                    *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                    """);
                    }
                    System.out.println("Vida: " + vida + " | Experiencia: " + experiencia);
                    System.out.println("------------------------------------");
                }

                if (vida <= 0) {
                    System.out.println("""
                *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                Tu vida ha llegado a 0. Has sido derrotado. ¡Fin del juego!
                *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                """);
                } else {
                    System.out.println("""
                *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                ¡Felicidades! Has alcanzado 50 puntos de experiencia y escapaste de la dimensión.
                *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                """);
                }

                teclado.close();
            }
        }

