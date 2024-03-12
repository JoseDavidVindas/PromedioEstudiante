import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal que solicita al usuario ingresar información sobre un estudiante,
 * calcula el promedio de sus notas y muestra el resultado.
 */
public class Main {

    /**
     * El método principal.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este método).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar nombre, edad y notas del estudiante
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese la cantidad de notas del estudiante: ");
        int cantidadNotas = scanner.nextInt();

        ArrayList<Double> notas = new ArrayList<>();
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas.add(scanner.nextDouble());
        }

        // Crear objeto Estudiante con los datos proporcionados por el usuario
        Estudiante estudiante = new Estudiante(nombre, edad, notas);

        // Calcular y mostrar el promedio de las notas
        double promedio = estudiante.calcularPromedio();
        System.out.println("El promedio de notas del estudiante " + estudiante.getNombre() + " es: " + promedio);
    }
}
