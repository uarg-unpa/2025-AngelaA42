public class Teatro{
    private String nombre;
    private String direccion;
    private Obra[] obras;

    public Teatro(String nombre, String direccion, Obra o1, Obra o2, Obra o3){
        this.nombre=nombre;
        this.direccion=direccion;
        this.obras=new Obra[3];
        this.obras[0]=o1;
        this.obras[1]=o2;
        this.obras[2]=o3;
    }
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre=nombre;}

    public String getDireccion(){return direccion;}
    public void setDireccion(String direccion){this.direccion=direccion;}

    public Obra[] getObras(){return obras;}
    public Obra getObra(int i) {return obras[i];}

    public void cambiarNombreObra(int indice, String nuevoNombre){
        if(indice>=0 && indice<3){
            obras[indice].setNombre(nuevoNombre);
        }
    }
    public void cambiarPrecioObra(int indice, double nuevoPrecio){
        if(indice>=0 && indice <3){
            obras[indice].setPrecio(nuevoPrecio);
        }
    }
    @Override
    public String toString(){
        return "Teatro -> " +nombre+ "Direccion: " +direccion+ " | Obras: "+obras[0]+ ", " +obras[1]+ ", " +obras[2];
    }
    
}