public class SeguroHogar extends Seguro {
    public int valorBase;
    public boolean ZonaRiesgosa;

    public SeguroHogar(String nombreTitular, double valorAsegurado, int valorBase, boolean zonaRiesgosa) {
        super(nombreTitular, valorAsegurado);
        this.valorBase = valorBase;
        ZonaRiesgosa = zonaRiesgosa;
    }

    @Override
    public void CalcularPrima(double valorAsegurado) {
        double prima;
     if(ZonaRiesgosa==true){
      prima=valorBase+valorBase*0.20;
     } else {
         prima=valorBase+valorAsegurado*0.02;
     }
     System.out.println("El valor de la prima para el hogar es:"+prima);
    }

    @Override
    public void detalleSeguro() {
        super.detalleSeguro();
        String zona;
        if (ZonaRiesgosa==true){
            zona="Si";
        }else{
            zona="No";
        }
        System.out.println("Se encuetra en una zona riesgosa:"+zona);
        System.out.println("El valor base es:"+valorBase);
    }
}
