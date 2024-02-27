package HundirFlota.Controlador;

import HundirFlota.Models.MapPoint;
import HundirFlota.Models.PositionLabel;
import HundirFlota.Models.Ship;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Colocar {
    public static JFrame frame;
    private JPanel mainPanel;
    private JPanel panel_central;
    private JPanel panel_izq;
    private JLabel foto_jugador1;
    private JPanel panel_nombre_jugador1;
    private JLabel nombre_jugador1;
    private JPanel panel_titulo;
    private JLabel titulo;
    private JPanel panel_abajo;
    private JPanel tablaMapPoints;
    private final int tamanhoTablero=20;
    public static MapPoint[][] map;
    private JPopupMenu menuEmergente;
    private JMenuItem barco5Vertical, barco5Horizontal,barco4Vertical,barco4Horizontal,barco3Vertical,barco3Horizontal, barco2Vertical,barco2Horizontal,barco1;
    private int iSelected;
    private int jSelected;
    public static ArrayList<Ship>  ships;

    public static void startUI(String playerName) {
        frame = new JFrame("Colocar");
        frame.setContentPane(new Colocar(playerName).mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setBounds(500,200,800,900);
        frame.setVisible(true);
    }

    //CONSTRUCTOR
    public Colocar(String playerName) {
        ships = new ArrayList<Ship>();
        map = new MapPoint[20][20];
        setMenuEmergente();
        nombre_jugador1.setText(playerName);
        tablaMapPoints.setLayout(new GridLayout(tamanhoTablero+1,tamanhoTablero+1));
        tablaMapPoints.setBackground(Color.decode(ResourceBundle.getBundle("colors").getString("defaultBackground")));
        for(int i = tamanhoTablero; i >= 0; i--){
            for(int j = 0; j < (tamanhoTablero+1); j++){
                if(i == 0 && j== 0){
                    JLabel label = new JLabel("");
                    tablaMapPoints.add(label, i, j);
                }else if(i == 0){
                    PositionLabel pl= new PositionLabel(String.valueOf(j));
                    tablaMapPoints.add(pl, i, j);
                }else if(j == 0){
                    PositionLabel pl= new PositionLabel(String.valueOf(i));
                    tablaMapPoints.add(pl, i, j);
                }else {
                    MapPoint p = new MapPoint();
                    map[i-1][j-1] = p;
                    tablaMapPoints.add(p, i, j);
                    final int finalI = i;
                    final int finalJ = j;
                    p.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            super.mousePressed(e);
                            if(SwingUtilities.isRightMouseButton(e)){
                                menuEmergente.show(map[finalI-1][finalJ-1], e.getX(), e.getY());
                            }else if(SwingUtilities.isLeftMouseButton(e)){
                                shipListFrame.startUI(e.getXOnScreen(), e.getYOnScreen(), finalI-1,finalJ-1);
                            }
                            iSelected = finalI-1;
                            jSelected = finalJ-1;
                        }
                    });
                }
            }
        }
    }
    //estblece las opciones del menú emergente
    private void setMenuEmergente(){
        menuEmergente=new JPopupMenu();
        barco1=new JMenuItem("Barco 1");
        barco2Horizontal=new JMenuItem("Barco 2 Horizontal");
        barco2Vertical=new JMenuItem("Barco 2 Vertical");
        barco3Horizontal=new JMenuItem("Barco 3 Horizontal");
        barco3Vertical=new JMenuItem("Barco 3 Vertical");
        barco4Horizontal=new JMenuItem("Barco 4 Horizontal");
        barco4Vertical=new JMenuItem("Barco 4 Vertical");
        barco5Horizontal=new JMenuItem("Barco 5 Horizontal");
        barco5Vertical=new JMenuItem("Barco 5 Vertical");
        menuEmergente.add(barco1);
        menuEmergente.add(barco2Horizontal);
        menuEmergente.add(barco2Vertical);
        menuEmergente.add(barco3Horizontal);
        menuEmergente.add(barco3Vertical);
        menuEmergente.add(barco4Horizontal);
        menuEmergente.add(barco4Vertical);
        menuEmergente.add(barco5Horizontal);
        menuEmergente.add(barco5Vertical);

        //Actionlisteners de las opciones del JPopupMenu
        //BARCO 1
        barco1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ship.colocarBarco(iSelected, jSelected, 1, 0, map, ships, frame);
            }
        });
        // BARCO 2
        barco2Vertical.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ship.colocarBarco(iSelected, jSelected, 2, 0, map, ships, frame);
            }
        });
        barco2Horizontal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ship.colocarBarco(iSelected, jSelected, 2, 3, map, ships, frame);
            }
        });
        // BARCO 3
        barco3Vertical.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ship.colocarBarco(iSelected, jSelected, 3, 0, map, ships, frame);
            }
        });
        barco3Horizontal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ship.colocarBarco(iSelected, jSelected, 3, 3, map, ships, frame);
            }
        });
        // BARCO 4
        barco4Vertical.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ship.colocarBarco(iSelected, jSelected, 4, 0, map, ships, frame);
            }
        });
        barco4Horizontal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ship.colocarBarco(iSelected, jSelected, 4, 3, map, ships, frame);
            }
        });
        // BARCO 5
        barco5Vertical.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ship.colocarBarco(iSelected, jSelected, 5, 0, map, ships, frame);
            }
        });
        barco5Horizontal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ship.colocarBarco(iSelected, jSelected, 5, 3, map, ships, frame);
            }
        });

    }
}
