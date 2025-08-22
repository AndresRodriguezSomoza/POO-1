/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.udb.poo;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author aquin
 */
public class EjemploMap {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map <Integer, String>alumno=new HashMap<>();
        Scanner reader =new Scanner (System.in);
        int numb1, numb2;
        
        //Ingresar datos 
        alumno.put(94014, "Eduardo Aquino");
        alumno.put(94015, "Carlos Alexander");
        alumno.put(94016, "Jose Aquino");
        alumno.put(94017, "Flor Eunice");
        
        
        //Busqueda de datos por ContainsValue
        boolean encontrarDato=alumno.containsValue("Jose Aquin");
        //Validacion
        if (encontrarDato != false){
            System.out.println("Se ha encontrado al alumno en la base");
        
        }else{
            System.out.println("No se encontro al alumno en la base");
        }
        
        
                //Busqueda de datos containsKey
        boolean encontrarDato2=alumno.containsKey(94015);
        //Validacion
        if (encontrarDato2 != false){
            System.out.println("Se ha encontrado al alumno en la base");
        
        }else{
            System.out.println("No se encontro al alumno en la base");
        }
        
        //Utilizar funcion values para imprimir todo el dato de alumnos
        
        System.out.println(alumno.values());
        
        //Utilizar funcion values para imprimir todo el dato de alumnos
        System.out.println(alumno.keySet());
        
        //Buscaremos un alumno en particular
        System.out.print("Favor ingresa el carnet del alumno: ");
        numb1=reader.nextInt();
        String nombre=alumno.get(numb1);
        if (nombre ==null){
            System.out.println("Carnet ingresado no pertenece a ningun alumno.");
        }else{
            System.out.println("El alumno con carnet ("+numb1+") es: "+nombre);
        }
        
        //Funcion remover usuario
        System.out.println("Te gustaria eliminar un alumno de la base de datos");
        System.out.print("Ingresa el carnet del alumno: ");
        //validar numb2
        while(!reader.hasNextInt()){
            System.out.println("Error: Debes ingresar un número de carnet válido.");
            System.out.print("Ingresa nuevamente el carnet: ");
            reader.next(); // limpiar entrada inválida
        }numb2=reader.nextInt();//Validacion correcta 
       
        if (alumno.containsKey(numb2)){
        alumno.remove(numb2);
            System.out.println("Alumno con carnet : "+numb2+" fue eliminado"); 
        }else{
            System.out.println("Error, no se encontro estudiante con carnet "+numb2);
        }        
    }
    
}
