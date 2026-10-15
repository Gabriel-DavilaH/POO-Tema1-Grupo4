
import java.util.Scanner;

public class Estudiante {

    String nombre;
    String apellido;
    int edad;
    String carrera;
    int semestre;

    public Estudiante(String nombre, String apellido, int edad, String carrera, int semestre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public void mostrarDatos() {
        System.out.println("\n================================");
        System.out.println("       DATOS DEL ESTUDIANTE");
        System.out.println("================================");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
        System.out.println("================================");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== REGISTRO DE ESTUDIANTE ===");

        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = entrada.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(entrada.nextLine());

        System.out.print("Ingrese su carrera: ");
        String carrera = entrada.nextLine();

        System.out.print("Ingrese su semestre: ");
        int semestre = Integer.parseInt(entrada.nextLine());

        Estudiante estudiante = new Estudiante(
            nombre, apellido, edad, carrera, semestre
        );

        estudiante.mostrarDatos();

        entrada.close();
    }
}
