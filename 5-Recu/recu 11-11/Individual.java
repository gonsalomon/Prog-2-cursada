public class Individual extends Producto {
    private double peso;

    public Individual(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return this.precio;
    }

    public int getCantidadProductos() {
        return 1;
    }
}
