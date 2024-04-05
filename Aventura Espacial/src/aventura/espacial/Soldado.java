/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aventura.espacial;

public class Soldado extends SerEspacial implements ClaseAstronauta {
    public Soldado(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void interactuar() {
        System.out.println(nombre + " interactúa con el entorno...");
    }

    @Override
    public void usarHabilidadEspecial() {
        System.out.println(nombre + " utiliza su habilidad especial de combate.");
    }
}