/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u3tarea2;

/**
 *
 * @author erika
 */
public class Nodo {
    
    public Alumno dato;
    public Nodo siguiente;
    
    
    public Nodo(Alumno dato, Nodo siguiente){
        this.siguiente = siguiente;
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Alumno getDato() {
        return dato;
    }

    public void setDato(Alumno dato) {
        this.dato = dato;
    }
    
}
