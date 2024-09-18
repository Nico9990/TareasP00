import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Clases de un Hospital
        -Pacientes
        -Medicos
        -Consultas
        Packetes Paciente clase paciente

         */
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 7) {
            System.out.println("\n*** BIEVENIDO ***");
            System.out.println("1.Registrar Paciente ");
            System.out.println("2.Registrar Medico ");
            System.out.println("3.Registrar Consulta ");
            System.out.println("4.Registrar Consultorio ");
            System.out.println("5. ");
            System.out.println("6. ");
            System.out.println("7. Salir");

            System.out.println("Selecciona una opción: ");
            opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\nSeleccionaste la opción para Registrar Paciente ");
                    break;
                case 2:
                    System.out.println("\nSeleccionaste la opción para Registrar Medico ");

                    break;
                case 3:
                    System.out.println("\nSeleccionaste la opción para Registrar Consulta ");
                    break;
                case 4:
                    System.out.println("\nSeleccionaste la opción para Registrar Consultorio ");
                    break;
                case 5:
                    System.out.println("\nSeleccionaste la opción para");
                    break;
                case 6:
                    System.out.println("\nSeleccionaste la opción para");
                    break;

                case 7:
                    System.out.println("Hasta luego");
                    return;
            }
        }
    }
}
