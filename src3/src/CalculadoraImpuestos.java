public class CalculadoraImpuestos {
    //atributos
    int ingresos;
    Double porcentajeTaxes;
    Double dividendos;
    Double exencion;

    //metodos

    public Double calcularImpuestos1() {
return this.ingresos+0.15;
    }
    public Double calcularImpuestos2() {
        return (this.ingresos*this.porcentajeTaxes)/100;
    }
    public Double calcularImpuestos3() {
        return this.dividendos*(this.porcentajeTaxes)/100;
    }


    public CalculadoraImpuestos(int ingresos, Double porcentajeTaxes, Double dividendos, Double exencion) {
        this.ingresos = ingresos;
        this.porcentajeTaxes = porcentajeTaxes;
        this.dividendos = dividendos;
        this.exencion = exencion;
    }
}
