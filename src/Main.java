//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Tres coches
        Coche coche1 = new Coche("Lamborghini", "Aventador", 2015);
        Coche coche2 = new Coche("Porsche", "911", 2022);
        Coche coche3 = new Coche("Chevrolet", "Camaro", 2010);

        coche1.info();
        coche2.info();
        coche3.info();

        // Calcular y mostrar la edad de cada coche en base al año actual (2024 en este ejemplo)
        int x = 2024;
        coche1.Edad(x);
        coche2.Edad(x);
        coche3.Edad(x);
    }
}