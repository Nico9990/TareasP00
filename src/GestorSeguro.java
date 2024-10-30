public class GestorSeguro {
    public static void main(String[] args) {
      SeguroAuto seguroAuto=new SeguroAuto("nicolas",2000.00,50,300);
      seguroAuto.detalleSeguro();
        System.out.printf("+++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
      SeguroHogar seguroHogar = new SeguroHogar("Maria",2000.00,500,false);
      seguroHogar.detalleSeguro();
        System.out.printf("+++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
      SeguroVida seguroVida = new SeguroVida("Pepe",5000.00,400,65);
      seguroVida.detalleSeguro();
    }
}
