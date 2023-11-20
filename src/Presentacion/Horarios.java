package Presentacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Horarios extends JFrame{
    private JPanel pnlAux;
    private JLabel lblHorarios;
    private JTextArea horarioDiurno6am5pmTextArea;
    private JButton btnReservar;
    private JLabel etiquetaHora;

    public Horarios () {
        setTitle("Información - Parqueadero");

        this.setContentPane(pnlAux);

        this.setSize(600,300);

        this.setLocation(650, 200);

        this.setResizable(true);

        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setResizable(false);

        btnReservar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaMapa mapa = new VentanaMapa();
            }
        });
    }
}
