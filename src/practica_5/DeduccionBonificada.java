package trabajofds5;

public class DeduccionBonificada extends Deduccion{
    @Override
    public void setDeduccion(double porcentaje) {
        this.porcentajeReduccion = porcentaje*2;
    }  
}
