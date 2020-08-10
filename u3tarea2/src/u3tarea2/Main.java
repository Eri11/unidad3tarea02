/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u3tarea2;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author erika
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Lista listaAlumnos = new Lista();
        
        int opcion = 0;
        String apellido = null, nombre = null, grupo = null;
        float calif = 0;
        
        
        
        do{
            
            System.out.println("\nElige una opción:");
            System.out.println("1. Agregar un nombre al Inicio de la Lista \n2. Mostrar los Datos de la Lista\n"
                    + "3. Salir\n");

            
            opcion = input.nextInt();
            
            try{
                switch(opcion){
                    case 1:
                        try{
                           
                            System.out.print("APELLIDO: ");
                            apellido = input.next();
                            
                            System.out.print("NOMBRE: ");
                            nombre = input.next();
                            
                            System.out.print("GRUPO: ");
                            grupo = input.next();
                            
                            System.out.print("CALIFICACIÓN: ");
                            calif = input.nextFloat();
                            
                            
                            listaAlumnos.insertarLista(new Alumno(apellido,nombre,grupo,calif));
                            
                        }catch(NumberFormatException n){
                            System.out.println("Error " + n.getMessage());
                        
                        }
                        
                    break;
                        
                        
                    case 2:
                        
                        System.out.println("Alumnos");
                        
                        listaAlumnos.mostrarLista();
                        
                        System.out.println("\n");
                        
                    break;
                        
                    case 3:
                        
                        System.out.println("3. Fin de sesión");
                        
                    break;
                        
                    default:
                        System.out.println("Opción incorrecta");
                }
            }catch (Exception e){
                System.out.println("Error " + e.getMessage());
            }
            
        }while (opcion != 3);
        
    }
    
 
 
    
    
}
