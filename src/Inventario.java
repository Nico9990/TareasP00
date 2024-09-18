import java.util.ArrayList;

public class Inventario {
    public ArrayList<Producto> listaProductos = new ArrayList<Producto>();

    public ArrayList<Categoria> listaCategorias = new ArrayList<Categoria>();

    public void registrarProducto(Producto producto) {
        this.listaProductos.add(producto);
    }

    public void registrarCategoria(Categoria categoria) {      //el primer Categoria es el tipo el segundo nombre
        this.listaCategorias.add(categoria);
    }


    public void eliminarProducto(int idProductoEliminar) {
        int longitudOriginal = this.listaProductos.size(); // 3

        this.listaProductos.removeIf((producto) -> producto.getId() == idProductoEliminar);

        if (longitudOriginal != this.listaProductos.size()) {
            System.out.println("Se eliminó el prodcuto con el ID: " + idProductoEliminar);
        } else {
            System.out.println("No existe un producto con el ID: " + idProductoEliminar);
        }
    }

    //public void mostrarProductos() {
       // System.out.println("\n*** PRODUCTOS EN EL SISTEMA ***");

       // if (this.listaProductos.size() == 0) {
          //  System.out.println("\nNo existen productos en el sistema");
           // return;
       //// }

       // int iterador = 1;
       // for (Producto producto : this.listaProductos) {
//System.out.println("\nEste es el producto: " + iterador);
           // System.out.println(producto.mostrarProducto());
//iterador++;
        //}
   // }
       public void mostrarProductos() {
           System.out.println("*** PRODUCTOS EN EL SISTEMA ***");
           if (listaProductos.size() == 0) {
               System.out.println("\nNo existen productos en el sistema");
               return;
           }
           for (Producto producto : listaProductos) {
               System.out.println("Id: " + producto.id);
               System.out.println("Nombre: " + producto.nombre);
               System.out.println("Precio: " + producto.precio);
               System.out.println("Descripción: " + producto.descripcion);
               System.out.println("Categoria: " + producto.idCategoria);
               System.out.println("Stock: " + producto.stock);
           }
}

    public boolean validarExistenciaDeCategorias(){
        return this.listaCategorias.size() > 0;
    }


    //TAREA
    public void mostrarCategorias(){
        for (Categoria categoria : listaCategorias) {
            System.out.println(categoria.id + categoria.nombre);  //categoria.id nos da acceso al atributo y no usamos getter ya que no esta privado
        }
    }
    //TAREA
    public  int ExisteEsaCategoria(int idCategoria) {
        for (Categoria categoria : listaCategorias) {
            if (categoria.id == idCategoria) {
                return 1;
            }
        }
        return 0;
    }
    //TAREA
    public void mostrarCategoriasyProducto(){
        for (Categoria categoria : listaCategorias) {
            System.out.println(categoria.id + categoria.nombre);//categoria.id nos da acceso al atributo y no usamos getter ya que no esta privado
            for (Producto producto : listaProductos) {
                if (producto.idCategoria == categoria.id) {
                    System.out.println(producto.id + producto.nombre + producto.descripcion + producto.precio);
                }
            }
        }
    }


}

