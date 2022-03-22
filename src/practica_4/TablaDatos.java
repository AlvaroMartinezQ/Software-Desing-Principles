package practica_4;

public class TablaDatos {
    
    protected String[] titulos;
    protected boolean[] abierto;
    protected boolean[] cerrado;
    protected long[] tiempoAbierto;
    protected long[] tiempoCerrado;
    
    
    
    public void setTitulos(String[] titulos){this.titulos = titulos;}
    public void setAbierto(boolean[] abierto){this.abierto = abierto;}
    public void setCerrado(boolean[] cerrado){this.cerrado = cerrado;}
    public void setTiempoAbierto(long[] tiempoAbierto){this.tiempoAbierto = tiempoAbierto;}
    public void setTiempoCerrado(long[] tiempoCerrado){this.tiempoCerrado = tiempoCerrado;}
}
