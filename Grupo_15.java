/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo_15;

public class Grupo_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // Crear instancias de Doctor y Deportista
            Persona doctor = new Doctor("Juan", 45);
            Persona deportista = new Deportista("Carlos", 25);

            // Llamar a los métodos trabajar()
            doctor.trabajar();       // Imprimirá: El doctor está tratando a los pacientes.
            deportista.trabajar();   // Imprimirá: El deportista está entrenando.
        }
    
}
