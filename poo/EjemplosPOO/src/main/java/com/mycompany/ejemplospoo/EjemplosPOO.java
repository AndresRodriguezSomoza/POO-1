package com.mycompany.ejemplospoo;
import java.util.Collection; // Para collection
import java.util.List; // Para list
import java.util.ArrayList;
import java.util.Map; // Para map
import java.util.HashMap;
import java.util.Scanner;
import java.io.UnsupportedEncodingException; // Para el soporte UTF-8

/**
 *
 * @author poo-group
 */
public class EjemplosPOO {
    /********************************************************* LOS 3 EJEMPLOS DIFERENTES <**********************************************************************/

    // Método con Collection
    public static void ejemploCollection() {
        System.out.println("\n=== EJEMPLO COLLECTION ===");
        
        // Como se declara una collection?
        Collection<String> nombres = new ArrayList<>();

        // Como se agregan valores en una collection?
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");

        System.out.println("Nombres: " + nombres);

        // Como se eliminan valores en una collection?
        nombres.remove("Carlos");

        System.out.println("Después de eliminar a Carlos: " + nombres);
    }
    
    // Método con List
    public static void ejemploList() {
        System.out.println("\n=== EJEMPLO LIST ===");
        
        // Como se declara una list?
        List<String> nombres = new ArrayList<>();

        // Como se añaden valores en una list?
        nombres.add("Cali");
        nombres.add("Alicia");
        nombres.add("Misty");

        System.out.println("Lista de nombres: " + nombres);

        // Como eliminar valores de una list metodo uno por valor
        nombres.remove("Alicia");

        System.out.println("Después de eliminar a Alicia: " + nombres);

        // Como eliminar valores de una list metodo dos por indice
        nombres.remove(0);

        System.out.println("Después de eliminar en índice 0: " + nombres);
    }
    
    // Método con Map
    public static void ejemploMap() {
        System.out.println("\n=== EJEMPLO MAP ===");
        
        // Como se declara un map?
        Map <Integer, String>alumno=new HashMap<>();
        Scanner reader =new Scanner (System.in);
        int numb1, numb2;
        
        //Como se añaden valores en un map?
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
        
        //Como se eliminan valores en un map?
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
    
    /********************************************************* MENU PRINCIPAL <**********************************************************************/
    
    public static void main(String[] args) {
        try {
            // Configurar la consola para usar UTF-8
            System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            System.out.println("Error: UTF-8 no soportado en este sistema");
        }
        
        Scanner reader = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Ejecutar Ejemplo Collection");
            System.out.println("2. Ejecutar Ejemplo List");
            System.out.println("3. Ejecutar Ejemplo Map");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opcion: ");
            
            opcion = reader.nextInt();
            
            switch (opcion) {
                case 1:
                    ejemploCollection();
                    break;
                case 2:
                    ejemploList();
                    break;
                case 3:
                    ejemploMap();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intenta de nuevo.");
            }
            
        } while (opcion != 4);
        
        reader.close();
    }
}
