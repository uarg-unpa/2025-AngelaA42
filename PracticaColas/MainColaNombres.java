import java.util.Scanner;

public class MainColaNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaNombres cola = new ColaNombres();
        int op;

        do {
            System.out.println("\n=== COLA CIRCULAR DE NOMBRES ===");
            System.out.println("1) Encolar nombre");
            System.out.println("2) Desencolar (más antiguo)");
            System.out.println("3) Ver frente (peek)");
            System.out.println("4) Estado y tamaño");
            System.out.println("5) Mostrar cola");
            System.out.println("0) Salir");
            System.out.print("Opción: ");
            op = sc.nextInt(); sc.nextLine();

            if (op == 1) {
                if (cola.estaLlena()) {
                    System.out.println("Cola llena.");
                } else {
                    System.out.print("Nombre: ");
                    String nom = sc.nextLine();
                    cola.encolar(nom);
                    System.out.println("Encolado: " + nom + ". Cola: " + cola);
                }
            } else if (op == 2) {
                String quitado = cola.desencolar();
                if (quitado == null) System.out.println("Cola vacía.");
                else System.out.println("Desencolado: " + quitado + ". Cola: " + cola);
            } else if (op == 3) {
                String f = cola.peek();
                if (f == null) System.out.println("Cola vacía (sin frente).");
                else System.out.println("Frente actual (sin quitar): " + f);
            } else if (op == 4) {
                System.out.println("¿Vacía? " + cola.estaVacia() + " | ¿Llena? " + cola.estaLlena() + " | Tamaño: " + cola.tamanio());
            } else if (op == 5) {
                System.out.println("Cola: " + cola);
            } else if (op == 0) {
                System.out.println("Fin.");
            } else {
                System.out.println("Opción inválida.");
            }
        } while (op != 0);

        sc.close();
    }
}