import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();

        int opcion = 0;

        while (opcion != 7) {
            System.out.println("\n*** BIEVENIDO ***");
            System.out.println("1. Registrar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Mostrar productos ");
            System.out.println("4. Mostrar Categorias");
            System.out.println("5. Registrar Categoria");
            System.out.println("6. Categoria Junto con sus productos");
            System.out.println("7. Salir");

            System.out.println("Selecciona una opción: ");
            opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion) {
                case 1:
                    if (inventario.validarExistenciaDeCategorias()==false){   // !inventario.validarExistenciaDeCategorias() Es lo mismo
                        System.out.println("No existen categorias en el sistema");
                        break;
                    }
                    System.out.println("\nSeleccionaste la opción para registrar un producto");

                    System.out.println("Ingresa el nombre del producto");
                    String nombre = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Ingresa el precio del producto");
                    double precio = scanner.nextDouble();

                    scanner.nextLine();

                    System.out.println("Ingresa la descripción del producto");
                    String descripcion = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Ingresa el id de la categoría del producto");
                    int  idCategoria = scanner.nextInt();

                    scanner.nextLine();

                    // PUNTO DE TAREA
                    if(inventario.ExisteEsaCategoria(idCategoria)==0){
                        System.out.println("No existe esa categoria en el sistema");
                        break;
                    }

                    System.out.println("Ingresa el stock del producto");
                    int stock = scanner.nextInt();

                    System.out.println(nombre);

                    Producto producto = new Producto(nombre, precio, descripcion, idCategoria, stock);
                    inventario.registrarProducto(producto);

                    System.out.println("\nProducto registrado correctamente");
                    break;
                case 2:
                    System.out.println("\nSeleccionaste la opción para eliminar un producto");

                    System.out.println("Ingresa el ID del producto: ");
                    int id = scanner.nextInt();
                    inventario.eliminarProducto(id);
                    break;
                case 3:
                    inventario.mostrarProductos();
                    break;
                case 4:
                    //PUNTO DE TAREA
                    System.out.println("\nSeleccionaste la opción para mostrar las categoria");
                    inventario.mostrarCategorias();
                    break;
                case 5:
                    System.out.println("Seleccionaste la opcion de registrar categoria");
                    System.out.println("Ingresa nombre categoria: ");
                    String nombrecategoria = scanner.nextLine();
                    Categoria categoria = new Categoria(nombrecategoria);
                    inventario.registrarCategoria(categoria);
                    System.out.println("\nCategoria registrado correctamente");
                    break;
                case 6:
                    //PUNTO DE TAREA
                    System.out.println("Seleccionaste la opcion de ver categoria con sus productos");
                    inventario.mostrarCategoriasyProducto();
                    break;

                case 7:
                    System.out.println("Hasta luego");
                    return;
            }
        }
    }
}