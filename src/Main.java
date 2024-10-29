
public class Main {
    public static void main(String[] args) {
       Envio envioNacional=new EnvioNacional(300.00,6.0,600);
       envioNacional.calcularTiempoYCostoEntrega();

        System.out.printf("+++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

       Envio envioInternacional=new EnvioInternacional(500,12.0,"España");
       envioInternacional.calcularTiempoYCostoEntrega();

    }
}