import java.util.Scanner;

public class Main { //GESTOR DE INVENTARIO
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nombre del producto: ");
            String nombre = scanner.nextLine();

            System.out.print("Precio del producto: ");
            double precio = scanner.nextDouble();

            System.out.print("Cantidad del producto: ");
            int cantidad = scanner.nextInt();

            Producto producto = new Producto(nombre, precio, cantidad);
            System.out.println("**PRODUCTO**");
            producto.mostrarProducto();

        } catch (Producto.ProductoException e) {
            System.out.println("La exepcion es: " + e.getMessage());
        } catch (Producto.PrecioException e) {
            System.out.println("La exepcion es: " + e.getMessage());
        } catch (Producto.CantidadException e) {
            System.out.println("La exepcion es: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error No previsto: " + e.getMessage());
        } finally {
            System.out.print("Gracias por usar el programa :)");
        }
    }
}
