package practica_8.State;

public class Vehiculo {
	
	private int combustible;
    private int velocidad;
    
    private State apagado;
    private State parado;
    private State enMarcha;
    private State sinCombustible;
    
    private State estado;
    
    public Vehiculo(){
        this.combustible = 0;
        this.velocidad = 0;
        this.apagado = new Apagado(this);
        this.parado = new Parado(this);
        this.enMarcha = new EnMarcha(this);
        this.sinCombustible = new SinCombustible(this);
        this.estado = this.sinCombustible;
    }
    
    public void repostar(){
        this.estado.repostar();
    }
    
    public void frenar(){
        this.estado.frenar();
    }
    
    public void acelerar(){
        this.estado.acelerar();
    }
    
    public void contacto(){
        this.estado.contacto();
    }

	public int getCombustible() {
		return combustible;
	}

	public void setCombustible(int combustible) {
		this.combustible = combustible;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public State getApagado() {
		return apagado;
	}

	public void setApagado(State apagado) {
		this.apagado = apagado;
	}

	public State getParado() {
		return parado;
	}

	public void setParado(State parado) {
		this.parado = parado;
	}

	public State getEnMarcha() {
		return enMarcha;
	}

	public void setEnMarcha(State enMarcha) {
		this.enMarcha = enMarcha;
	}

	public State getSinCombustible() {
		return sinCombustible;
	}

	public void setSinCombustible(State sinCombustible) {
		this.sinCombustible = sinCombustible;
	}

	public State getEstado() {
		return estado;
	}

	public void setEstado(State estado) {
		this.estado = estado;
	}

}
