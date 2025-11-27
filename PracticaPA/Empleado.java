public class Empleado{
    private String nombre;
    private int legajo;
    private double sueldo;

    public Empleado(String nombre, int legajo, double sueldo){
        this.nombre=nombre;
        this.legajo=legajo;
        this.sueldo=sueldo;
    }
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre=nombre;}

    public int getLegajo() {return legajo;}
    public void setLegajo(int legajo) {this.legajo=legajo;}

    public double getSueldo() {return sueldo;}
    public void setSueldo(double sueldo) {this.sueldo=sueldo;}

    public boolean ganaMasQue(Empleado otro){
        return this.sueldo>otro.sueldo;
    }
    @Override
    public String toString(){
        return "Empleado-> nombre: "+nombre+" |Legajo: "+legajo+" |Sueldo: "+sueldo;
    }
}