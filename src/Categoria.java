import java.util.ArrayList;
import java.util.Random;

public class Categoria {
    public int id;
    public String nombre;
    public ArrayList<Producto> listaProductos = new ArrayList<Producto>();
    public Random random = new Random();

    public Categoria(String nombre) {   //id no colocamos pq ya generaremos automaticamente y arraylist
        this.id=this.random.nextInt(1, 100);
        this.nombre=nombre;
    }
    public void registrarProductoEnCategoria(Producto producto) {
        this.listaProductos.add(producto);
    }




}





