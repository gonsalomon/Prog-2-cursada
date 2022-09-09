public class CondicionPrecio extends Condicion {
    private double precio;

    public CondicionPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean cumple(Producto producto) {
        return menor(producto) || igual(producto);
    }

    private boolean mayor(Producto producto) {
        return producto.getPrecio() > precio;
    }

    private boolean igual(Producto producto) {
        return producto.getPrecio() == precio;
    }

    private boolean menor(Producto producto) {
        return producto.getPrecio() < precio;
    }
}