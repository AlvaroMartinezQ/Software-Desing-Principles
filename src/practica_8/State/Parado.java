package practica_8.State;

public class Parado implements State {
	private Vehiculo vehiculo;
    
    public Parado(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
    
    @Override
    public void contacto() {
        System.out.println("Apagando motor.");
        this.vehiculo.setEstado(this.vehiculo.getApagado());
    }

    @Override
    public void frenar() {
        System.out.println("El vehiculo esta parado, no podemos frenar.");
    }

    @Override
    public void acelerar() {
        if(this.vehiculo.getCombustible() <= 0){
            System.out.println("Imposible acelerar estamos sin combustible.");
            this.vehiculo.setEstado(this.vehiculo.getSinCombustible());
        }else{
            System.out.println("Poniendo el vehiculo en movimiento.");
            this.vehiculo.setCombustible(this.vehiculo.getCombustible() - 20);
            this.vehiculo.setVelocidad(20);
            this.vehiculo.setEstado(this.vehiculo.getEnMarcha());
        }
    }
    
    @Override
    public void repostar() {
        System.out.println("Imposible repostar ahora.");
    }
}
