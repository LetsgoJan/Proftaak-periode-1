package GUI;

import javax.swing.*;
import java.awt.*;

/*
    main overzicht
 */

public class viewControl extends JFrame {

    private JPanel jPanelOverzicht;
    private JTable jTable;

    private ShapePanel shPanel;
    private ShapeTypePanel shTypePanel;

    public viewControl(){
        initFrame();
        shapesOverzicht();
    }

    private void initFrame() {
        //JFrame
        setSize(800,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.yellow);
        setTitle("PROFTAAK");
    }

    private void shapesOverzicht(){
        //JPanel
        JLabel jPanelTitel = new JLabel("Shapes");
        jPanelTitel.setBounds(200,50,300,20);

        //jTable.setEnabled(true);
        JScrollPane scrollPane = new JScrollPane(jTable);
        scrollPane.setBounds(5,10,100,200);


        jPanelOverzicht = new JPanel();
        jPanelOverzicht.setLayout(null);
        jPanelOverzicht.setBounds(10,20,200,300);
        jPanelOverzicht.add(jPanelTitel);
        jPanelOverzicht.add(scrollPane);
        getContentPane().add(jPanelOverzicht);
    }

//    public static void main(String[] args){
//        JFrame.setDefaultLookAndFeelDecorated(true);
//        viewControl window = new viewControl();
//        window.setVisible(true);
//    }


}
