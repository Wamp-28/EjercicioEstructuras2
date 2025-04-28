public class Robot {
    protected Bateria bateria;
    protected boolean dormido;

    public Robot() {
        this.bateria = new Bateria(1000);
        this.dormido = false;
    }

    public void avanzar(int pasos) {
        if (!dormido && bateria.getCarga() > 0) {
            int consumo = (pasos / 100) * 10;
            int cargaActualizada = bateria.getCarga() - consumo;
            if (cargaActualizada < 0) {
                cargaActualizada = 0;
            }
            bateria.setCarga(cargaActualizada);
            System.out.println("El robot avanzó " + pasos + " pasos.");
        } else {
            System.out.println("El robot no puede avanzar. Está dormido o sin batería.");
        }
    }

    public void retroceder(int pasos) {
        if (!dormido && bateria.getCarga() > 0) {
            int consumo = (pasos / 100) * 10;
            int cargaActualizada = bateria.getCarga() - consumo;
            if (cargaActualizada < 0) {
                cargaActualizada = 0;
            }
            bateria.setCarga(cargaActualizada);
            System.out.println("El robot retrocedió " + pasos + " pasos.");
        } else {
            System.out.println("El robot no puede retroceder.");
        }
    }

    public void dormir() {
        dormido = true;
        System.out.println("El robot está dormido.");
    }

    public void despertar() {
        dormido = false;
        System.out.println("El robot ha despertado.");
    }

    public void recargar() {
        bateria.setCarga(1000);
        System.out.println("La batería se ha recargado a 1000 unidades.");
    }

    public boolean bateriaLlena() {
        return bateria.getCarga() == 1000;
    }

    public boolean bateriaVacia() {
        return bateria.getCarga() == 0;
    }

    public int energiaActual() {
        return bateria.getCarga();
    }

    public boolean seDurmio() {
        return dormido;
    }
}
