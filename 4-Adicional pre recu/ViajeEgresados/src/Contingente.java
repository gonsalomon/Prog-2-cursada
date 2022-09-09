import java.time.LocalDate;
import java.util.ArrayList;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contingente extends Tripulante {
    private ArrayList<Tripulante> tripulantes;

    public Contingente(String destino, LocalDate partida, LocalDate regreso) {
        super(destino, partida, regreso);
        this.tripulantes = new ArrayList<Tripulante>();
    }

    public void addTripulante(Tripulante tripulante) {
        if (tripulante.getDestino().equals(this.getDestino()) && tripulante.getPartida().equals(this.getPartida())) {
            this.tripulantes.add(tripulante);
        }
    }
}
