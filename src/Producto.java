public class Producto {
    //atributos
    private String nombre;
    private Double precio;
    private int stock;

 //constructores
    public Producto(String nombre, Double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto() {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = 0;
    }

    //metodos get
 public Double getPrecio() {
          return precio;
    }


    public String getnombre() {
        return nombre;
    }

    public int getstock() {
        return stock;
    }

//metodos set
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    public void setstock(int stock) {
        this.stock = stock;
    }


    // metodos adicionales
    public  void aumentarStock(int stock) {
       if(stock>0){
        this.stock = this.stock + stock;
       } else {
          System.out.println("El stock que quieres aumentar no puede ser negativo");
       }

    }
    public  void reducirStock(int stock1) {
        if(stock1 <= this.stock && stock1 > 0){
            this.stock = this.stock - stock1;
        } else {
            System.out.println("El stock que quieres quitar es superior al que hay o ingresaste un numero menor o igual a 0");
        }

    }
}