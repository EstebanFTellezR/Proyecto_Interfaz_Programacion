import java.util.HashMap;
public class Estacionamiento {
    private int vehiculo;
    public Estacionamiento(int vehiculo) {
        this.vehiculo=vehiculo;
    }

    HashMap <Integer, Integer> esta = new HashMap<>();

    public void nose () {
        for (int i = 0 ;i <= 29;i++){
            esta.put(i,0);
        }
    }
}
