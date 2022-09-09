import java.util.ArrayList;

public abstract class Condicion {
    public abstract boolean cumple(Producto p);
    public void restringir(ArrayList<Producto> p){
        for (Producto producto : p) {
            if(this.cumple(producto)){
                p.remove(producto);
            }
        }
    }
}
