package trabajofds5;

public class IvaReducido implements Iva {
    
    private final double PORCENTAJE_IVA_REDUCIDO = 0.08;

    @Override
    public double getPorcentajeIva() {
        return PORCENTAJE_IVA_REDUCIDO;
    }
    
    @Override
    public double calcularIVA(double importe) {
        return importe * PORCENTAJE_IVA_REDUCIDO;
    }
}
