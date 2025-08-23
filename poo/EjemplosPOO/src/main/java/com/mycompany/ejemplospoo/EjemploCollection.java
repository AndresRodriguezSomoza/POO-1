package com.mycompany.ejemplospoo;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author poo-group
 */
public class EjemploCollection {
    public static void main(String[] args) {
        
        // Como se declara una collection?
        Collection<String> nombres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Como se agregan valores en una collection?
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");

        System.out.println("Nombres: " + nombres);
        
        // Añadir un nombre más
        System.out.print("Ingresa un nombre para agregar: ");
        String nuevoNombre = scanner.nextLine();
        nombres.add(nuevoNombre);

        System.out.println("Después de agregar: " + nombres);

        // Como se eliminan valores en una collection?
        nombres.remove("Carlos");

        System.out.println("Despues de eliminar a Carlos: " + nombres);
        
        scanner.close();
    }
}
