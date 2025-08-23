package com.mycompany.ejemplospoo;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author poo-group
 */
public class EjemploList {
    public static void main(String[] args) {
        
        // Como se declara una list?
        List<String> nombres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Como se añaden valores en una list?
        nombres.add("Cali");
        nombres.add("Alicia");
        nombres.add("Misty");

        System.out.println("Lista de nombres: " + nombres);
        
        System.out.print("Ingresa un nombre para agregar: ");
        String nuevoNombre = scanner.nextLine();
        nombres.add(nuevoNombre);

        System.out.println("Después de agregar: " + nombres);

        // Como eliminar valores de una list metodo uno
        nombres.remove("Alicia");

        System.out.println("Despues de eliminar a Alicia: " + nombres);

        // Como eliminar valores de una list metodo dos
        nombres.remove(0); // elimina el primer elemento ("Cali")

        System.out.println("Despues de eliminar en indice 0: " + nombres);
    }
}
