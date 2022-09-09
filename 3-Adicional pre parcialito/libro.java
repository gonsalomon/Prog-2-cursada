class Libro extends Producto {
    // atributos
    private int pageCount;
    private String resumen;
    private String genero;

    // constructor
    public Libro(String autor, String nombre, double precio, int largo, String resumen, String genero) {
        super(autor, nombre, precio);
        this.pageCount = largo;
        this.resumen = resumen;
        this.genero = genero;
    }

    // getters y setters
    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}