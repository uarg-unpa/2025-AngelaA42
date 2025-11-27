public class Pc{
    private String marca;
    private String procesador;
    private double precio;
    private int ram;

    public Pc(String marca, String procesador, double precio, int ram){
        this.marca=marca;
        this.procesador=procesador;
        this.precio=precio;
        this.ram=ram;
    }
    public String getMarca() {return marca;}
    public void setMarca(String marca){this.marca=marca;}

    public String getProcesador() {return procesador;}
    public void setProcesador(String procesador) {this.procesador=procesador;}

    public double getPrecio() {return precio;}
    public void setPrecio(double precio) {this.precio=precio;}

    public int getRam() {return ram;}
    public void setRam(int ram) {this.ram=ram;}

    public void actualizarRam(int nuevaRam){
        if(nuevaRam>0) this.ram=nuevaRam;
    }
    public void aplicarDescuento(double porcentaje){
        if(porcentaje<0) porcentaje=0;
    else if (porcentaje>100) porcentaje=100;
    this.precio=this.precio*(1-porcentaje/100.00);
    }

    public boolean mayorRam(Pc p){
        return this.ram>p.ram;
    }
    public String toString(){
        return "Pc marca: " + marca + "| Procesador: " + procesador + "| RAM: " + ram + "GB" + "| Precio $: " + precio;
    }
}
