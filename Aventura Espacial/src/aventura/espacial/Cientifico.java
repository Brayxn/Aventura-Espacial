package aventura.espacial;

public class Cientifico extends SerEspacial implements ClaseAstronauta {
    public Cientifico(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void interactuar() {
        System.out.println(nombre + " interactúa con el entorno...");
    }

    @Override
    public void usarHabilidadEspecial() {
        System.out.println(nombre + " utiliza su habilidad especial científica.");
    }
}