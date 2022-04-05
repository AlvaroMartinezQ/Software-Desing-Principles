package practica_6.Login;

public class Usuario {

	private String username, password;

	public Usuario(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario: " + getUsername();
	}

	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof Usuario)) {
			return false;
		}
		Usuario c = (Usuario) o;
		return (username.equals(c.username)) && (password.equals(c.password));
	}

	public String getUsername() {
		return this.username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
