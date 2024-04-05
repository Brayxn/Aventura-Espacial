package aventura.espacial;

import java.util.ArrayList;
import java.util.List;

public class Planeta {
    private String nombre;
    private List<SerEspacial> habitantes;

    public Planeta(String nombre) {
        this.nombre = nombre;
        this.habitantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void añadirHabitante(SerEspacial ser) {
        habitantes.add(ser);
        System.out.println(ser.nombre + " ha sido añadido a " + nombre);
    }

    public void explorarPlaneta() {
        System.out.println("Explorando el planeta " + nombre);
        for (SerEspacial ser : habitantes) {
            ser.interactuar();
        }
    }
}


