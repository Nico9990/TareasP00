public abstract class Envio {
    public double costoBase;
    public double peso;

    public Envio(double costoBase, double peso) {
        this.costoBase = costoBase;
        this.peso = peso;
    }


    public void validarPeso() {
        if(peso<0){
            System.out.println("No existe peso en el paquete");
        }else {
            System.out.println("Existe peso en el paquete"+peso);
        }
    }

    public abstract double calcularTiempoYCostoEntrega();
}