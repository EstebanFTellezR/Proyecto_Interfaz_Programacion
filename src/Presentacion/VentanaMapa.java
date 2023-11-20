package Presentacion;

import javax.swing.*;

public class VentanaMapa extends JFrame {
    private JPanel pnlMapa;
    private JLabel etiquetaHora;

    public VentanaMapa () {

        setTitle("Selección de espacio");

        this.setContentPane(pnlMapa);

        this.setSize(600,400);

        this.setLocation(650, 200);

        this.setResizable(true);

        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setResizable(false);
    }
}
