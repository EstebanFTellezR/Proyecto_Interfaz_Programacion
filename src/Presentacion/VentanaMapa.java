package Presentacion;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class VentanaMapa extends JFrame {
    private JPanel pnlMapa;
    private JLabel lblTitulo;
    private JButton btnGuardar;
    private JButton btnRegresar;
    private JButton btn1;
    private JButton btn4;
    private JButton btn7;
    private JButton btn12;
    private JButton btn2;
    private JButton btn6;
    private JButton btn3;
    private JButton btn5;
    private JButton btn8;
    private JButton btn9;
    private JButton btn10;
    private JButton btn11;
    private JLabel etiquetaHora;

    private boolean ocupado;

    private void setImage(String ruta) {
        Image img = null;
        try {
            img = ImageIO.read(getClass().getResource(ruta));
            btn1.setIcon(new ImageIcon(img));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void setImage1(String ruta1) {
        Image img = null;
        try {
            img = ImageIO.read(getClass().getResource(ruta1));
            btn2.setIcon(new ImageIcon(img));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void setImage2(String ruta2) {
        Image img = null;
        try {
            img = ImageIO.read(getClass().getResource(ruta2));
            btn3.setIcon(new ImageIcon(img));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void setImage3(String ruta3) {
        Image img = null;
        try {
            img = ImageIO.read(getClass().getResource(ruta3));
            btn4.setIcon(new ImageIcon(img));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void setImage4(String ruta4) {
        Image img = null;
        try {
            img = ImageIO.read(getClass().getResource(ruta4));
            btn5.setIcon(new ImageIcon(img));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void setImage5(String ruta5) {
        Image img = null;
        try {
            img = ImageIO.read(getClass().getResource(ruta5));
            btn6.setIcon(new ImageIcon(img));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void setImage6(String ruta6) {
        Image img = null;
        try {
            img = ImageIO.read(getClass().getResource(ruta6));
            btn7.setIcon(new ImageIcon(img));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void setImage7(String ruta7) {
        Image img = null;
        try {
            img = ImageIO.read(getClass().getResource(ruta7));
            btn8.setIcon(new ImageIcon(img));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void setImage8(String ruta8) {
        Image img = null;
        try {
            img = ImageIO.read(getClass().getResource(ruta8));
            btn9.setIcon(new ImageIcon(img));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void setImage9(String ruta9) {
        Image img = null;
        try {
            img = ImageIO.read(getClass().getResource(ruta9));
            btn10.setIcon(new ImageIcon(img));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void setImage10(String ruta10) {
        Image img = null;
        try {
            img = ImageIO.read(getClass().getResource(ruta10));
            btn11.setIcon(new ImageIcon(img));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void setImage11(String ruta11) {
        Image img = null;
        try {
            img = ImageIO.read(getClass().getResource(ruta11));
            btn12.setIcon(new ImageIcon(img));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public VentanaMapa () {

        setImage("123/desocupado.png");
        setImage1("123/desocupado.png");
        setImage2("123/desocupado.png");
        setImage3("123/desocupado.png");
        setImage4("123/desocupado.png");
        setImage5("123/desocupado.png");
        setImage6("123/desocupado.png");
        setImage7("123/desocupado.png");
        setImage8("123/desocupado.png");
        setImage9("123/desocupado.png");
        setImage10("123/desocupado.png");
        setImage11("123/desocupado.png");

        ocupado = true;

        setTitle("Selección de espacio");

        this.setContentPane(pnlMapa);

        this.setSize(790,440);

        this.setLocation(650, 200);

        this.setResizable(true);

        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setResizable(false);

        btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaSolicitar regresar = new VentanaSolicitar();
                dispose();
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ruta = "123/ocupado.png";
                if(!ocupado) {
                    ruta = "123/desocupado.png";
                }
                setImage(ruta);
                ocupado = !ocupado;
                btn1.setPreferredSize(new Dimension(0, 0));
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ruta1 = "123/ocupado.png";
                if(!ocupado) {
                    ruta1 = "123/desocupado.png";
                }
                setImage1(ruta1);
                ocupado = !ocupado;
                btn2.setPreferredSize(new Dimension(0, 0));
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ruta2 = "123/ocupado.png";
                if(!ocupado) {
                    ruta2 = "123/desocupado.png";
                }
                setImage2(ruta2);
                ocupado = !ocupado;
                btn3.setPreferredSize(new Dimension(0, 0));
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ruta3 = "123/ocupado.png";
                if(!ocupado) {
                    ruta3 = "123/desocupado.png";
                }
                setImage3(ruta3);
                ocupado = !ocupado;
                btn4.setPreferredSize(new Dimension(0, 0));
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ruta4 = "123/ocupado.png";
                if(!ocupado) {
                    ruta4 = "123/desocupado.png";
                }
                setImage4(ruta4);
                ocupado = !ocupado;
                btn5.setPreferredSize(new Dimension(0, 0));
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ruta5 = "123/ocupado.png";
                if(!ocupado) {
                    ruta5 = "123/desocupado.png";
                }
                setImage5(ruta5);
                ocupado = !ocupado;
                btn6.setPreferredSize(new Dimension(0, 0));
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ruta6 = "123/ocupado.png";
                if(!ocupado) {
                    ruta6 = "123/desocupado.png";
                }
                setImage6(ruta6);
                ocupado = !ocupado;
                btn7.setPreferredSize(new Dimension(0, 0));
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ruta7 = "123/ocupado.png";
                if(!ocupado) {
                    ruta7 = "123/desocupado.png";
                }
                setImage7(ruta7);
                ocupado = !ocupado;
                btn8.setPreferredSize(new Dimension(0, 0));
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ruta8 = "123/ocupado.png";
                if(!ocupado) {
                    ruta8 = "123/desocupado.png";
                }
                setImage8(ruta8);
                ocupado = !ocupado;
                btn9.setPreferredSize(new Dimension(0, 0));
            }
        });
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ruta9 = "123/ocupado.png";
                if(!ocupado) {
                    ruta9 = "123/desocupado.png";
                }
                setImage9(ruta9);
                ocupado = !ocupado;
                btn10.setPreferredSize(new Dimension(0, 0));
            }
        });
        btn11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ruta10 = "123/ocupado.png";
                if(!ocupado) {
                    ruta10 = "123/desocupado.png";
                }
                setImage10(ruta10);
                ocupado = !ocupado;
                btn11.setPreferredSize(new Dimension(0, 0));
            }
        });
        btn12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ruta11 = "123/ocupado.png";
                if(!ocupado) {
                    ruta11 = "123/desocupado.png";
                }
                setImage11(ruta11);
                ocupado = !ocupado;
                btn12.setPreferredSize(new Dimension(0, 0));
            }
        });
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Despedida fin = new Despedida();
                dispose();
            }
        });
    }
}
