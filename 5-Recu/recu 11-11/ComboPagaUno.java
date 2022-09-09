public class ComboPagaUno extends Combo{
    public ComboPagaUno(String nombre, int precio) {
        super(nombre, precio);
    }

    public double getPrecio() {
        double precio = 0;
        for (int i = 0; i < this.getCantidadProductos(); i++) {
            if (this.getPrecio()>precio)
                precio = this.getPrecio();
        }
        return precio;
    }
}
