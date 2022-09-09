public class FiltroNOT extends Filtro {

    private Filtro f1;

    public FiltroNOT(Filtro filtro) {
        this.f1 = filtro;
    }

    @Override
    public boolean cumple(Producto p) {
        return !f1.cumple(p);
    }
}
