public class Producto {
    public String nombre;
    public double precio;
    public int cantidad;

    public Producto(String nombre, double precio, int cantidad) throws ProductoException, PrecioException, CantidadException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new ProductoException("NOMBRE DE PRODUCTO O ESTA VACIO O ES NULO.");
        }
        if (precio <= 0) {
            throw new PrecioException("EL PRECIO NO PUEDE SER NI 0 NI MENOR QUE EL");
        }
        if (cantidad < 0) {
            throw new CantidadException("CANTIDAD ES NEGATIVA");
        }
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double total() {
        return precio * cantidad;
    }

    public void mostrarProducto() {
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio del producto: " + precio);
        System.out.println("Cantidad del producto: " + cantidad);
        System.out.println("Valor de todo: " + total());
    }
    ///CREACION EXEPCIONES
    public static class ProductoException extends Exception {
        public ProductoException(String mensaje) {
            super(mensaje);
        }
    }

    public static class PrecioException extends Exception {
        public PrecioException(String mensaje) {
            super(mensaje);
        }
    }

    public static class CantidadException extends Exception {
        public CantidadException(String mensaje) {
            super(mensaje);
        }
    }
}
