package GUI;

import BusinessLogic.ShapeManager;
import model.Ishape;
import model.blok;
import model.bol;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/*
    main overzicht
 */

public class MainPanel {
    private MainFrame mainFrame;
    private ShapeManager shapeManager;
    private List<Ishape> shapes;

    private JTable jtable;
    private JButton buttonAdd, buttonDel, buttonChange, buttonPrint, buttonSave;


    public MainPanel(MainFrame mainFrame, ShapeManager shapemanager){
        this.shapeManager = shapemanager;
        this.shapes = shapemanager.getShapesLijst();
        this.mainFrame = mainFrame;
    }

    public JPanel getPanel1(){
        JLabel labelOverzicht = new JLabel("Overzicht");
        labelOverzicht.setFont(new Font("Dialog", Font.BOLD, 16));
        labelOverzicht.setForeground(new Color(40,86,120));
        labelOverzicht.setBounds(320,10,600,30);

        JScrollPane scrollPane = new JScrollPane(getJTable(shapes));
        scrollPane.setBounds(10,70,780,300);

        JPanel paneloverzicht = new JPanel();
        paneloverzicht.setLayout(null);
        paneloverzicht.setBackground(Color.yellow);
        paneloverzicht.setBounds(10,20,800,400);
        paneloverzicht.add(labelOverzicht);
        paneloverzicht.add(scrollPane);

        return  paneloverzicht;
    }

    public JPanel getPanel2(){
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(10, 100, 100, 100); // ?????
        buttonAdd = new JButton("Toevoegen");
        buttonAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainFrame.setShapePanel();
            }
        } );
        buttonDel = new JButton("Verwijderen");
        buttonChange = new JButton("Wijzigen");
        buttonSave = new JButton("Database");
        buttonPrint = new JButton("File");

        buttonPanel.add(buttonAdd);
        buttonPanel.add(buttonDel);
        buttonPanel.add(buttonChange);
        buttonPanel.add(buttonSave);
        buttonPanel.add(buttonPrint);

        return buttonPanel;
    }

    private JTable getJTable(List<Ishape> lijst) {
        String[] kolom ={
                "Vorm",
                "Straal",
                "Breedte",
                "Lengte",
                "Hoogte",
                "Inhoud"
        };

        String[][] rij = new String[lijst.size()][6];
        int i = 0;
         for(Ishape eenshape: lijst){
            if(eenshape instanceof bol) {
                rij[i][0] = "BOL";
            }else if(eenshape instanceof blok) {
                rij[i][0] = "BLOK";
            }else {
                rij[i][0] = "CILINDER";
            }
                rij[i][1] = String.valueOf(eenshape.getStraal());
                rij[i][2] = String.valueOf(eenshape.getBreedte());
                rij[i][3] = String.valueOf(eenshape.getLengte());
                rij[i][4] = String.valueOf(eenshape.getHoogte());
                rij[i][5] = String.valueOf(eenshape.shapeInhoud());
                i++;
            }

         jtable = new JTable(rij, kolom);
         jtable.setEnabled(false);

         return jtable;
    }



}
