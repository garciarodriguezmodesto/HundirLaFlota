package HundirFlota.Models;

import javax.swing.*;
import java.awt.*;
import java.util.ResourceBundle;

public class MapPoint extends JButton {

    // constructor
    public MapPoint() {
        setSea();
    }

    public void setBoat(){
        setBackground(Color.decode(ResourceBundle.getBundle("colors").getString("alternativeBackground")));
    }

    public void setSea(){
        setBackground(Color.decode(ResourceBundle.getBundle("colors").getString("defaultBackground")));
    }

    public boolean isBoat(){
        if(getBackground().equals(Color.decode(ResourceBundle.getBundle("colors").getString("alternativeBackground")))) return true;
        return false;
    }
}
