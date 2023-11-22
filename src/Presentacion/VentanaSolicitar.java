package Presentacion;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Objects;

public class VentanaSolicitar extends JFrame {
    private JPanel pnlSecundario;
    private JLabel lblBienvenida;
    private JLabel lblTipoVehiculo;
    private JComboBox cmbTipos;
    private JPanel pnlImagen;
    private JLabel lblTarifas;
    private JButton btnConsultar;
    private JLabel lblImagen;

    private void setImage() {
        Image img = null;
        try {
            img = ImageIO.read(Objects.requireNonNull(getClass().getResource("123/papa.png")));
            lblImagen.setIcon(new ImageIcon(img));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public VentanaSolicitar (){

        setImage();

        this.setContentPane(pnlSecundario);

        this.setSize(598,415);

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
