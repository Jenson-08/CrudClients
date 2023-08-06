/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author jenso
 */
public class Persona {
    String cedula;
    String nombre;

    public Persona(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }
     public Persona() {
      
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String id) {
        this.nombre = id;
    }
    
}
