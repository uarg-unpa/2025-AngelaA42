public class ArregloNumeros{
    private int[] datos;
    private int cantidad;

    public ArregloNumeros(int capacidad){
        this.datos= new int[capacidad];
        this.cantidad=0;
    }
    public int getCapacidad(){return datos.length;}
    public int getCantidad(){return cantidad;}

    public boolean agregarNumeros(int n){
        if(cantidad<datos.length){
            datos[cantidad] = n;
            cantidad ++;
            return true;
        }
        else{ return false;}
    }
    public void vaciar(){
        cantidad=0;
    }
    @Override
    public String toString(){
        if(cantidad ==0)return "[]";
        StringBuilder sb = new StringBuilder("[");
        for(int i=0; i<cantidad; i++){
            sb.append(datos[i]);
            if(i<cantidad-1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}