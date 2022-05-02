package practica_8.Iterator.Usuarios;

public class Usuario {
	
	private String nombre;
    private String clave;
    
    public Usuario(String nombre, String clave){
        this.nombre = nombre;
        this.clave = clave;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

}
