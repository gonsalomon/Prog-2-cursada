public class FiltroPeso extends Filtro {
    private double peso;

    public FiltroPeso(double peso) {
        this.peso = peso;
    }

    public boolean cumple(Producto producto) {
        return producto.getPeso() <= peso;
    }
}
