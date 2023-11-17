import java.util.HashMap;
public class Estacionamiento {
    
    private int vehiculo;
    public HashMap <Integer, Integer> lista = new HashMap<>();
    
    public Estacionamiento(int vehiculo) {
        this.vehiculo=vehiculo;
    }

    public void marcar () {
        for (int i = 0 ;i <= 29;i++){
            lista.put(i,0);
        }
    }
}
