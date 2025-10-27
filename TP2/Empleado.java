public class Empleado{
    private int legajo;
    private double sueldoBase;
    private double pagoHoraExtra;
    private int horaExtraMes;
    private boolean casado;
    private int hijos;

    public Empleado(int legajo, double sueldoBase, double pagoHoraExtra, int horaExtraMes, boolean casado, int hijos){
        this.legajo=legajo;
        this.sueldoBase=sueldoBase;
        this.pagoHoraExtra=pagoHoraExtra;
        this.horaExtraMes=horaExtraMes;
        this.casado=casado;
        this.hijos=hijos;
    }
    public int getLegajo(){return legajo;}
    public double getSueldoBase(){return sueldoBase;}
    public double getPagoHoraExtra(){return pagoHoraExtra;}
    public int getHoraExtraMes(){return horaExtraMes;}
    public boolean getCasado(){return casado;}
    public int getHijos(){return hijos;}

    public double calcularComplementoHorasExtra(){
        return pagoHoraExtra*horaExtraMes;
    }
    public double calcularSueldoBruto(){
        return sueldoBase+calcularComplementoHorasExtra();
    }
    public double calcularRetenciones(){
        double porcentaje = 0.0;
        if(casado){
            porcentaje = porcentaje + 0.10;
        }
        porcentaje=porcentaje + (0.01*hijos);
        return sueldoBase*porcentaje;
    }
    @Override
    public String toString(){
        return "Empleado -> legajo: "+legajo+ "| Sueldo base: "+sueldoBase+ "| Pago de horas extra: "+pagoHoraExtra+ "| Horas extra echas al mes: "+horaExtraMes+ "| Casado?: "+casado+ "| Hijos?: "+hijos;
    }


}