public class EnvioNacional extends Envio {

    public int distanciaKM;
    public EnvioNacional(double costoBase, double peso,int distanciaKM) {
        super(costoBase, peso);
        this.distanciaKM = distanciaKM;
    }
  @Override
    public void calcularTiempoYCostoEntrega() {
      if (super.validarPeso()==true){
          int diasEntrega = (distanciaKM / 200);
          int residuo=distanciaKM%200;
          if(distanciaKM<199 && distanciaKM>0){
              diasEntrega=diasEntrega+1;
          } else if (distanciaKM>200) {
              diasEntrega=diasEntrega+1;
          }

          double costoFinal = costoBase;
          if (peso > 5) {
              costoFinal = costoFinal + (costoBase * 0.05);
          }
          // Muestra los resultados
          System.out.println("Entrega en: " + diasEntrega + " días");
          System.out.println("Costo: $" + costoFinal);

      } else{
          System.out.println("Ingresa un peso valido Por Favor");
      }
  }
}


