package Presentacion;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Objects;

public class Horarios extends JFrame{
    private JPanel pnlAux;
    private JLabel lblHorarios;
    private JButton btnReservar;
    private JTextArea txtInformacion;
    private JLabel lblImagen;
    private JLabel etiquetaHora;


    private void setImage() {
        Image img = null;
        try {
            img = ImageIO.read(Objects.requireNonNull(getClass().getResource("123/Parking.png")));
            lblImagen.setIcon(new ImageIcon(img));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public Horarios () {
        setTitle("Información - Parqueadero");

        this.setContentPane(pnlAux);

        this.setSize(600,350);

        this.setLocation(650, 200);

        this.setResizable(true);

        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setResizable(false);

        btnReservar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaMapa mapa = new VentanaMapa();
                dispose();
            }
        });
    }
}
