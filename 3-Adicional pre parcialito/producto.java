class Producto {
    protected String autor;
    protected String nombre;
    protected double precio;

    // constructor
    public Producto(String autor, String nombre, double precio) {
        this.autor = autor;
        this.nombre = nombre;
        this.precio = precio;
    }

    // getters y setters
    public String getAutor() {
        return this.autor;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setAutor(String nuevo) {
        this.autor = nuevo;
    }

    public void setNombre(String nuevo) {
        this.nombre = nuevo;
    }

    public void setPrecio(double nuevo) {
        this.precio = nuevo;
    }

    // overloadeo el equals
    public boolean equals(Producto pp) {
        return this.autor == pp.autor && this.nombre == pp.nombre;
    }
}
