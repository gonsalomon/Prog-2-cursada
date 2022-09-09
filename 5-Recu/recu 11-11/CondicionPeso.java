public class CondicionPeso extends Condicion {
    private double peso;

    public CondicionPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean cumple(Producto producto) {
        return menor(producto) || igual(producto);
    }

    // dejo mayor, igual o menor para hacer combinaciones lógicas
    private boolean mayor(Producto producto) {
        return producto.getPeso() > peso;
    }

    private boolean igual(Producto producto) {
        return producto.getPeso() == peso;
    }

    private boolean menor(Producto producto) {
        return producto.getPeso() < peso;
    }
}
