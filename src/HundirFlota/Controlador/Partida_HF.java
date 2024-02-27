package HundirFlota.Controlador;

import javax.swing.*;

public class Partida_HF extends JFrame{
    private JPanel mainpanel;
    private JPanel panel_central;
    private JPanel panel_titulo;
    private JLabel titulo;
    private JPanel panel_barcos_horiz;
    private JPanel panel_izq;
    private JPanel panel_der;
    private JLabel foto_jugador1;
    private JLabel nombre_jugador1;
    private JPanel panel_nombre_jugador1;
    private JPanel panel_nombre_jugador2;
    private JPanel tabla_uno;
    private JPanel tabla_dos;
    private JPanel panel_abajo;
    private JLabel titulo_barcos;
    private JPanel fila_tabla;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JPanel panel_letras;
    private JPanel panel_numeros;
    private JPanel tabla_barco;
    private JPanel barco_uno;

    public void mostrarVentana(final Elegir_Personaje elegir_personaje){
        JFrame frame = new JFrame("Inicio Partida");
        frame.setContentPane(mainpanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(0,0,1280,680);
    }
}
