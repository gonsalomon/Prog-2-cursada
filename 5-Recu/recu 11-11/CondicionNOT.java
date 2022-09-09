class CondicionNOT extends Condicion {
    private Condicion condicion;

    public CondicionNOT(Condicion condicion) {
        this.condicion = condicion;
    }

    @Override
    public boolean cumple(Producto producto) {
        return !condicion.cumple(producto);
    }
}