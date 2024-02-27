package HundirFlota.Controlador;

import javax.swing.*;

public class Colocar {
    private JPanel mainPanel;
    private JPanel panel_central;
    private JPanel panel_izq;
    private JLabel foto_jugador1;
    private JPanel panel_nombre_jugador1;
    private JLabel nombre_jugador1;
    private JPanel panel_titulo;
    private JLabel titulo;
    private JPanel panel_abajo;
    private JPanel tabla_uno;
    private JPanel fila_tabla;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button1;
    private JPanel panel_letras;
    private JPanel panel_numeros;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Colocar");
        frame.setContentPane(new Colocar().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
