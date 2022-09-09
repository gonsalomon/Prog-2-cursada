class EmpleadoVentas extends Empleado{
    //atributos
    private int ventas;
    private double extra;
    //constructor
    public EmpleadoVentas(String name, String surname, int dni, double sueldo, int ventas, double extra){
        super(name,surname,dni,sueldo);
        this.ventas = ventas;
        this.extra = extra;
    }
    //métodos
    public void sumarVenta(int n){
        this.ventas+=n;
    }
    public void sumarVenta(){
        sumarVenta(1);
    }
    public double getSueldo(){//acá entran las ventas, jugar con el 20
        return this.sueldo+this.ventas*20*extra;
    }
    public void setSueldo(double newSueldo){
        this.sueldo = newSueldo;
    }
}