public class FiltroCat extends Filtro {
    private String categoria;

    public FiltroCat(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean cumple(Producto p) {
        return p.getCategorias().contains(categoria);
    }
}
