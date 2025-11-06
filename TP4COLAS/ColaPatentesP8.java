public class ColaPatentesP8 {
    private String[] patente;
    private int cant, CAP;

    ColaPatentesP8(int cap) {
        CAP = cap;
        patente = new String[CAP];
        cant = 0;
    }

    boolean estaVacia() { return cant == 0; }
    boolean estaLlena() { return cant == CAP; }

    void encolar(String pat) {
        if (!estaLlena()) {
            patente[cant] = pat;
            cant++;
        }
    }

    String desencolar() {
        String x = patente[0];
        for (int i = 0; i < cant - 1; i++) patente[i] = patente[i + 1];
        cant--;
        return x;
    }
}