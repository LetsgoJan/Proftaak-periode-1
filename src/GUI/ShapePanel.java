package GUI;

import BusinessLogic.ShapeManager;
import model.blok;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePanel {
    private MainFrame mainFrame;
    private ShapeManager shapeManager;

    public ShapePanel(MainFrame mainFrame, ShapeManager shapeManager){
        this.mainFrame = mainFrame;
        this.shapeManager = shapeManager;
    }

    public JPanel getPanel(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2));
        panel.setBackground(Color.blue);
        panel.setBounds(10,20,400,200);

        JLabel lbName = new JLabel("Name");
        JLabel lbWidth = new JLabel("Width");
        JLabel lbLength = new JLabel("Length");
        JLabel lbHeight = new JLabel("Height");
        JLabel lbRadius = new JLabel("Radius");
        JLabel lbContent = new JLabel("Content");

        JTextField tfName = new JTextField();
        JTextField tfWidth = new JTextField();
        JTextField tfLength = new JTextField();
        JTextField tfHeight = new JTextField();
        JTextField tfRadius = new JTextField();
        JTextField tfContent = new JTextField();

        JButton btnSave = new JButton("Opslaan");
        btnSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addShape(Integer.parseInt(tfWidth.getText()),Integer.parseInt(tfLength.getText()),Integer.parseInt(tfHeight.getText()));
                reloadMainPanel();
            }
        } );

        JButton btnCancel = new JButton("Annuleren");
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reloadMainPanel();
            }
        } );

        panel.add(lbName);
        panel.add(tfName);
        panel.add(lbWidth);
        panel.add(tfWidth);
        panel.add(lbLength);
        panel.add(tfLength);
        panel.add(lbHeight);
        panel.add(tfHeight);
        panel.add(lbRadius);
        panel.add(tfRadius);
        panel.add(lbContent);
        panel.add(tfContent);
        panel.add(btnSave);
        panel.add(btnCancel);

        return panel;
    }
    private void addShape(int i1, int i2, int i3){
        shapeManager.addShape(new blok(i1, i2, i3));
    }

    private void reloadMainPanel(){
        mainFrame.setMainPanel();
    }
}
