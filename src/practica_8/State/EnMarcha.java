package practica_8.State;

public class EnMarcha implements State {
	private Vehiculo vehiculo;
    
    public EnMarcha(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
    
    @Override
    public void contacto() {
        System.out.println("El vehiculo ya esta encendido y en movimiento.");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando.");
        this.vehiculo.setVelocidad(this.vehiculo.getVelocidad() - 20);
        if(this.vehiculo.getVelocidad() <= 0){
            this.vehiculo.setEstado(this.vehiculo.getParado());
        }
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando!");
        this.vehiculo.setCombustible(this.vehiculo.getCombustible() - 20);
        this.vehiculo.setVelocidad(this.vehiculo.getVelocidad() + 20);
        if(this.vehiculo.getCombustible() <= 0){
            System.out.println("Nos hemos quedado sin combustible.");
            this.vehiculo.setEstado(this.vehiculo.getSinCombustible());
        }
    }
    
    @Override
    public void repostar() {
        System.out.println("El vehiculo no puede repostar en marcha!");
    }
}
