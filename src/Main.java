//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la base y altura");
        Double base=entrada.nextDouble();
        Double altura=entrada.nextDouble();
        //Creamos objeto

        Rectangulo r1=new Rectangulo(base,altura);

        System.out.println("El área del rectángulo es: " + r1.calcularAreaPerimetro());
        System.out.println("El perímetro del rectángulo es: " + r1.calcularAreaPerimetro(base));

    }
}