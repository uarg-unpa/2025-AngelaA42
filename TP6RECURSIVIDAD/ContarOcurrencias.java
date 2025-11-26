//Cuenta cuantas veces aparece num en los primeros n elementos de v.
int contarOcurrencias(int v[], int n, int num){
    if(n==0){
        return 0;
    }else{
        int suma;
        if(v[n-1]==num){
            suma = 1;
        }else{
            suma = 0;
        }return suma + contarOcurrencias(v, n-1, num);
    }
}