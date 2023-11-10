import java.util.Scanner;
public class Solicitar {
    Scanner sc = new Scanner (System.in);
    private int vehiculo;

    public Solicitar(int vehiculo) {
        System.out.println("Selecciones el tipo de vehiculo: \n 1. Carro \n 2. Moto ");
        this.vehiculo = sc.nextInt();
    }
    public void informacion (){

        System.out.println("Horarios: \n Diurno 6:00 am a 6:00 pm \n Nocturno: 6:00 pm a 6:00 am");

        switch (vehiculo) {
            case 1:
                System.out.println("Tarifas: \n - Carro: \n Minuto: $40 \n Hora: $2000 \n Dia: 10000");
                break;
            case 2:
                System.out.println("Tarifas: \n - Moto: \n Minuto: $30 \n Hora: $1.800 \n Dia: 9000");
                break;
            default:
                System.out.println("Numero Invalido");
        }
    }
    public void ocupar (){
        Estacionamiento he = new Estacionamiento(vehiculo);
        he.nose();
    }

}
