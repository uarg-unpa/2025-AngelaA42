import java.util.Scanner;
public class MainColaFrenteFijo {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Cola cola = new Cola();
        int opcion;
        
        do {
            System.out.println("===Cola(frentefijo/final movible)===");
            System.out.println("1. Encolar");
            System.out.println("2. Desencolar(sale el mas antiguo)");
            System.out.println("3. Ver frente");
            System.out.println("4. Estado(vacia/llena) y tamaño");
            System.out.println("5. Mostrar");
            System.out.println("6. Cantidad de elementos."); //Agregado (punto 3)
            System.out.println("7. Eliminar repetidos."); //Agregado (punto 4)
            System.out.println("8. Comparar con otra."); //Agregado (punto 5)
            System.out.println("0. Salir");
            System.out.println("Opcion: ");
            opcion = sc.nextInt();

            if(opcion==1) {
                if(cola.estaLlena()) {
                    System.out.println("Cola llena, no se puede encolar.");
                }else{
                  System.out.println("Numero a encolar: ");
                  int x = sc.nextInt();
                  cola.insertar(x);
                  System.out.println("Encolado: " + x + "-> " + cola);
                }
            }else if(opcion==2){
                if(cola.estaVacia()){
                    System.out.println("Cola vacia, no hay nada para sacar.");
                }else{
                    int sacado = cola.borrar();
                    System.out.println("Desencolado: " + sacado + "-> " + cola);
                }
            }else if(opcion==3){
                if(cola.estaVacia()){
                    System.out.println("Cola vacia (sin frente).");
                }else{
                    int frente = cola.peek();
                    System.out.println("Frente actual: " + frente);
                }
            }else if(opcion==4){
                System.out.println("¿Vacia?: " + cola.estaVacia()+ " | ¿Llena?: "+ cola.estaLlena());
            }else if(opcion==5){
                System.out.println("Cola: " + cola);
            }else if(opcion==6){ //Agregado (punto 3)
                System.out.println("Cantidad de elementos: " + cola.cantidad());
            }else if(opcion==7){ //Agregado (punto 4)
                int antes = cola.cantidad();
                cola.eliminarRepetidos();
                int despues = cola.cantidad();
                int borrados = antes-despues;
                System.out.println("Repetidos eliminados: " + borrados);
                System.out.println("Cola ahora: " + cola);
            }else if(opcion==8){ //Agregado (punto 5)
                System.out.println("---Cargar otra cola---");
                Cola otra = new Cola();

                System.out.println("¿Cuantos elementos se van a cargar en la segunda cola?");
                int n = sc.nextInt();
                for(int i=0; i<n; i++){
                    if(otra.estaLlena()){
                        System.out.println("Se lleno la segunda cola.");
                        break;
                    }
                    System.out.println("Elemento: " + (i+1) + "; ");
                    int v = sc.nextInt();
                    otra.insertar(v);
                }
                System.out.println("Cola actual: " + cola);
                System.out.println("Otra cola: " + otra);

                boolean iguales = cola.esIdentica(otra);
                if(iguales){
                    System.out.println("Resultado: SON IDENTICAS.");
                }else{
                    System.out.println("Resultado: NO SON IDENTICAS.");
                }
            }else if(opcion==0){
                System.out.println("Fin.");
            }else{
                System.out.println("Opcion invalida.");
            }
        }while(opcion!=0);

        sc.close();
    }
}
