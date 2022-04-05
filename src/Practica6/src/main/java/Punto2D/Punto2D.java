package Punto2D;

public class Punto2D {
    
    private int x, y;
    
    public Punto2D(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString(){
        return "(" + getX() + "," + getY() + ")";
    }
    
    public boolean equals(Punto2D otroPunto){
        return getX() == otroPunto.getX() && getY() == otroPunto.getY();
    }
    
    public int getX(){return this.x;}
    public int getY(){return this.y;}
    
    public void setX(int x){this.x = x;}
    public void setY(int y){this.y = y;}
}
