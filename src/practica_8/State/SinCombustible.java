package practica_8.State;

public class SinCombustible implements State {
	
	private Vehiculo vehiculo;
    
    public SinCombustible(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
    
    @Override
    public void contacto() {
        System.out.println("Sin combustible, imposible hacer contacto.");
    }

    @Override
    public void frenar() {
        System.out.println("Sin combustible, imposible frenar.");
    }

    @Override
    public void acelerar() {
        System.out.println("Sin combustible, imposible acelerar.");
    }
    
    @Override
    public void repostar() {
        System.out.println("Repostando!");
        this.vehiculo.setCombustible(120);
        this.vehiculo.setEstado(vehiculo.getApagado());
    }
}
