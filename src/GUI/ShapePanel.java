package GUI;

import javax.swing.*;
import java.awt.*;

public class ShapePanel {
    public ShapePanel(){

    }

    public JPanel getPanel(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.yellow);
        panel.setBounds(10,20,800,400);

        return panel;
    }
}
