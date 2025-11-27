//Maximo elemento en un vector de enteros.
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