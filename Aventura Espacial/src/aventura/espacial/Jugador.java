package aventura.espacial;

public class Jugador extends SerEspacial implements AccionesEspaciales {
    private int experiencia;

    public Jugador(String nombre, int nivel) {
        super(nombre, nivel);
        this.experiencia = 0;
    }

    @Override
    public void explorar() {
        System.out.println(nombre + " está explorando un nuevo planeta...");
    }

    @Override
    public void recolectarRecursos() {
        System.out.println(nombre + " está recolectando recursos...");
    }

    @Override
    public void interactuar() {
        System.out.println(nombre + " interactúa con el entorno...");
    }

    public void ganarExperiencia(int exp) {
        this.experiencia += exp;
        System.out.println(nombre + " ha ganado " + exp + " puntos de experiencia.");
    }
}
