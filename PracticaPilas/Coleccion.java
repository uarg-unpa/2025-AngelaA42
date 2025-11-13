public class Coleccion {

    private int[] elementos;        // Array para almacenar los elementos
    private int actual;             // Cantidad actual de elementos
    private final int MAXCAPA = 20; // Capacidad máxima de la colección

    // Constructor
    public Coleccion() {
        elementos = new int[MAXCAPA]; // Inicializar el array
        actual = 0;                    // Establecer cantidad inicial
    }

    // Retorna la cantidad de elementos almacenados
    public int cantidadElementos() {
        return actual; // devolver la cantidad actual de elementos
    }

    // Agregar un nuevo elemento al final de la colección
    public boolean agregarElemento(int nuevo) {
        if (actual < MAXCAPA) {          // Verificar si hay espacio
            elementos[actual] = nuevo;   // Asignar el nuevo elemento
            actual++;                    // Incrementar actual si se agrega correctamente
            return true;
        }
        return false; // no hay espacio
    }

    // Elimina la primera ocurrencia de un elemento y mueve los posteriores
    public boolean eliminarElemento(int elementoAEliminar) {
        for (int i = 0; i < actual; i++) {
            if (elementos[i] == elementoAEliminar) {
                // Desplazar a la izquierda desde i hasta el penúltimo cargado
                for (int j = i; j < actual - 1; j++) {
                    elementos[j] = elementos[j + 1]; // Mover los elementos restantes
                }
                actual--;                 // Reducir actual
                elementos[actual] = 0;    // Limpiar la última posición 
                return true;
            }
        }
        return false; // no encontrado
    }

    // Vaciar completamente la colección
    public void vaciarColeccion() {
        elementos = new int[MAXCAPA]; // Reiniciar el array
        actual = 0;                   // Establecer la variable actual a 0
    }

    // Retorna un nuevo array con solo los elementos cargados
    public int[] getElementos() {
        int[] copia = new int[actual]; // Crear un nuevo array del tamaño de actual
        for (int i = 0; i < actual; i++) {
            copia[i] = elementos[i];   // Copiar los elementos cargados al nuevo array
        }
        return copia;
    }
    @Override
    public String toString() {
        String texto = "Colección (" + elementos.length + " cap, " + actual + " elementos): ";
        for (int i = 0; i < actual; i++) {
            texto += elementos[i];
            if (i < actual - 1) texto += " ";
        }
        return texto.trim();
    }
}