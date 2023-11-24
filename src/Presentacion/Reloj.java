package Presentacion;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reloj extends JFrame {
    private JLabel hora;

    public Reloj() {

        setTitle("La hora");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(300, 150);

        setLocation(1238,200);

        hora = new JLabel();

        hora.setFont(new Font("Arial", Font.PLAIN, 36));

        hora.setHorizontalAlignment(JLabel.CENTER);

        add(hora);

        setVisible(true);

        actualizarHora();
    }

    private void actualizarHora() {

        Date horaActual = new Date();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");

        String horaFormateada = formatoHora.format(horaActual);


        hora.setText(horaFormateada);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actualizarHora();
    }
}
