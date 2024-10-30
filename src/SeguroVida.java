public class SeguroVida extends Seguro {
    public int valorBase;
    public int EdadTitular;

    public SeguroVida(String nombreTitular, double valorAsegurado, int valorBase, int edadTitular) {
        super(nombreTitular, valorAsegurado);
        this.valorBase = valorBase;
        EdadTitular = edadTitular;
    }
    @Override
    public void CalcularPrima(double valorAsegurado){
        double prima;
        if(EdadTitular > 60){
            prima = valorBase + valorBase*0.25;
        } else {
            prima = valorBase + (valorAsegurado*0.015);
        }
        System.out.println("La materia prima del seguro de vida es:"+prima);
    }

    @Override
    public void detalleSeguro() {
        super.detalleSeguro();
        System.out.println("La edad del titutar del seguro:"+EdadTitular);
        System.out.println("El valor base es:"+valorBase);
    }
}
