public class Persona {
    private String nombre;
    private int edad;
    private Domicilio domicilio;

    public Persona(String nombre, int edad, Domicilio domicilio){
        this.nombre = nombre;
        this.edad = edad;
        this.domicilio = domicilio;
    }
    @Override
    public String toString(){
        return "Nombre: " + nombre + " | Edad: " + edad + " | Domicilio: " + domicilio;
    }
}

