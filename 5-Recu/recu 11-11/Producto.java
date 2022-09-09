import java.util.ArrayList;

public abstract class Producto {
    protected String nombre;
    protected double precio;
    private ArrayList<String> categorias;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.categorias = new ArrayList<>();
    }

    public abstract double getPrecio();

    public abstract double getPeso();

    public abstract int getCantidadProductos();

    public ArrayList<String> getCategorias() {
        ArrayList<String> categoria = new ArrayList<String>();
        for (String categoria1 : this.categorias) {
            categoria.add(categoria1);
        }
        return categoria;
    }

    public void addCat(String categoria) {
        if (!this.categorias.contains(categoria)) {
            this.categorias.add(categoria);
        }
    }

    public void delCat(String categoria) {
        if (this.categorias.contains(categoria)) {
            this.categorias.remove(categoria);
        }
    }
}
