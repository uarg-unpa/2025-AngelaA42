//Calcular suma
int suma(int n){
    if(n==1)
      return 1;
    else
      return n+suma(n-1); //decuelve la suma de todos los elementos desde 1 hasta n.
}