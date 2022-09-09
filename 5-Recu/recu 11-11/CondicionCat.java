import java.util.ArrayList;

public class CondicionCat extends Condicion {
    private ArrayList<String> cats;

    public CondicionCat() {
        this.cats = new ArrayList<String>();
    }

    public void addCat(String cat) {
        this.cats.add(cat);
    }

    public void removeCat(String cat) {
        this.cats.remove(cat);
    }

    @Override
    public boolean cumple(Producto p) {
        /*
         * sólo chequeo inclusión de una categoría, no inclusión de TODAS las
         * categorías. entonces cuando encuentre UNA categoría, va a devolver true
         */
        for (String cat : this.cats) {
            if (p.getCategorias().contains(cat)) {
                return true;
            }
        }
        return false;
    }
}
