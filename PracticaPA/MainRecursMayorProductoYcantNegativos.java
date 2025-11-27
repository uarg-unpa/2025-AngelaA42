public class MainRecursMayorProductoYcantNegativos{
    public static void main(String[]args){

        final int dim = 5;
        int[] v = new int[dim];

        v[0] = 3;
        v[1] = -2;
        v[2] = 5;
        v[3] = -7;
        v[4] = 4;

        //Muestra del array.
        System.out.println("Array: ");
        for(int i = 0; i < dim; i ++){
            System.out.println(v[i] + " | ");
        }
        System.out.println();
        //Llamados a los metodos recursivos.
        int max = RecursMayorProductoYcantNegativos.maximo(v, dim);
        int prod = RecursMayorProductoYcantNegativos.producto(v, dim);
        int cantNeg = RecursMayorProductoYcantNegativos.contarNegativos(v, dim);

        System.out.println("Mayor elemento: " + max);
        System.out.println("Producto de los elementos: " + prod);
        System.out.println("Cantidad de numeros negativos: " + cantNeg);
    }
}