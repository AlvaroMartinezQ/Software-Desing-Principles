package practica_5;

public class IvaNormal implements Iva{

    private final double PORCENTAJE_IVA_NORMAL = 0.16;

    @Override
    public double getPorcentajeIva() {
        return PORCENTAJE_IVA_NORMAL;
    }
    
    @Override
    public double calcularIVA(double importe) {
        return importe * PORCENTAJE_IVA_NORMAL;
    }
    
}
