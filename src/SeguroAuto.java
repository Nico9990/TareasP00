public class SeguroAuto extends Seguro {
public int valorBase;
public int EdadTitular;

    public SeguroAuto(String nombreTitular, double valorAsegurado, int edadTitular, int valorBase) {
        super(nombreTitular, valorAsegurado);
        EdadTitular = edadTitular;
        this.valorBase =valorBase;
    }
    @Override
    public void CalcularPrima(double valorAsegurado){
        double prima;
        if(EdadTitular > 25){
            prima = valorBase + (valorAsegurado * 0.05);
        } else {
            prima = valorBase + (valorBase*0.15);
        }
            System.out.println("La materia prima del auto es:"+prima);
    }
    @Override
    public void detalleSeguro() {
        super.detalleSeguro();
        System.out.println("El edad del titutar del seguro:"+EdadTitular);
        System.out.println("El valor base es:"+valorBase);
    }
}
