import java.util.Scanner;
public class MainColaCaracteres{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        ColaCaracteres cola = new ColaCaracteres();
        int opc;

        do{
            System.out.println("\0 COLA (char).");
            System.out.println("1. Encolar.");
            System.out.println("2. Desencolar.");
            System.out.println("3. Ver frente.");
            System.out.println("4. Estado (vacia/llena) y tamaño.");
            System.out.println("5. Mostrar.");
            System.out.println("0. Salir.");
            System.out.println("Opcion: ");
            opc = sc.nextInt();
            sc.nextLine();

            if (opc == 1) {
                if (cola.estaLlena()) {
                    System.out.println("La cola está llena (capacidad 10).");
                } else {
                    System.out.print("Ingrese un caracter (ej: a): ");
                    String txt = sc.nextLine();
                    if (txt.isEmpty()) {
                        System.out.println("No ingresó caracter.");
                    } else {
                        char c = txt.charAt(0);
                        cola.encolar(c);
                        System.out.println("Encolado: '" + c + "'. Cola: " + cola);
                    }
                }
            } else if (opc == 2) {
                if (cola.estaVacia()) {
                    System.out.println("La cola está vacía.");
                } else {
                    char quitado = cola.desencolar();
                    System.out.println("Desencolado: '" + quitado + "'. Cola: " + cola);
                }
            } else if (opc == 3) {
                char frente = cola.peek();
                if (frente == '\0') {
                    System.out.println("La cola está vacía (no hay frente).");
                } else {
                    System.out.println("Frente actual (sin quitar): '" + frente + "'");
                }
            } else if (opc == 4) {
                System.out.println("¿Vacía? " + cola.estaVacia() +
                                   " | ¿Llena? " + cola.estaLlena() +
                                   " | Tamaño: " + cola.tamanio());
            } else if (opc == 5) {
                System.out.println("Cola: " + cola);
            } else if (opc == 0) {
                System.out.println("Fin.");
            } else {
                System.out.println("Opción inválida.");
            }
        } while (opc != 0);

        sc.close();
    }
}