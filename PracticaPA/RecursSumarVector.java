//Sumar los elementos de un vector.
public static int sumarVector(int v[], int n){
    if(n==1){
        return v[0];
    }else{
        return v[n-1] + sumarVector(v, n-1);
    }
}