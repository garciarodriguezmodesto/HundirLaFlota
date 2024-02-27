package HundirFlota.Models;

import javax.swing.*;
import java.awt.*;
import java.util.ResourceBundle;

public class PositionLabel extends JPanel {

    public PositionLabel(String number) {
        JLabel label = new JLabel(String.valueOf(number));
        label.setForeground(Color.WHITE);
        label.setAlignmentX(JLabel.CENTER);
        label.setAlignmentY(JLabel.CENTER);
        setBackground(Color.decode(ResourceBundle.getBundle("colors").getString("defaultBackground")));
        add(label, JLabel.CENTER);
    }
}
