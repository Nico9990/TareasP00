public class EnvioInternacional extends Envio{
    public String destino;

    public EnvioInternacional(double costoBase, double peso, String destino) {
        super(costoBase, peso);
        this.destino = destino;
    }
    public void calcularTiempoYCostoEntrega() {
        if (super.validarPeso()==true){
        int diasEntrega = 10;
        if (peso > 10) {
            diasEntrega = diasEntrega + 3;
        }

        double costoFinal = costoBase;
        costoFinal += costoBase * 0.20;


        System.out.println("Entrega en: " + diasEntrega + " días");
        System.out.println("Costo: $" + costoFinal);

     }else {
            System.out.println("Ingresa un peso valido Por favor");
        }
    }

}
