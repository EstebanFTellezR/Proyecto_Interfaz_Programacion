package Presentacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
    private JPanel pnlPrincipal;
    private JButton ingresarButton;

    public VentanaPrincipal(){

        this.setContentPane(pnlPrincipal);

        this.setSize(600,400);

        this.setLocation(650, 200);

        this.setResizable(true);

        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaSolicitar ventanaSolicitar = new VentanaSolicitar();
                dispose();
            }
        });

    }
}
