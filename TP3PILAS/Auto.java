public class Auto{
    private String patente;
    private String marca;
    private String modelo;
    private int anio;

    public Auto(String patente, String marca, String modelo, int anio){
        this.patente=patente;
        this.marca=marca;
        this.modelo=modelo;
        this.anio=anio;
    }
    public String getPatente(){return patente;}

    @Override
    public String toString(){
        return "Auto [ Patente: " + patente + ", Marca: " + marca + ", Modelo: " + modelo + ", anio: " + anio + "]";
    }
}