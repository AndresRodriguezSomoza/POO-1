import java.util.List;
import java.util.ArrayList;

public class EjemploList {
    public static void main(String[] args) {
        
        //Declarar una lista
        List<String> nombres = new ArrayList<>();

        //A�adir valores
        nombres.add("Cali");
        nombres.add("Alicia");
        nombres.add("Misty");

        System.out.println("Lista de nombres: " + nombres);

        //Eliminar un valor
        nombres.remove("Alicia");

        System.out.println("Despues de eliminar a Alicia: " + nombres);

        //Eliminar un valor
        nombres.remove(0); // elimina el primer elemento ("Cali")

        System.out.println("Despues de eliminar en indice 0: " + nombres);
    }
}
