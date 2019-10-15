package GUI;

import BusinessLogic.ShapeManager;
import model.blok;
import model.bol;
import model.cilinder;

import javax.swing.*;
import java.awt.*;

public class MainFrame implements Runnable  {
    private JFrame frame;
    private MainPanel mainPanel;
    private ShapePanel shapePanel;
    private ShapeManager shapeManager;

    @Override
    public void run() {
        frame = new JFrame("Main frame");
        frame.setPreferredSize(new Dimension(830,500));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        shapeManager = new ShapeManager();
        shapeManager.addShape(new bol(5.0 ));
        shapeManager.addShape(new blok(20, 10, 12));
        shapeManager.addShape(new cilinder(10, 5));

        mainPanel = new MainPanel(this, shapeManager);
        shapePanel = new ShapePanel(this, shapeManager);

        setMainPanel();
    }

    public void setMainPanel(){
        frame.getContentPane().removeAll();
        frame.getContentPane().add(mainPanel.getPanel1());
        frame.getContentPane().add(mainPanel.getPanel2());
        frame.pack();
        frame.setVisible(true);
    }

    public void setShapePanel(){
        frame.getContentPane().removeAll();
        frame.getContentPane().add(shapePanel.getPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
