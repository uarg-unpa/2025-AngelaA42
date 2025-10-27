public class Elector{
    private String nombre;
    private String apellido;
    private String matricula;
    private int clase;
    private String domicilio;

    public Elector(String nombre, String apellido, String matricula, int clase, String domicilio){
        this.nombre=nombre;
        this.apellido=apellido;
        this.matricula=matricula;
        this.clase=clase;
        this.domicilio=domicilio;
    }
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre=nombre;}

    public String getApellido(){return apellido;}
    public void setApellido(String apellido){this.apellido=apellido;}

    public String getMatricula(){return matricula;}
    public void setMatricula(String matricula){this.matricula=matricula;}

    public int getClase(){return clase;}
    public void setClase(int clase){this.clase=clase;}

    public String getDomicilio(){return domicilio;}
    public void setDomicilio(String domicilio){this.domicilio=domicilio;}

    @Override
    public String toString(){
        return "Elector Nombre: " +nombre+ "| Apellido: " +apellido+ "| Matricula: " +matricula+ "| Clase: " +clase+ "| Domicilio: " +domicilio;
    }
}