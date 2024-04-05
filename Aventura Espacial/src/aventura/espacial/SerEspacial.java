package aventura.espacial;

public abstract class SerEspacial {
    protected String nombre;
    protected int nivel;

    public SerEspacial(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public abstract void interactuar();
}
