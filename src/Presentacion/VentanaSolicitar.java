package Presentacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaSolicitar extends JFrame {
    private JPanel pnlSecundario;
    private JLabel lblBienvenida;
    private JLabel lblTipoVehiculo;
    private JComboBox cmbTipos;
    private JPanel pnlInferior;
    private JLabel lblTarifas;
    private JButton btnConsultar;

    public VentanaSolicitar (){

        this.setContentPane(pnlSecundario);

        this.setSize(600,400);

        this.setLocation(650, 200);

        this.setVisible(true);

        this.setResizable(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setResizable(false);

        btnConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Horarios horarios = new Horarios();
                dispose();
            }
        });
    }
}
