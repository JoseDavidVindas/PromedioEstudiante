import java.util.ArrayList;

/**
 * Clase que representa un estudiante, que extiende la clase Persona.
 */
public class Estudiante extends Persona {

    private ArrayList<Double> notas;

    /**
     * Constructor de la clase Estudiante.
     *
     * @param nombre Nombre del estudiante.
     * @param edad   Edad del estudiante.
     * @param notas  Lista de notas del estudiante.
     */
    public Estudiante(String nombre, int edad, ArrayList<Double> notas) {
        super(nombre, edad);
        this.notas = notas;
    }

    /**
     * Obtiene las notas del estudiante.
     *
     * @return Lista de notas del estudiante.
     */
    public ArrayList<Double> getNotas() {
        return notas;
    }

    /**
     * Establece las notas del estudiante.
     *
     * @param notas Lista de notas del estudiante.
     */
    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    /**
     * Calcula el promedio de las notas del estudiante.
     *
     * @return Promedio de las notas del estudiante.
     */
    public double calcularPromedio() {
        double suma = 0;
        for (Double nota : notas) {
            suma += nota;
        }
        return notas.isEmpty() ? 0 : suma / notas.size();
    }
}
