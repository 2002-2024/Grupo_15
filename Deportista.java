/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo_15;

// Subclase Deportista que hereda de Persona
class Deportista extends Persona {

    // Constructor de la subclase
    public Deportista(String nombre, int edad) {
        super(nombre, edad);
    }

    // Sobrescribiendo el método trabajar() en Deportista
    @Override
    public void trabajar() {
        System.out.println("El deportista " + getNombre() + " está entrenando.");
    }
}
