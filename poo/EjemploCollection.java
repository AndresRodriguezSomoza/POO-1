import java.util.Collection;
import java.util.ArrayList;

public class EjemploCollection {
    public static void main(String[] args) {
        
        // Declaramos la coleccion (agregamos una lista)
        Collection<String> nombres = new ArrayList<>();

        // Agregar elementos
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");

        System.out.println("Nombres: " + nombres);

        // Eliminar un elemento
        nombres.remove("Carlos");

        System.out.println("Despues de eliminar a Carlos: " + nombres);
    }
}
