import java.util.Scanner;
public class TestPilaEnteros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        PilaEnteros pila = new PilaEnteros();

        System.out.print("¿Cuántos elementos quiere cargar en la pila? ");
        int n = sc.nextInt();

        System.out.println("Ingrese " + n + " enteros (se van apilando en ese orden):");
        for (int i = 0; i < n; i++) {
            pila.meter(sc.nextInt());
        }

        System.out.println("Pila inicial: " + pila);

        System.out.print("Valor X a buscar y eliminar: ");
        int x = sc.nextInt();

        int movidos = pila.eliminarUnaYContarMovidos(x);

        if (movidos == -1) {
            System.out.println("El valor " + x + " NO se encontró. La pila quedó igual.");
        } else {
            System.out.println("Se eliminó " + x + ". Elementos movidos hasta encontrarlo: " + movidos);
            System.out.println("Pila resultante: " + pila);
        }

        sc.close();
    }
}