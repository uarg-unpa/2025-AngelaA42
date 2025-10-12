public class Ejercicio2Alumno {
    private String nombre;
    private int edad;
    private int legajo;
    private String curso = "A2";

    public Ejercicio2Alumno(String nombre, int edad, int legajo){
        this.nombre = nombre;
        this.edad = edad;
        this.legajo = legajo;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getLegajo(){
        return legajo;
    }
    public void setLegajo(int legajo){
        this.legajo = legajo;
    }
    public String getCurso(){
        return curso;
    }
    @Override
    public String toString(){
        return "Alumno: " + nombre + " | Edad: " + edad + " | Legajo: " + legajo + " | Curso: " + curso;
    }
}





