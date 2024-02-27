package HundirFlota.Controlador;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Elegir_Personaje extends JFrame{
    private JPanel mainpanel;
    private JPanel panel_central;
    private JPanel panel_izq;
    private JPanel panel_der;
    private JPanel panel_subtitulo;
    private JPanel panel_titulo;
    private JLabel titulo;
    private JTextField textfield_jugador1;
    private JPanel panel_izq_arriba;
    private JPanel panel_izq_abajo;
    private JLabel label_subtitulo;
    private JLabel label_jugador1;
    private JLabel label_escribe_nombre;
    private JLabel foto_jugador_1;
    private JPanel panel_botones;
    private JButton boton_iniciar;
    private JButton boton_salir;

    public void mostrarVentana(final Menu_Inicio_HF menu_inicio_hf){
        JFrame frame = new JFrame("Elegir Personaje");
        frame.setContentPane(mainpanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(0,0,495,590);

        boton_iniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Partida_HF partida_hf = new Partida_HF();
                partida_hf.mostrarVentana(Elegir_Personaje.this);
                frame.dispose();


            }
        });

        boton_salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }

    public Elegir_Personaje() {


    }


}
