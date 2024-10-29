public class EnvioInternacional extends Envio{
    public String destino;

    public EnvioInternacional(double costoBase, double peso, String destino) {
        super(costoBase, peso);
        this.destino = destino;
    }
    public double calcularTiempoYCostoEntrega() {
        int diasEntrega = 10;
        if (peso > 10) {
            diasEntrega += 3;
        }

        double costoFinal = costoBase;
        if ("internacional".equalsIgnoreCase(destino)) {
            costoFinal += costoBase * 0.20;
        }

        System.out.println("Tiempo de entrega: " + diasEntrega + " días");
        System.out.println("Costo de entrega: $" + costoFinal);

        return costoFinal;
    }

}
