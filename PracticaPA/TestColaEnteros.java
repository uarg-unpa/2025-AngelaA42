import java.util.Scanner;

public class TestColaEnteros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ColaEnteros cola = new ColaEnteros();
        int opcion;

        do {
            System.out.println("\n=== MENÚ COLA (frente fijo / final movible) ===");
            System.out.println("1) Encolar.");
            System.out.println("2) Mostrar.");
            System.out.println("3) Promedio de positivos (sin perder el orden).");
            System.out.println("0) Salir.");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                if (cola.estaLlena()) {
                    System.out.println("Cola llena. No se puede encolar.");
                } else {
                    System.out.print("Ingrese un entero: ");
                    int x = sc.nextInt();
                    cola.insertar(x);
                    System.out.println("Encolado: " + x + " -> " + cola);
                }

            } else if (opcion == 2) {
                System.out.println("Cola actual: " + cola);

            } else if (opcion == 3) {
                if (cola.estaVacia()) {
                    System.out.println("Cola vacía. No hay datos.");
                } else {
                    int n = cola.cantidad(); 
                    int sumaPos = 0;
                    int contPos = 0;

                    for (int i = 0; i < n; i++) {
                        int v = cola.borrar();   
                        if (v > 0) {             
                            sumaPos += v;
                            contPos++;
                        }
                        cola.insertar(v);        
                    }

                    if (contPos == 0) {
                        System.out.println("No hay elementos positivos.");
                    } else {
                        double promedio = (double) sumaPos / contPos;
                        System.out.println("Promedio de positivos = " + promedio);
                    }

                    System.out.println("Cola (orden preservado): " + cola);
                }

            } else if (opcion == 0) {
                System.out.println("Fin.");
            } else {
                System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}