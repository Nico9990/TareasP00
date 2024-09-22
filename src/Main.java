import consultorios.Consultorio;
import hospital.Hospital;
import pacientes.Paciente;
import medicos.Medico;
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
        Hospital hospital=new Hospital();
        int opcion = 0;
        while (opcion != 12) {
            System.out.println("\n*** SISTEMA HOSPITAL***");
            System.out.println("1.Registrar Paciente ");//punto no1 con su mostrar
            System.out.println("2.Registrar Medico ");//punto no2 son su mostrar esta
            System.out.println("3.Registrar Consultorio ");
            System.out.println("4.Registrar Consulta ");//punto no 3 con su mostrar
            System.out.println("5.Mostrar Pacientes ");
            System.out.println("6.Mostrar Medicos");
            System.out.println("7.Mostrar Consultorios");
            System.out.println("8. Mostrar consultas");
            System.out.println("9. Mostrar Paciente por Id");
            System.out.println("10.Mostrar Medico por Id");
            System.out.println("11.Mostrar Consultorio por Id");
            System.out.println("12. Salir");
            System.out.println("Selecciona una opción: ");
            opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\nSeleccionaste la opción para Registrar Paciente");

                    String id=hospital.generarIdPaciente();
                    System.out.println(id);

                    System.out.println("Ingresa el nombre del paciente ");
                    String nombre= scanner.nextLine();

                    System.out.println("Ingresa el apellido del paciente ");
                    String apellido= scanner.nextLine();

                    System.out.println("Ingresa la fecha de nacimiento del paciente ");
                    String fechaNacimiento= scanner.nextLine();

                    System.out.println("Ingresa el tipo de sangre del paciente ");
                    String tipoSangre= scanner.nextLine();

                    System.out.println("Ingresa el telefono del paciente ");
                    String numeroTelefono= scanner.nextLine();

                    System.out.println("Ingresa el sexo del paciente ");
                    String sexoString= scanner.nextLine();
                    char sexo= sexoString.charAt(0);
                    Paciente paciente =new Paciente(id,nombre,apellido,fechaNacimiento,tipoSangre,numeroTelefono,sexo);
                    hospital.registrarPaciente(paciente);
                    System.out.println(" Paciente registrado correctamente ");
                    break;
                case 2:
                    System.out.println("\nSeleccionaste la opción para Registrar Medico ");



                    System.out.println("Ingresa el nombre del Medico");
                    String nombreMedico= scanner.nextLine();

                    System.out.println("Ingresa el apellido del Medico");
                    String apellidoMedicoString= scanner.nextLine();
                    char apellidoMedico= apellidoMedicoString.charAt(0);
                    char apellidoMedico1= apellidoMedicoString.charAt(1);

                    System.out.println("Ingresa la fecha de nacimiento del Medico Ex:2005-09-01");
                    String fechaNacimientoMedico= scanner.nextLine();
                    char fechaNacimiento1= fechaNacimientoMedico.charAt(3);

                    System.out.println("Ingresa el numero de telefono del Medico");
                    String numeroTelefonoMedico= scanner.nextLine();

                    System.out.println("Ingresa el rfc del Medico");
                    String rfcMedico= scanner.nextLine();

                    String idMedico=hospital.generarIdMedico(apellidoMedico,apellidoMedico1,fechaNacimiento1);
                    System.out.println(idMedico);

                    Medico medico =new Medico(idMedico,nombreMedico,apellidoMedicoString,fechaNacimientoMedico,numeroTelefonoMedico,rfcMedico);
                    hospital.registrarMedico(medico);

                    //idMedico marcaba error ya que el constructor que teniamos esperaba un id int y nosotros son las modificaciones que hicimos era string entonces tenemos que cambiar los int por string
                    break;
                case 3:
                    System.out.println("\nSeleccionaste la opción para Registrar Consultorio ");

                    System.out.println("Ingresa el piso en el que se encuentra el consultorio");
                    int piso= scanner.nextInt();

                    System.out.println("Ingresa el numero de consultorio");
                    int numeroConsultorio= scanner.nextInt();

                    String idConsultorio=hospital.generarIdConsultoio();
                    System.out.println(idConsultorio);

                  Consultorio consultorio=new Consultorio(idConsultorio,numeroConsultorio,piso);
                    hospital.registrarConsultorio(consultorio);
                    break;
                case 4:
                    System.out.println("\nSeleccionaste la opción para Registrar Consulta ");
                    break;
                case 5:
                    System.out.println("\nSeleccionaste la opción para Mostrar Pacientes ");
                    hospital.mostrarPacientes();
                    break;
                case 6:
                    System.out.println("\nSeleccionaste la opción para Mostrar Medicos");
                    hospital.mostrarMedico();
                    break;

                case 7:
                    System.out.println("\nSeleccionaste la opción para Mostrar Consultorios");
                    hospital.mostrarConsultorios();
                    break;
                case 8:
                    System.out.println("\nSeleccionaste la opción para Mostrar Consulta");
                    break;
                case 9:
                    System.out.println("/nSeleccionaste la opcion de Mostrar Paciente por Id ingresalo");
                    String idPaciente =scanner.nextLine();

                    hospital.mostrarPacientePorId(idPaciente);
                    break;
                case 10:
                    System.out.println("/nSeleccionaste la opcion de Mostrar Medico por Id ingresalo");
                    String idMedico2 =scanner.nextLine();
                    hospital.mostrarMedicoPorId(idMedico2);
                    break;
                case 11:
                    System.out.println("/nSeleccionaste la opcion de Mostrar Consultorio por Id ingresalo");
                    String idConsultorio2 =scanner.nextLine();
                    hospital.mostrarConsultorioPorId(idConsultorio2);
                    break;
                case 12:
                    System.out.println("Hasta luego");
                    return;
            }
        }
    }
}
