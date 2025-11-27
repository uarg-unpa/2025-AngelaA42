 public class AutoP8 {
    String patente;
    int movimientos; // cuántas veces fue MOVIDO (sacado/puesto) para dejar salir a otros

    AutoP8(String patente) {
        this.patente = patente;
        this.movimientos = 0;
    }

    @Override
    public String toString() {
        return patente + " (movido " + movimientos + " veces)";
    }
}