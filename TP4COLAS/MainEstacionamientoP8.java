import java.util.Scanner;
public class MainEstacionamientoP8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int CAPACIDAD = 10;
        PilaAutosP8 est = new PilaAutosP8(CAPACIDAD);   // estacionamiento
        ColaPatentesP8 espera = new ColaPatentesP8(100); // cola exterior 

        System.out.println("Comandos: e PATENTE (entrada), s PATENTE (salida), x (fin).");
        while (true) {
            String linea = sc.nextLine().trim();
            if (linea.isEmpty() || linea.equalsIgnoreCase("x")) break;

            String[] partes = linea.split("\\s+");
            if (partes.length < 2) {
                System.out.println("Entrada inválida.");
                continue;
            }
            String op = partes[0];
            String pat = partes[1].toUpperCase();

            if (op.equalsIgnoreCase("e")) {
                // ENTRADA
                if (!est.estaLlena()) {
                    est.meter(new AutoP8(pat));
                    System.out.println("Llega " + pat + ": hay lugar, entra.");
                } else {
                    espera.encolar(pat);
                    System.out.println("Llega " + pat + ": SIN lugar, queda esperando.");
                }
            } else if (op.equalsIgnoreCase("s")) {
                // SALIDA
                if (!est.contiene(pat)) {
                    System.out.println("Sale " + pat + ": no estaba estacionado.");
                    // De todas formas, si alguien esperaba y hay lugar, lo metemos
                    if (!est.estaLlena() && !espera.estaVacia()) {
                        String prox = espera.desencolar();
                        est.meter(new AutoP8(prox));
                        System.out.println("Entra " + prox + " desde la espera (se liberó un lugar).");
                    }
                    continue;
                }

                // Para retirar: movemos a la calle los autos que están POR ENCIMA del buscado
                PilaAutosP8 calle = new PilaAutosP8(est.tamaño());
                AutoP8 objetivo = null;

                while (!est.estaVacia()) {
                    AutoP8 a = est.sacar();
                    if (a.patente.equals(pat)) {
                        objetivo = a; // lo retiramos
                        break;
                    } else {
                        // mover a la calle ( como 1 movimiento)
                        a.movimientos++;
                        calle.meter(a);
                    }
                }

                // Volvemos a meter los que quedaron en la calle (cada uno suma otro movimiento)
                while (!calle.estaVacia()) {
                    AutoP8 a = calle.sacar();
                    a.movimientos++;
                    est.meter(a);
                }

                // Mensaje de salida con movimientos del auto
                System.out.println("Sale " + objetivo.patente + ": fue movido "
                                   + objetivo.movimientos + " veces para permitir salidas.");

                // Si hay autos esperando, entra el primero
                if (!est.estaLlena() && !espera.estaVacia()) {
                    String prox = espera.desencolar();
                    est.meter(new AutoP8(prox));
                    System.out.println("Entra " + prox + " desde la espera (se liberó un lugar).");
                }
            } else {
                System.out.println("Operación desconocida: " + op);
            }
        }

        System.out.println("Fin del procesamiento.");
        sc.close();
    }
}