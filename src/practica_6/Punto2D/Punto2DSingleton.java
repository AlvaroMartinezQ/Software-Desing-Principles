package practica_6.Punto2D;

public class Punto2DSingleton {

	private int x, y;
	private static Punto2DSingleton punto = null;

	private Punto2DSingleton() {
		this.x = 0;
		this.y = 0;
	}

	public static Punto2DSingleton getInstance() {
		if (punto == null) {
			punto = new Punto2DSingleton();
		}
		return punto;
	}

	@Override
	public String toString() {
		return "(" + getX() + "," + getY() + ")";
	}

	public boolean equals(Punto2DSingleton otroPunto) {
		return getX() == otroPunto.getX() && getY() == otroPunto.getY();
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
}
