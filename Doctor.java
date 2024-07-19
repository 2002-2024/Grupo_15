/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grupo_15;

/**
 *
 * @author DELL GAMING
 */
// Subclase Doctor que hereda de Persona
class Doctor extends Persona {

    // Constructor de la subclase
    public Doctor(String nombre, int edad) {
        super(nombre, edad);
    }

    // Sobrescribiendo el método trabajar() en Doctor
    @Override
    public void trabajar() {
        System.out.println("El doctor " + getNombre() + " está tratando a los pacientes.");
    }
}
