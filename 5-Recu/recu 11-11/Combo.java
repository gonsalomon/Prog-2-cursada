import java.util.ArrayList;

public class Combo extends Producto {
    private ArrayList<Producto> productos;
    private double addDto;
    private double maxDto;

    private ArrayList<Condicion> condiciones;

    public Combo(String nombre, double precio) {
        super(nombre, precio);
        this.productos = new ArrayList<Producto>();
        this.condiciones = new ArrayList<Condicion>();
        /*
         * addDto y maxDto son alterables hardcodeando, la consigna no solicita que no
         * sea así. De todas formas se provee un setter (por c/variable) para un cambio
         * en tiempo de ejecución
         */
        this.addDto = 0.014;
        this.maxDto = 0.5;
    }

    // add/del de los arraylist (una especie de setters)
    public void addProducto(Producto p) {
        if (p != null && !this.productos.contains(p)) {
            for (Condicion c : this.condiciones) {
                if (c.cumple(p)) {
                    this.productos.add(p);
                    return;
                }
            }

            this.productos.add(p);
        }
    }

    public void delProducto(Producto p) {// tener cuidado al borrar un combo completo
        if (p != null && this.productos.contains(p)) {
            this.productos.remove(p);
        }
    }

    public void addCondicion(Condicion c) {
        if (c != null && !this.condiciones.contains(c)) {
            this.condiciones.add(c);
        }
    }

    public void delCondicion(Condicion c) {
        if (c != null && this.condiciones.contains(c)) {
            this.condiciones.remove(c);
        }
    }

    public ArrayList<Producto> getProductos() {
        return new ArrayList<Producto>(this.productos);
    }

    public ArrayList<Producto> getCopiaRestringida() {
        ArrayList<Producto> copia = new ArrayList<Producto>(this.productos);
        for (Condicion c : this.condiciones) {
            c.restringir(copia);
        }
        return copia;
    }

    public int getCantidadProductos() {
        int cantidad = 0;
        for (Producto p : this.productos) {
            cantidad += p.getCantidadProductos();
        }
        return cantidad;
    }

    public Producto productoMenorPeso() {
        if (this.productos.size() == 0) {
            return null;
        } else {
            Producto menor = this.productos.get(0);
            for (Producto p : this.productos) {
                if (p.getPeso() < menor.getPeso()) {
                    menor = p;
                }
            }
            return menor;
        }
    }

    public double getPrecio() {
        double precio = 0;
        double descuento = 0;
        for (Producto p : productos) {
            if (descuento + addDto < maxDto) {
                descuento += addDto;
            }
            precio += p.getPrecio();
        }
        return precio * (1 - descuento);
    }

    public double getPeso() {
        double peso = 0;
        for (Producto p : productos) {
            peso += p.getPeso();
        }
        return peso;
    }

    public ArrayList<String> getCategorias() {
        ArrayList<String> catsToReturn = new ArrayList<String>();
        for (Producto p : productos) {
            for (String s : p.getCategorias()) {
                if (!catsToReturn.contains(s)) {
                    catsToReturn.add(s);
                }
            }
        }
        return catsToReturn;
    }

    public void setAddDto(double addDto) {
        this.addDto = addDto;
    }

    public void setMaxDto(double maxDto) {
        this.maxDto = maxDto;
    }
}
