public class Coche {
    //atributos
    public String marca;
    public String modelo;
    public int año;

    // Métodos
    public void info() {
        System.out.println("marca: " + marca + ", modelo: " + modelo + ", año: " + año);
    }

    public void Edad (int x) {
        int edad = x - año;
        System.out.println("La edad del coche es:" + edad );
    }
    // Constructor
    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
}
