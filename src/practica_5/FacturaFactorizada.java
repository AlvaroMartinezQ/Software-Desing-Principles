package practica_5;

import java.time.*;
import java.time.format.*;
import java.util.Random;

public class FacturaFactorizada {
    
    private Iva iva;
    private Deduccion deduccion;
    
    private String codigo;
    private LocalDateTime fechaEmision;
    private double importeFactura ;
    private double importeIVA;
    private double importeDeduccion;
    private double importeTotal;
    private double porcentajeDeduccion;
    
    public FacturaFactorizada(Iva iva, Deduccion deduccion){
        this.iva = iva;
        this.deduccion = deduccion;
        Random rdm = new Random();
        codigo = rdm.nextInt(10)+""+rdm.nextInt(10)+""
                +rdm.nextInt(10)+""+rdm.nextInt(10)+""
                +rdm.nextInt(10)+""+rdm.nextInt(10)+"";
        fechaEmision = LocalDateTime.now();
    }
    
    // Método que calcula el total de la factura
    public void CalcularTotal() {
        // Calculamos la deducción
        deduccion.setDeduccion (porcentajeDeduccion);
        importeDeduccion = deduccion.calcularDeduccion(importeFactura);

        //Calculamos el IVA
        importeIVA = iva.calcularIVA(importeFactura);

        // Calculamos el total
        importeTotal = importeFactura + importeIVA - importeDeduccion;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("-------------Factura-----------------\n");
        sb.append("Cod.:             ").append("#").append(codigo).append("#").append("\n");
        sb.append("Fecha:            ").append(fechaEmision.format(DateTimeFormatter.ISO_DATE)).append("\n");
        sb.append("Hora:             ").append(fechaEmision.format(DateTimeFormatter.ISO_TIME)).append("\n");
        sb.append("Importe:          ").append(importeFactura).append("\n");
        sb.append("Iva(%):           ").append(iva.getPorcentajeIva()*100).append("\n");
        sb.append("Deduccion(%):     ").append(deduccion.porcentajeReduccion).append("\n");
        sb.append("ImporteIva:       ").append(importeIVA).append("\n");
        sb.append("ImporteDeduccion: ").append(importeDeduccion).append("\n");
        sb.append("ImporteTotal:     ").append(importeTotal).append("\n");
        sb.append("---------------Fin-------------------\n");
        return sb.toString();
    }
    
    //Gets:
    public String getCodigo(){return this.codigo;}
    public LocalDateTime getFechaEmision(){return this.fechaEmision;}
    public double getImporteFactura(){return this.importeFactura;}
    public double getImporteIVA(){return this.importeIVA;}
    public double getImporteDeduccion(){return this.importeDeduccion;}
    public double getImporteTotal(){return this.importeTotal;}
    public double getPorcentajeDeduccion(){return this.porcentajeDeduccion;}
    //End Gets.
    
    //Sets:
    public void setCodigo(String codigo){this.codigo = codigo;}
    public void setFechaEmision(LocalDateTime fechaEmision){this.fechaEmision = fechaEmision;}
    public void setImporteFactura(double importeFactura){this.importeFactura = importeFactura;}
    public void setImporteIVA(double importeIVA){this.importeIVA = importeIVA;}
    public void setImporteDeduccion(double importeDeduccion){this.importeDeduccion = importeDeduccion;}
    public void setImporteTotal(double importeFactura){this.importeTotal = importeTotal;}
    public void setPorcentajeDeduccion(double porcentajeDeduccion){this.porcentajeDeduccion = porcentajeDeduccion;}
    //End Sets.
}
