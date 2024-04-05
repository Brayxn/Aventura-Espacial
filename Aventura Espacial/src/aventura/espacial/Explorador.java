package aventura.espacial;

public class Explorador extends SerEspacial implements ClaseAstronauta {
    public Explorador(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void interactuar() {
        System.out.println(nombre + " interactúa con el entorno...");
    }

    @Override
    public void usarHabilidadEspecial() {
        System.out.println(nombre + " utiliza su habilidad especial de exploración.");
    }

    // Nuevo método para explorar planetas en detalle
    public void explorarPlanetaDetalladamente(Planeta planeta) {
        System.out.println(nombre + " está explorando detalladamente el planeta " + planeta.getNombre());
        // Lógica para explorar el planeta en detalle
    }
    public void recolectarRecursos() {
        System.out.println(nombre + " está recolectando recursos...");
    }
}
