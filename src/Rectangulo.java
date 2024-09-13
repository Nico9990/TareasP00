public class Rectangulo {
    //atributos
    public Double base;
    public Double altura;

    //constructor
    public Rectangulo(Double base,Double altura){
        this.base=base;
        this.altura=altura;
    }

    //metodo area y perimetro con sobrecarga de metodos
    public Double calcularAreaPerimetro() {
        return (this.base*this.altura);
    }
    public Double calcularAreaPerimetro(Double base) {
        return 2*(base+this.altura);
    }
}
