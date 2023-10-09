/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebatrainee;

/**
 *
 * @author Discar
 */
public class Cliente {
    
    private String nombre;
    private String asiento;

    public Cliente(String nombre, String asiento) {
        this.nombre = nombre;
        this.asiento = asiento;
    }
    
    public Cliente(String nombre){
        this.nombre=nombre;
    }
    
    public Cliente(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        return "[X]";
    }
    
    
    
}
