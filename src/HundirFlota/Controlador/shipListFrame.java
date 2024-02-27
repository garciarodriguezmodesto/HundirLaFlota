package HundirFlota.Controlador;

import HundirFlota.Models.MapPoint;
import HundirFlota.Models.Ship;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class shipListFrame {
    public static JFrame shipListFrame;
    private JLabel shipListLabel;
    private JLabel a5x1ShipLabel;
    private JLabel a3x1ShipLabel;
    private JLabel a2x1ShipLabel;
    public JPanel mainPanel;
    private JPanel a5x1;
    private JPanel a1x5;
    private JLabel a1x1ShipLabel;
    private JLabel a4x1ShipLabel;
    private JPanel a4x1;
    private JPanel a1x4;
    private JPanel a3x1;
    private JPanel a1x3;
    private JPanel a2x1;
    private JPanel a1x2;
    private JPanel a1x1;

    public static void startUI(int x, int y, int iSelected, int jSelected) {
        shipListFrame = new JFrame("Ship List");
        shipListFrame.setContentPane(new shipListFrame(iSelected, jSelected).mainPanel);
        shipListFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        shipListFrame.pack();
        shipListFrame.setVisible(true);
        shipListFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        shipListFrame.setBounds(x ,y ,300,525);
    }



    public shipListFrame(int iSelected, int jSelected) {
        a5x1.setLayout(new BoxLayout(a5x1,BoxLayout.X_AXIS));
        for(int i = 0; i < 5; i++) {
            MapPoint b = new MapPoint();
            b.setMinimumSize(new Dimension(20,20));
            b.setMaximumSize(new Dimension(20,20));
            b.setBoat();

            if(i == 0){
                b.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Ship.colocarBarco(iSelected, jSelected, 5, 3, Colocar.map, Colocar.ships , Colocar.frame);
                        HundirFlota.Controlador.shipListFrame.shipListFrame.dispose();
                    }
                });
            }else if(i == 4){
                b.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        HundirFlota.Controlador.shipListFrame.shipListFrame.dispose();
                    }
                });
            }else{
                b.setEnabled(false);
            }

            a5x1.add(b);
        }

        a1x5.setLayout(new BoxLayout(a1x5,BoxLayout.Y_AXIS));
        for(int i = 0; i < 5; i++) {
            MapPoint b = new MapPoint();
            b.setMinimumSize(new Dimension(20,20));
            b.setMaximumSize(new Dimension(20,20));
            b.setBoat();

            if(i == 0){
                b.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        HundirFlota.Controlador.shipListFrame.shipListFrame.dispose();
                    }
                });
            }else if(i == 4){
                b.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        HundirFlota.Controlador.shipListFrame.shipListFrame.dispose();
                    }
                });
            }else{
                b.setEnabled(false);
            }

            a1x5.add(b);
        }

        a4x1.setLayout(new BoxLayout(a4x1,BoxLayout.X_AXIS));
        for(int i = 0; i < 4; i++) {
            MapPoint b = new MapPoint();
            b.setMinimumSize(new Dimension(20,20));
            b.setMaximumSize(new Dimension(20,20));
            b.setBoat();
            if(i == 0){
                b.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        HundirFlota.Controlador.shipListFrame.shipListFrame.dispose();
                    }
                });
            }else if(i == 3){
                b.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        HundirFlota.Controlador.shipListFrame.shipListFrame.dispose();
                    }
                });
            }else{
                b.setEnabled(false);
            }

            a4x1.add(b);
        }

        a1x4.setLayout(new BoxLayout(a1x4,BoxLayout.Y_AXIS));
        for(int i = 0; i < 4; i++) {
            MapPoint b = new MapPoint();
            b.setMinimumSize(new Dimension(20,20));
            b.setMaximumSize(new Dimension(20,20));
            b.setBoat();

            if(i == 0){
                b.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        HundirFlota.Controlador.shipListFrame.shipListFrame.dispose();
                    }
                });
            }else if(i == 3){
                b.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        HundirFlota.Controlador.shipListFrame.shipListFrame.dispose();
                    }
                });
            }else{
                b.setEnabled(false);
            }

            a1x4.add(b);
        }

        a3x1.setLayout(new BoxLayout(a3x1,BoxLayout.X_AXIS));
        for(int i = 0; i < 3; i++) {
            MapPoint b = new MapPoint();
            b.setMinimumSize(new Dimension(20,20));
            b.setMaximumSize(new Dimension(20,20));
            b.setBoat();

            if(i == 0){
                b.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        HundirFlota.Controlador.shipListFrame.shipListFrame.dispose();
                    }
                });
            }else if(i == 2){
                b.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        HundirFlota.Controlador.shipListFrame.shipListFrame.dispose();
                    }
                });
            }else{
                b.setEnabled(false);
            }

            a3x1.add(b);
        }

        a1x3.setLayout(new BoxLayout(a1x3,BoxLayout.Y_AXIS));
        for(int i = 0; i < 3; i++) {
            MapPoint b = new MapPoint();
            b.setMinimumSize(new Dimension(20,20));
            b.setMaximumSize(new Dimension(20,20));
            b.setBoat();

            if(i == 0){
                b.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        HundirFlota.Controlador.shipListFrame.shipListFrame.dispose();
                    }
                });
            }else if(i == 2){
                b.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        HundirFlota.Controlador.shipListFrame.shipListFrame.dispose();
                    }
                });
            }else{
                b.setEnabled(false);
            }

            a1x3.add(b);
        }

        a2x1.setLayout(new BoxLayout(a2x1,BoxLayout.X_AXIS));
        for(int i = 0; i < 2; i++) {
            MapPoint b = new MapPoint();
            b.setMinimumSize(new Dimension(20,20));
            b.setMaximumSize(new Dimension(20,20));
            b.setBoat();
            if(i == 0){
                b.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        HundirFlota.Controlador.shipListFrame.shipListFrame.dispose();
                    }
                });
            }else if(i == 1){
                b.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        HundirFlota.Controlador.shipListFrame.shipListFrame.dispose();
                    }
                });
            }else{
                b.setEnabled(false);
            }

            a2x1.add(b);
        }

        a1x2.setLayout(new BoxLayout(a1x2,BoxLayout.Y_AXIS));
        for(int i = 0; i < 2; i++) {
            MapPoint b = new MapPoint();
            b.setMinimumSize(new Dimension(20,20));
            b.setMaximumSize(new Dimension(20,20));
            b.setBoat();

            if(i == 0){
                b.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        HundirFlota.Controlador.shipListFrame.shipListFrame.dispose();
                    }
                });
            }else if(i == 1){
                b.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        HundirFlota.Controlador.shipListFrame.shipListFrame.dispose();
                    }
                });
            }else{
                b.setEnabled(false);
            }

            a1x2.add(b);
        }

        a1x1.setLayout(new BoxLayout(a1x1, BoxLayout.X_AXIS));
        MapPoint b = new MapPoint();
        b.setMinimumSize(new Dimension(20,20));
        b.setMaximumSize(new Dimension(20,20));
        b.setBoat();

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        a1x1.add(b);

        shipListFrame.revalidate();
        shipListFrame.repaint();
    }
}
