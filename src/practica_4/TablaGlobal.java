import java.io.BufferedWriter;
import java.io.FileWriter;


public class TablaGlobal{
    
    TablaBasica tb;
    TablaComplicados tc;
    
    public TablaGlobal(){
        tb = new TablaBasica(false);
        tc = new TablaComplicados(false);
        generaTxT("TablaGlobal.txt");
    }
    
    
    
    private void generaTxT(String nombre){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(nombre))){
            writer.write(this.toString());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(tb.toString()).append(tc.toString());
        return sb.toString();
    }
    
}
