import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.println("Ingresa el salario del empleado:");
        Double sueldo = entrada.nextDouble();

        System.out.println("Ingresa la bonificación:");
        Double Bonos = entrada.nextDouble();

        System.out.println("Ingresa las horas extras a pagar:");
        Double HorasExtras = entrada.nextDouble();

        // Objeto
        Empleado empleado1 = new Empleado(sueldo, Bonos, HorasExtras);

        if (Bonos > 0 && HorasExtras > 0) {
            System.out.println("El sueldo del empleado .out.pries: " + empleado1.CalcularSalario1(HorasExtras));
        } else if (Bonos > 0) {
            System.out.println("El sueldo del empleado es: " + empleado1.CalcularSalario(sueldo));
        } else {
            System.out.println("El sueldo del empleado es: " + empleado1.CalcularSalario());
        }
    }
}
