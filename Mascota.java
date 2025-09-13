/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;


public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    
public Mascota (String nombre,String especie, int edad){
    this.nombre = nombre;
    this.especie = especie;
    this.edad = edad;
}

public void mostrarInfo(){
    System.out.println("Nombre de la mascota: " + nombre);
    System.out.println("Especie: " + especie);
    System.out.println("Edad de la mascota: " + edad);
}

public void cumplirAnios(){
    edad++;

}
public int getEdad() {
    return edad;
}

    
}
