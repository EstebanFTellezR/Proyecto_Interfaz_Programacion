package Presentacion;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Objects;

public class VentanaPrincipal extends JFrame {
    private JPanel pnlPrincipal;
    private JButton btnIngresar;
    private JLabel etiquetaHora;


    private void setImage() {
        Image img = null;
        try {
            img = ImageIO.read(Objects.requireNonNull(getClass().getResource("123/Parking.png")));
            btnIngresar.setIcon(new ImageIcon(img));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public VentanaPrincipal(){

        setTitle("Ingresar");

        btnIngresar.setPreferredSize(new Dimension(50, 50));



        this.setContentPane(pnlPrincipal);

        this.setSize(600,400);

        this.setLocation(650, 200);

        this.setResizable(true);

        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setResizable(false);


        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaSolicitar ventanaSolicitar = new VentanaSolicitar();
                dispose();
            }
        });

    }
}
