class Revista extends Producto {
    // atributos
    private int nro;
    private int anio;

    // constructor
    public Revista(String autor, String nombre, double precio, int nro, int anio) {
        super(autor, nombre, precio);
        this.nro = nro;
        this.anio = anio;
    }

    // getters y setters
    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
