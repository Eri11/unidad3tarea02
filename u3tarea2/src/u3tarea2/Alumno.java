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
public class Alumno {
    private String apellido;
    private String nombre;
    private String grupo;
    private float calif;

    

    public Alumno(String apellido, String nombre, String grupo, float calif) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.grupo = grupo;
        this.calif = calif;
    }

    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public float getCalif() {
        return calif;
    }

    public void setCalif(float calif) {
        this.calif = calif;
    }
    
    
    @Override
    public String toString() {
        return "|| " +apellido+ ", " +nombre+ " || " +grupo+ " || " +calif+ " ||";
    }
    
    
    
}
