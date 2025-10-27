public class EstacionServicio{
    public static final int CAPACIDAD_MAX=10000;
    private double stock;

    public EstacionServicio(){
        this.stock=0;
    }
    public EstacionServicio(double stockInicial){
        this.stock=stockInicial;
        if(this.stock>CAPACIDAD_MAX) this.stock=CAPACIDAD_MAX;
        if(this.stock<0) this.stock=0;
    }
    public void cargar(double litros){
        if(litros<0) return;
        if(litros>stock) stock=0;
        else stock-=litros;
    }
    public void reponer(double litros){
        if(litros<0) return;
        stock += litros;
        if(stock>CAPACIDAD_MAX) stock=CAPACIDAD_MAX;
    }
    public boolean bajoMinimo(){
        return stock<10;
    }
    public double getStock(){return stock;}

    @Override
    public String toString(){
        String aviso = bajoMinimo()? "| STOCK BAJO(<10L)" : "";
        return "Estacion de servicio -> Stock: "+stock+ "L/" +CAPACIDAD_MAX+ "L" +aviso;
    }
}