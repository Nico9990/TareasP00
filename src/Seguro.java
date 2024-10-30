public abstract class Seguro {
    public String nombreTitular;
    public double valorAsegurado;

    public Seguro(String nombreTitular, double valorAsegurado) {
        this.nombreTitular = nombreTitular;
        this.valorAsegurado = valorAsegurado;
    }
    public abstract void CalcularPrima(double valorAsegurado);

    public void detalleSeguro() {
     System.out.println("Nombre del titular: " + nombreTitular);
     System.out.println("Valor segurado: " + valorAsegurado);
     CalcularPrima(valorAsegurado);
    }
}
