//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Ingresa  los ingresos,porcentaje taxes , dividendos y exencion:");
        int ingresos = entrada.nextInt();
        Double porcentajeTaxes = entrada.nextDouble();
        Double dividendos = entrada.nextDouble();
        Double exencion = entrada.nextDouble();

      ;

        CalculadoraImpuestos c1 = new CalculadoraImpuestos(ingresos,porcentajeTaxes,dividendos,exencion);
        System.out.println("Retorno de ingresos es: " + c1.calcularImpuestos1());
        System.out.println("Retorno de ventas es: " + c1.calcularImpuestos2());
        System.out.println("Retorno de dividendos es: " + c1.calcularImpuestos3());

        }



    }
