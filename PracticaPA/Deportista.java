public class Deportista{
    private String nombre;
    private int edad;
    private String deporte;
    private int puntos;

    public Deportista(String nombre, int edad, String deporte, int puntos){
        this.nombre=nombre;
        this.edad=edad;
        this.deporte=deporte;
        this.puntos=puntos;
    }
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre=nombre;}

    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad=edad;}

    public String getDeporte() {return deporte;}
    public void setDeporte(String deporte) {this.deporte=deporte;}

    public int getPuntos() {return puntos;}
    public void setPuntos(int puntos) {this.puntos=puntos;}

    public boolean esMasExperimentado(Deportista otro){
        return this.puntos>otro.puntos;
    }
    public boolean esMayorDeEdad(){
        return this.edad>=18;
    }
    @Override
    public String toString(){
        return "Deportista-> nombre: " + nombre + "|Edad: " + edad + "|Deporte: " + deporte + "|Puntos: " + puntos;
    }
}