//Devuelve el valor minimo de los primeros n elementos del arreglo v.
int minimo(int v[], int n){
    if(n==1){   
        return v[0]; //Si hay un solo elemento ese es el ultimo.
    }else{
        int minRestante = minimo(v, n-1);  //Minimo de los primeros n-1 elementos.
        if(v[n-1] < minRestante){  //Compara el ultimo elemnto con el minimo del resto.
            return v[n-1];
        }else{
            return minRestante;
        }
    }
}