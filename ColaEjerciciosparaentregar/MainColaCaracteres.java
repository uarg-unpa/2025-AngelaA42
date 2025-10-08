public class MainColaCaracteres{
    public static void main(String[]args){
        ColaCaracteres cola = new ColaCaracteres();

        //Encola 5 caracteres
        for(char c: new char[]{'a','b','c','d','e'}) cola.insertar(c);
        mostrar("Despues de encolar 5", cola);

        //Desencola 2 caracteres
        System.out.println("Desencolar: " + cola.borrar());
        System.out.println("Desencolar: " + cola.borrar());
        mostrar("Despues de desencolar 2", cola);

        //Encola hasta llenar (MAX=10)
        for(char c: new char[]{'f','g','h','i','j','k','l'}) {
            if(cola.estaLlena()) break;
            cola.insertar(c);
        }
        mostrar("Cola final", cola);

        char frente = cola.peek();
        if(frente == '\0'){
            System.out.println("peek (frente): (vacia)");
        } else {
            System.out.println("peek (frente): " + frente);
        }
    }
        private static void mostrar(String titulo, ColaCaracteres cola){
            System.out.println("\n" + titulo);
            System.out.println("Contenido: " + cola.comoTexto());
            System.out.println("Estado: " + (cola.estaVacia()?"vacia" : (cola.estaLlena()? "llena":"elementos")) + "| tamaño= " + cola.tamanio());
        }
    }
