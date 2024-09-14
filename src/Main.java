//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("1.-Calculo Direfencial", "A01", "Juan");
        Curso curso2 = new Curso("2.-Calculo Integral", "A02", "Pepe");
        Curso curso3 = new Curso("3.-Quimica", "A03", "Nico");
        Curso curso4 = new Curso("4.-Administracion", "A04", "Fernando");

        System.out.println("Estos son los cursos disponibles actualmente solo puedes cursar 3 de los 4 selecciona"+"\n");
        curso1.mostrarInfoCurso();
        curso2.mostrarInfoCurso();
        curso3.mostrarInfoCurso();
        curso4.mostrarInfoCurso();

        Scanner entrada = new Scanner(System.in);

        Estudiante e1 = new Estudiante("Pepe", "A9000");

        for (int i = 0; i < 3; i++) {
            System.out.println("Selecciona 3 de los 4 cursos disponibles con numeros del 1 al 4 y 5 si deseas salirte,seleccion no:" + (i + 1) + ": ");
            int x = entrada.nextInt();
            switch (x) {
                case 1:
                    e1.agregarCurso(curso1.nombreCurso);
                    break;
                case 2:
                    e1.agregarCurso(curso2.nombreCurso);
                    break;
                case 3:
                    e1.agregarCurso(curso3.nombreCurso);
                    break;
                case 4:
                    e1.agregarCurso(curso4.nombreCurso);
                    break;
                case 5:
                    System.out.println("Nos vemos.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("No es posible esa seleccion.");
            }
        }

        e1.mostrarInformacion();
    }
}
