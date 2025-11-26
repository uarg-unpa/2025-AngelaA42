public void queHago(int n){
    if(n==0){
        System.out.println("¿Que mensaje puede ir aca?");
    }else{
        System.out.println(n);
        queHago(n);
    }
}
//1) Caso base: if(n==0). Caso general: else{System.out.println(n); queHago(n);}
//2) Errores: -No se llama con un problema mas pequeño, el parametro n no cambia, por lo tanto nunca se acerca al caso base, hace la recursion infinita.
//3) ¿Que hace la funcion?: -Si llamo con n==0: imprime el mensaje del caso base una sola vez y termina.
//                          -Si llamo con cualquier n!=0, imprime n, se vuelve a llamar con el mismo n, vuelve a imprimir n y asi sucesivamente.
//4)¿Que mensaje podria ir en el caso base?: System.out.println("Fin de la recursion, n llego a 0");