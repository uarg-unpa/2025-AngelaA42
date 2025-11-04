import java.util.Scanner;

public class MainHistorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Historial historial = new Historial();
        int opcion;

        do {
            System.out.println("\n=== HISTORIAL DE NAVEGACIÓN ===");
            System.out.println("1. Visitar nueva página (push)");
            System.out.println("2. Volver (pop)");
            System.out.println("3. Ver página actual (peek)");
            System.out.println("4. Ver estado (vacía/llena)");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar salto

            if (opcion == 1) {
                if (historial.estaLlena()) {
                    System.out.println("El historial está lleno.");
                } else {
                    System.out.print("URL: ");
                    String url = sc.nextLine();
                    historial.meter(url);
                    System.out.println("Visitaste: " + url);
                }
            } else if (opcion == 2) {
                if (historial.estaVacia()) {
                    System.out.println("No hay páginas para volver.");
                } else {
                    String salio = historial.sacar();
                    System.out.println("Volviste desde: " + salio);
                }
            } else if (opcion == 3) {
                if (historial.estaVacia()) {
                    System.out.println("No hay página actual.");
                } else {
                    System.out.println("Actual: " + historial.verActual());
                }
            } else if (opcion == 4) {
                System.out.println(historial);
                System.out.println("¿Vacía? " + historial.estaVacia() +
                                   " | ¿Llena? " + historial.estaLlena());
            } else if (opcion == 0) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}