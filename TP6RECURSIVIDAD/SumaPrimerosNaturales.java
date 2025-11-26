//Calcula la suma de los primeros n numeros naturales.
int suma(int n){
    if(n==0)
      return 0;
    else
      return n+suma(n-1);
}
//Ejemplo: suma(5) = 15.