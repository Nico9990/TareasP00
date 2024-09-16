//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Producto p1 = new Producto();
        p1.setnombre("Iphone");
        p1.setPrecio(200.00);
        int x=0;
        while (x != 3) {
            System.out.println("\nQue desea realizar hoy");
            System.out.println("1. Desea aumentar el stock");
            System.out.println("2. Desea disminuir el stock");
            System.out.println("3. Salir");
             x=scanner.nextInt();
            //Producto p1 = new Producto();         (no puede estar aqui ya que cada vez que entraba a while se iniciaba en 0 provocando error al momento de aumentar o disminuir))
            //p1.setnombre("Iphone");
            //p1.setPrecio(200.00);

            switch (x) {
                case 1:
                    System.out.println("¿Cuanto desea aumentar?");
                    int stock = scanner.nextInt();
                    p1.aumentarStock(stock);
                    break;
                case 2:
                    System.out.println("¿Cuanto stock desea quitar?");
                    int stock1 = scanner.nextInt();
                    p1.reducirStock(stock1);
                    break;

                case 3:
                    System.out.println("Nos vemos brou");
                    break;
                default:
                    System.out.println("Pon los numeros correctos");
                    break;

            }
            System.out.println("El nombre del producto es:"+p1.getnombre());
            System.out.println("El precio es:"+p1.getPrecio());
            System.out.println("El stock disponible es:"+p1.getstock());
        }

    }
}