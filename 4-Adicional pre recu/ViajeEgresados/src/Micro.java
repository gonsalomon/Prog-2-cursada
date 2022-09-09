import java.util.ArrayList;

public class Micro {
    private final int capacidadPasajeros;
    private ArrayList<Tripulante> tripulantes;

    public Micro(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
        this.tripulantes = new ArrayList<Tripulante>();
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public ArrayList<Tripulante> getTripulantes() {
        return new ArrayList<Tripulante>(tripulantes);
    }
}
