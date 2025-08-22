package edu.udb.poo;  // Añade esto al inicio del archivo
import java.util.Map; // Para usar la interfaz Map (mapeo clave-valor)
import java.util.HashMap; // Implementación concreta de Map usando tablas hash
import javax.swing.JOptionPane; //para utilizar ventanas emergentes
/**
 *
 * @author poo-group
 */


public class AlumnosUDB {

    // Mapa: clave = carnet, valor = nombre completo
    private Map<String, String> alumnos;

    public AlumnosUDB() {
        alumnos = new HashMap<>();
    }
    
    // Método para ingresar nuevo alumno
    public void ingresarAlumno(String carnet, String nombre) {
        if(alumnos.containsKey(carnet)){
            JOptionPane.showMessageDialog(null, "Carnet: "+carnet+", ya esta asignado a otro alumnos", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
         alumnos.put(carnet, nombre); // Agrega o actualiza un alumno al mapa
         JOptionPane.showMessageDialog(null,"Alumno ingresado exitosamente","Alumno ingresado",JOptionPane.INFORMATION_MESSAGE);   
        }
    }

    public void mostrarAlumno(String carnet) {
        if (alumnos.containsKey(carnet)) { // Verifica si el carnet existe
            String nombre = alumnos.get(carnet); // Obtiene el nombre asociado
            JOptionPane.showMessageDialog(null,"Alumno encontrado:\nCarnet: " + carnet + "\nNombre: " + nombre,
            "Éxito",
            JOptionPane.INFORMATION_MESSAGE);
    
        } else {
            JOptionPane.showMessageDialog(null,"Alumno no encontrado, no se puede Mostrar,","Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    // Eliminar alumno por carnet
    public void eliminarAlumno(String carnet) {
        if (alumnos.containsKey(carnet)) {
            alumnos.remove(carnet); // Elimina la entrada del mapa
            JOptionPane.showMessageDialog(null,"Alumno eliminado exitosamente",
            "Eliminado",
            JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,"Alumno no encontrado, No se puede eliminar",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        }
    }

    // Mostrar todos los alumnos
    public void mostrarTodos() {
        if (alumnos.isEmpty()) { // Verifica si el mapa está vacío
           JOptionPane.showMessageDialog(null,"No hay alumnos registrados.",
            "Error",
            JOptionPane.ERROR_MESSAGE); 
            return;
        }
        StringBuilder lista = new StringBuilder("Lista de estudiantes:\n");
    for (Map.Entry<String, String> entry : alumnos.entrySet()) {
        lista.append("Carnet: ").append(entry.getKey()).append(" - Nombre: ").append(entry.getValue()).append("\n");
    }
    JOptionPane.showMessageDialog(null, lista.toString(), "Lista estudiantes", JOptionPane.PLAIN_MESSAGE);
}

    // Menú de consola
    public static void main(String[] args) {
        AlumnosUDB app = new AlumnosUDB(); // Crea una instancia de la clase
        int opcion = -1;

        while (opcion != 5) {
            String imput=JOptionPane.showInputDialog(
            null, "***********************MENU UDB*********************** \n1. Ingresar alumno \n2. Buscar (mostrar) alumno por carnet \n3. Eliminar alumno por carnet \n4. Mostrar todos los alumnos \n5. Salir \nSeleccione una opción: \nSistema de Alumnos ", "Menú de selección",JOptionPane.PLAIN_MESSAGE
            );
            //Si el usuario hace clic en "Cancelar" o cierra la ventana
            if(imput==null){
            opcion=5;
            }else {
            try {
                opcion = Integer.parseInt(imput);// Convierte la entrada a número
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Opción no válida. Intente de nuevo.", "error",JOptionPane.ERROR_MESSAGE);
                continue;
            }
            }
            switch (opcion) {
            case 1:
                String carnetIn = JOptionPane.showInputDialog(null, "Ingrese carnet:", "Carnet del estudiante", JOptionPane.PLAIN_MESSAGE);
                String nombreIn = JOptionPane.showInputDialog(null, "Ingrese nombre completo:", "Nombre del estudiante", JOptionPane.PLAIN_MESSAGE);
                if (carnetIn != null && nombreIn != null && !carnetIn.isEmpty() && !nombreIn.isEmpty()) {
                    app.ingresarAlumno(carnetIn, nombreIn);
                }
                else {
                    JOptionPane.showMessageDialog(
                        null,
                        "Error: Carnet y nombre no pueden estar vacíos",
                        "Datos inválidos",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
                break;
            case 2:
                String carnetBusq = JOptionPane.showInputDialog(null, "Ingrese carnet a buscar:", "Busqueda de estudiantes", JOptionPane.PLAIN_MESSAGE);
                if (carnetBusq != null && !carnetBusq.isEmpty()) {
                    app.mostrarAlumno(carnetBusq);
                }
                break;
            case 3:
                String carnetElim = JOptionPane.showInputDialog(null, "Ingrese carnet a eliminar:", "Eliminar estudiante", JOptionPane.PLAIN_MESSAGE);
                if (carnetElim != null && !carnetElim.isEmpty()) {
                    app.eliminarAlumno(carnetElim);
                }
                break;
            case 4:
                app.mostrarTodos();
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                break;
            default:
                JOptionPane.showMessageDialog(
                    null,
                    "Opción no válida. Intente de nuevo.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }
}