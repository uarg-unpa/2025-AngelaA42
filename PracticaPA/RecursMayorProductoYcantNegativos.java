public class RecursMayorProductoYcantNegativos{
    //a) Mayor elemento del array.

    public static int maximo(int v[], int n){
        if(n==1){
            return v[0];
        }else{
            int maxRestante = maximo(v, n-1);

            if(v[n-1] > maxRestante){
                return v[n-1];
            }else{
                return maxRestante;
            }
        }
    }
    //b) Producto de los elementos del array.

    public static int producto(int v[], int n){
        if(n==1){
            return v[0];
        }else{
            return v[n-1]*producto(v, n-1);
        }
    }
    //c) Cantidad de numeros negativos.

    public static int contarNegativos(int v[], int n){
        if(n==0){
            return 0;
        }else{
            int suma;
            if(v[n-1] < 0){
                suma = 1;
            }else{
                suma = 0;
            }return suma + contarNegativos(v, n-1);
        }
    }
}