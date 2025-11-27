//Determina si num esta en el arreglo v.
//n representa el tamaño logico del arreglo (cantidad de elementos que se usan).
boolean esta(int v[], int n, int num){
    if(n==0){
        return false;
    }else{
        if(v[n-1]==num){  //ultimo elemento: v[n-1].
            return true;
        }else{
            return esta(v, n-1, num);
        }
    }
}