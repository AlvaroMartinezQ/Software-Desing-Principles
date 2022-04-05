package Login;

import java.util.ArrayList;

public class LoginSingleton {
   
    private static LoginSingleton ls = null;
    private ArrayList<Usuario> usuarios;
    
    private LoginSingleton(){
        usuarios = new ArrayList<>();
    }
    
    public static LoginSingleton getInstance(){
        if(ls == null){
            ls = new LoginSingleton();
        }
        return ls;
    }
    
    public int registrar(String nombre, String contra){
        for(Usuario us : usuarios){
            if(us.getUsername() == nombre){
                System.out.println("Ya existe el usuario con este nombre.");
                return 0;
            }
        }
        Usuario u = new Usuario(nombre, contra);
        usuarios.add(u);
        System.out.println("Usuario añadido.");
        return 1;
    }
    
    public int acceder(String nombre, String contra){
        Usuario u = new Usuario(nombre, contra);
        if(usuarios.contains(u)){
            System.out.println("Bienvenido usuario "+nombre+".");
            return 1;
        }
        System.out.println("No existe el usuario.");
        return 0;
    }
}
