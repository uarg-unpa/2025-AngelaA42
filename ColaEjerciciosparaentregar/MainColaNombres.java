public class MainColaNombres{
    public static void main(String[]args){
        ColaNombres cola = new ColaNombres();

        //Encolo 8 nombres
        String[]primerosNombres = {"Ana","Bruno","Carla","Diego","Elena","Juan","Hugo","Gabriel"};
        for(String n: primerosNombres) cola.insertar(n);
        mostrar ("Despues de encolar8", cola);

        //Desencolo 3 (los mas antiguos, ana, bruno y carla)
        System.out.println("Desencolo: " + cola.borrar());
        System.out.println("Desencolo: " + cola.borrar());
        System.out.println("Desencolo: " + cola.borrar());
        mostrar("Despues de desencolar 3", cola);

        //Encolo de nuevo reusando el espacio vacio (hasta donde haya lugar)
        String[]otros = {"Iara", "Luca", "Maria", "Karina", "Franco"};
        for(String n : otros){
            if(cola.estaLlena()) break;
            cola.insertar(n);
        }
        mostrar("Despues de encolar hasta casi al tope", cola);

        //Veo el frente sin desencolar
        String frente = cola.peek();
        if(frente == null){
            System.out.println("peek (frente):(vacia)");
        }
        else{
            System.out.println("peek(frente): " + frente);
        }
    }
    private static void mostrar(String titulo, ColaNombres cola){
        System.out.println("\n" + titulo);
        System.out.println("Contenido: " + cola);
        String estado = cola.estaVacia() ? "vacia" : (cola.estaLlena() ? "llena" : "elementos");
        System.out.println("Estado: " + estado + "| tamaño =" + cola.tamanio());
    }
}