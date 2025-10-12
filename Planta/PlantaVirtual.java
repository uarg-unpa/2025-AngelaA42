public class PlantaVirtual {
    private String nombre;
    private int nivelAgua;
    private int altura;
    private String tipo;


    //constructor

    public PlantaVirtual(String nombre, int nivelAgua, int altura, String tipo){
        this.nombre = nombre;
        this.nivelAgua = nivelAgua;
        this.altura = altura;
        this.tipo = tipo;
    }
    //metodos

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getNivelAgua() { return nivelAgua; }
    public void setNivelAgua(int nivelAgua) {this.nivelAgua = nivelAgua; }

    public int getAltura() { return altura; }
    public void setAltura(int altura) { this.altura = altura; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    //necesita riego?

    public String estadoDeRiego(){
      if(nivelAgua<30) {
         return "La planta necesita riego";
    }
      else{
         return "La planta no necesita riego";
    }
    }
 
    //aumento de altura
    public int crecer(){
        this.altura += 1;
        return 1;
    }
    public void regar(){
        if(this.nivelAgua>100){
            this.nivelAgua = 100;
        }
        this.crecer();
    }

    public String reporte(){
        return estadoDeRiego();
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + " | Nivel de agua: " + nivelAgua + "%" + " | Altura: " + altura + "cm" + " | Tipo: " + tipo;

    }

}

    




        