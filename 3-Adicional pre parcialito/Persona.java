import java.util.ArrayList;

class Persona {
    // atributos
    private String nombre;
    private String apellido;
    private int dni;
    private String address;
    private ArrayList<String> autoresFav;
    private ArrayList<String> generosFav;
    private ArrayList<Producto> compras;
    private double descuento;
    private Behavior comport;

    // constructor
    public Persona(String nombre, String apellido, int dni, String address, double descuento, Behavior porDefecto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.address = address;
        this.autoresFav = new ArrayList<String>();
        this.generosFav = new ArrayList<String>();
        this.compras = new ArrayList<Producto>();
        if (Double.valueOf(descuento) != null) {
            this.descuento = descuento;
        } else {
            this.descuento = 0;
        }
        this.comport = porDefecto;
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addAutorFav(String newAutorFav) {
        if (!autoresFav.contains(newAutorFav)) {
            this.autoresFav.add(newAutorFav);
        }
    }

    public void addGeneroFav(String newGeneroFav) {
        if (!generosFav.contains(newGeneroFav)) {
            this.autoresFav.add(newGeneroFav);
        }
    }

    public void addCompra(String autor, String nombre, double precio) {
        this.compras.add(new Producto(autor, nombre, precio));
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public Behavior getBehavior() {
        return this.comport;
    }

    public void setBehavior(Behavior nuevo) {
        this.comport = nuevo;
    }

    // métodos
    public boolean compreProducto(Producto pp) {
        for (int i = 0; i < compras.size(); i++) {
            if (pp.equals(compras.get(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean mgAutor(String autor) {
        if (autoresFav.contains(autor)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean mgGenero(String genero) {
        if (generosFav.contains(genero)) {
            return true;
        } else {
            return false;
        }
    }
}
