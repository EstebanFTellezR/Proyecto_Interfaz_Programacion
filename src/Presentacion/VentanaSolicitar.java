package Presentacion;

import javax.swing.*;

public class VentanaSolicitar extends JFrame {
    private JPanel pnlSecundario;
    private JLabel lblBienvenida;
    private JLabel lblTipoVehiculo;
    private JComboBox cmbTipos;
    private JPanel pnlInferior;

    public VentanaSolicitar (){

        this.setContentPane(pnlSecundario);

        this.setSize(600,400);

        this.setLocation(650, 200);

        this.setVisible(true);

        this.setResizable(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
