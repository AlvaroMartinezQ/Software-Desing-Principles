package trabajofds5;

public class Main {
    public static void main(String[] args){
        FacturaFactorizada ff = new FacturaFactorizada(new IvaNormal(), new DeduccionNormal());
        ff.setImporteFactura(200);
        ff.setPorcentajeDeduccion(20);
        ff.CalcularTotal();
        System.out.println(ff.toString());
    }
}
