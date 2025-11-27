public class TestCopiarPila{
    public static void main(String[]args){
        CopiarPila p = new CopiarPila();

        p.meter(1);
        p.meter(2);
        p.meter(3);
        System.out.println("Original antes de copiar-> " + p);

        CopiarPila copia = p.copiar();
        System.out.println("Copia-> " + copia);
        System.out.println("Original despues de copiar-> " + p);

        //prueba para ver que sean independientes.
        p.meter(10);
        System.out.println("Despues de meter 10 en original");
        System.out.println("Original-> " + p);
        System.out.println("Copia-> " + copia);
    }
}