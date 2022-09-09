class Empleado{
    //atributos
    private String nombre;
    private String apellido;
    private int dni;
    protected double sueldo;
    //constructor
    public Empleado(String name, String surname, int dni, double sueldo){
        this.nombre = name;
        this.apellido = surname;
        this.dni = dni;
        this.sueldo = sueldo;
    }
    //métodos
    public double getSueldo(){
        return this.sueldo;
    }
    public void setSueldo(double newSueldo){
        this.sueldo = newSueldo;
    }
}