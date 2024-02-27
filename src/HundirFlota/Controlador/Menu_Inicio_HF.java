package HundirFlota.Controlador;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu_Inicio_HF extends JFrame {
    private JPanel mainpanel;
    private JPanel panel_central;
    private JPanel panel_titulo;
    private JPanel panel_botones;
    private JButton boton_jugar;
    private JLabel titulo;
    private JLabel subtitulo;
    private JButton boton_salir;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu_Inicio");
        frame.setContentPane(new Menu_Inicio_HF().mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(0,0,820,500);



    }

    public Menu_Inicio_HF() {
        boton_jugar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    Elegir_Personaje elegir_personaje = new Elegir_Personaje();
                    elegir_personaje.mostrarVentana(Menu_Inicio_HF.this);
                }

        });
        boton_salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // frame.dispose();
            }
        });
    }


}
