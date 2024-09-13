public class Empleado {
    // Atributos
    private Double sueldo;
    private Double Bonos;
    private Double HorasExtras;

    // Constructor
    public Empleado(Double sueldo, Double Bonos, Double HorasExtras) {
        this.sueldo = sueldo;
        this.Bonos = Bonos;
        this.HorasExtras = HorasExtras;
    }

    // Metodos
    public Double CalcularSalario() {
        return this.sueldo;
    }

    public Double CalcularSalario(Double sueldo) {
        return sueldo+this.Bonos;
    }

    public Double CalcularSalario1(Double HorasExtras) {
        return this.sueldo+this.Bonos+(HorasExtras * 20);
    }

}
