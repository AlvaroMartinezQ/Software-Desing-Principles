package practica_8.State;

public class Apagado implements State {
	private Vehiculo vehiculo;
    
    public Apagado(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
    
    @Override
    public void contacto() {
        System.out.println("Arrancamos!");
        this.vehiculo.setEstado(this.vehiculo.getParado());
    }

    @Override
    public void frenar() {
        //No actuo
        System.out.println("El vehiculo esta apagado, imposible frenar.");
    }

    @Override
    public void acelerar() {
        //No actuo
        System.out.println("El vehiculo esta apagado, imposible acelerar.");
    }

    @Override
    public void repostar() {
        //No actuo
        System.out.println("Imposible repostar ahora.");
    }
}
