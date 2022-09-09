public class ComboMasterChef extends Combo {
    private String cat1;

    public ComboMasterChef(String nombre, double precio) {
        super(nombre, precio);
        this.cat1 = "Cocina Gourmet";
    }

    @Override
    public void addProducto(Producto producto) {
        if (producto.getCategorias().contains(cat1)) {
            super.addProducto(producto);
        }
    }
}
