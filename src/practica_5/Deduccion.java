package trabajofds5;

public abstract class Deduccion {
    
    protected double porcentajeReduccion;
    
    public double calcularDeduccion(double importe){
        return importe*porcentajeReduccion/100;
    }
    
    public abstract void setDeduccion(double porcentaje);
}
