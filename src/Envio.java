public abstract class Envio {
    public double costoBase;
    public double peso;

    public Envio(double costoBase, double peso) {
        this.costoBase = costoBase;
        this.peso = peso;
    }


    public boolean validarPeso() {
        if(peso<0.1){
            System.out.println("No existe peso en el paquete");
            return false;
        }else {
            System.out.println("Existe peso en el paquete:"+peso);
            return true;
        }
    }

    public abstract void calcularTiempoYCostoEntrega();
}