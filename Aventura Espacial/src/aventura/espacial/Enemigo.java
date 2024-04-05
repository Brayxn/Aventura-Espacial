package aventura.espacial;

public class Enemigo extends SerEspacial {
    public Enemigo(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void interactuar() {
        System.out.println("El enemigo " + nombre + " aparece y se prepara para el combate!");
    }

    public void iniciarCombate(SerEspacial jugador) {
        System.out.println("¡El enemigo " + nombre + " ataca a " + jugador.nombre + "!");
        // Lógica de combate aquí
    }
}
