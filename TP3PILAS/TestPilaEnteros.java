public class TestPilaEnteros{
    public static void main(String[]args){
        PilaEnteros p = new PilaEnteros();

        p.meter(1);
        p.meter(2);
        p.meter(3);
        p.meter(4);
        p.meter(5);
        System.out.println("Inicial-> " + p);

        //a)
        int a = PilaEnteros.segundoSacandoDos(p);
        System.out.println("Segundo(sacando dos): " + a + "| Despues-> " + p);

        p.meter(4);
        p.meter(5);

        //b)
        int b = PilaEnteros.segundoSinModificar(p);
        System.out.println("Segundo (sin modificar): " + b + "| Despues-> " + p);

        //c) 
        int c = PilaEnteros.nEsimoSacandoN(p, 3);
        System.out.println("N-esimo sacando N(n=3): " + c + "| Despues-> " + p);

        while(!p.estaVacia()) p.sacar();
        p.meter(1);
        p.meter(2);
        p.meter(3);
        p.meter(4);
        p.meter(5);

        //d)
        int d = PilaEnteros.nEsimoSinModificar(p, 4);
        System.out.println("N-esimo sin modificar (n=4): " + d + "| Despues-> " + p);

        //e)
        int e = PilaEnteros.fondoDejandoVacia(p);
        System.out.println("Fondo dejando vacia: " + e + "| Despues-> " + p);

        p.meter(1);
        p.meter(2);
        p.meter(3);
        p.meter(4);
        p.meter(5);

        //f)
        int f = PilaEnteros.fondoSinModificar(p);
        System.out.println("Fondo sin modificar: " + f + "| Despues-> " + p);
    }
}