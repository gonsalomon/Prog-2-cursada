class CondicionAND extends Condicion {
    private Condicion condicion1;
    private Condicion condicion2;

    public CondicionAND(Condicion condicion1, Condicion condicion2) {
        this.condicion1 = condicion1;
        this.condicion2 = condicion2;
    }

    @Override
    public boolean cumple(Producto producto) {
        return condicion1.cumple(producto) && condicion2.cumple(producto);
    }
}