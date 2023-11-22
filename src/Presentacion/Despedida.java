package Presentacion;

import javax.swing.*;

public class Despedida extends JFrame {
    private JPanel pnlChao;
    private JLabel lblChao;

    public Despedida (){
        setTitle("FIN");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setContentPane(pnlChao);

        this.setSize(600,400);

        this.setLocation(650, 200);

        this.setResizable(true);

        this.setVisible(true);

        this.setResizable(false);
    }
}
