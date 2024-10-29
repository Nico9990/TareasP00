public class EnvioNacional extends Envio {

    public int distanciaKM;
    public EnvioNacional(double costoBase, double peso,int distanciaKM) {
        super(costoBase, peso);
        this.distanciaKM = distanciaKM;
    }
  @Override
    public double calcularTiempoYCostoEntrega() {
      int diasEntrega = (distanciaKM / 200);     int residuo=distanciaKM%200;
      if(){
      }

      double costoFinal = costoBase;
      if (peso > 5) {
          costoFinal = costoFinal + (costoBase * 0.05);
      }
      // Muestra los resultados
      System.out.println("Tiempo de entrega: " + diasEntrega + " días");
      System.out.println("Costo de entrega: $" + costoFinal);

      return costoFinal;
  }
}


