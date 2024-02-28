package HundirFlota.Models;

import javax.swing.*;
import java.util.ArrayList;

public class Ship {
    //atributos
    private ArrayList<MapPoint> positions;
    // constructor
    public Ship(ArrayList<MapPoint> positions) {
        this.positions = positions;
        for(int i = 0; i < positions.size(); i++) {
            positions.get(i).setBoat();
        }
    }

    /**
     * @param positionX x position on the map
     * @param positionY y position on the map
     * @param longSize long size of the boat
     * @param side 0 for vertical down, 1 for horizontal left, 2 for vertical up, 3 for horizontal right
     * @param map MapPoint double array to get MapPoint objects
     * @param ships arraylist to add the new ship
     * @param frame frame where displaying the error messages with JOptionPane
     */
    public static void colocarBarco(int positionX, int positionY, int longSize, int side, MapPoint[][] map, ArrayList<Ship> ships, JFrame frame){
        ArrayList<MapPoint> positions = new ArrayList<MapPoint>();
        switch(side){
            //vertical, hacia abajo
            case 0:
                try {
                    for (int i = 0; i < longSize; i++) {
                        if(map[positionX + i][positionY].isBoat()) {
                            throw new Exception("Barco posicionado");
                        }
                        positions.add(map[positionX + i][positionY]);
                    }
                    ships.add(new Ship(positions));
                }catch(IndexOutOfBoundsException ex){
                    JOptionPane.showMessageDialog(frame, "Fuera de los límites.", "Error", JOptionPane.ERROR_MESSAGE);
                }catch(Exception ex){
                    if(ex.getMessage().contains("Barco posicionado")){
                        JOptionPane.showMessageDialog(frame, "Ya hay un barco posicionado en la posición objetivo.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                break;
            // horizontal izquierda
            case 1:
                try {
                    for (int i = 0; i < longSize; i++) {
                        if(map[positionX][positionY - i].isBoat()) {
                            throw new Exception("Barco posicionado");
                        }
                        positions.add(map[positionX][positionY - i]);
                    }
                    ships.add(new Ship(positions));
                    break;
                }catch(IndexOutOfBoundsException ex){
                    JOptionPane.showMessageDialog(frame, "Fuera de los límites", "Error", JOptionPane.ERROR_MESSAGE);
                }catch(Exception ex){
                    if(ex.getMessage().contains("Barco posicionado")){
                        JOptionPane.showMessageDialog(frame, "Ya hay un barco posicionado en la posición objetivo.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

                // vertical hacia arriba
            case 2:
                try{
                    for(int i = 0; i < longSize; i++){
                        if(map[positionX-i][positionY].isBoat()) {
                            throw new Exception("Barco posicionado");
                        }
                        positions.add(map[positionX-i][positionY]);
                    }
                    ships.add(new Ship(positions));
                }catch(IndexOutOfBoundsException ex){
                    JOptionPane.showMessageDialog(frame, "Fuera de los límites", "Error", JOptionPane.ERROR_MESSAGE);
                }catch(Exception ex){
                    if(ex.getMessage().contains("Barco posicionado")){
                        JOptionPane.showMessageDialog(frame, "Ya hay un barco posicionado en la posición objetivo.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                break;
            // horizontal, hacia derecha
            case 3:
                try{
                    for(int i = 0; i < longSize; i++){
                        if(map[positionX][positionY+i].isBoat()) {
                            throw new Exception("Barco posicionado");
                        }
                        positions.add(map[positionX][positionY+i]);
                    }
                    ships.add(new Ship(positions));
                }catch(IndexOutOfBoundsException ex){
                    JOptionPane.showMessageDialog(frame, "Fuera de los límites", "Error", JOptionPane.ERROR_MESSAGE);
                }catch(Exception ex){
                    if(ex.getMessage().contains("Barco posicionado")){
                        JOptionPane.showMessageDialog(frame, "Ya hay un barco posicionado en la posición objetivo.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                break;
        }
    }
}
