import java.time.LocalDate;

public abstract class Tripulante {
    private String destino;
    LocalDate partida, regreso;

    public Tripulante(String destino, LocalDate partida, LocalDate regreso) {
        this.destino = destino;
        this.partida = partida;
        this.regreso = regreso;
    }

    public String getDestino() {
        return this.destino;
    }

    public LocalDate getPartida() {
        return this.partida;
    }

    public LocalDate getRegreso() {
        return this.regreso;
    }
}
