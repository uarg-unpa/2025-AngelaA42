public class Auto{
    private String marca;
    private String modelo;
    private int anio;
    private int velocidadMax;

    public Auto(String marca, String modelo, int anio, int velocidadMax){
        this.marca=marca;
        this.modelo=modelo;
        this.anio=anio;
        this.velocidadMax=velocidadMax;
    }
    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca=marca;}

    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo=modelo;}

    public int getAnio() {return anio;}
    public void setAnio(int anio) {this.anio=anio;}

    public int getVelocidadMax() {return velocidadMax;}
    public void setVelocidadMax(int velocidadMax) {this.velocidadMax=velocidadMax;}

    public boolean esMasRapidoQue(Auto otro){
        return this.velocidadMax>otro.velocidadMax;
    }
    public boolean esAutoClasico(){
        return this.anio<2000;
    }
    public void mostrarInfo(){
        System.out.println("Auto: " + marca + "Modelo: " + modelo + "|Año: " +anio+ "|Velocidad maxima: " +velocidadMax);
    }
}