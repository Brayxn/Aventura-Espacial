package aventura.espacial;

public class AventuraEspacialMain {
    public static void main(String[] args) {
        Planeta planetaX = new Planeta("Namek");
        Explorador explorador = new Explorador("Brayan", 1);
        Enemigo enemigo = new Enemigo("Lord", 2);

        planetaX.añadirHabitante(explorador);
        planetaX.añadirHabitante(enemigo);

        explorador.interactuar();
        explorador.recolectarRecursos();
        explorador.usarHabilidadEspecial();

        planetaX.explorarPlaneta();

        // Combate entre el explorador y el enemigo
        if (enemigo instanceof Enemigo) {
            ((Enemigo) enemigo).iniciarCombate(explorador);
        }
    }
}



