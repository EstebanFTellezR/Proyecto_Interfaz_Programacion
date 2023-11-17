import java.util.HashMap;
public class Estacionamiento {
    
    private int vehiculo;
    
    public Estacionamiento(int vehiculo) {
        this.vehiculo=vehiculo;
    }

    HashMap <Integer, Integer> lista = new HashMap<>();

    public void marcar () {
        for (int i = 0 ;i <= 29;i++){
            esta.put(i,0);
        }
    }
}
