
public class Principal {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante(
            "Ana", "López", 21, "Ingeniería de Software", 4
        );

        Estudiante estudiante2 = new Estudiante(
            "Luis", "Pérez", 22, "Tecnologías de la Información", 5
        );

        Estudiante estudiante3 = new Estudiante(
            "María", "Gómez", 20, "Ingeniería de Software", 3
        );
System.out.println("INFORMACION DE ESTUDIANTES");

        System.out.println("\nEstudiante 1:");
        System.out.println("Nombre: " + estudiante1.nombre);
        System.out.println("Apellido: " + estudiante1.apellido);
        System.out.println("Edad: " + estudiante1.edad);
        System.out.println("Carrera: " + estudiante1.carrera);
        System.out.println("Semestre: " + estudiante1.semestre);
