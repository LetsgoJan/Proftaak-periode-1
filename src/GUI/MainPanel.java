package GUI;

import BusinessLogic.ShapeManager;
import model.Ishape;
import model.blok;
import model.bol;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/*
    main overzicht
 */

public class MainPanel implements Runnable {
    private JFrame frame;
    private ShapeManager shapeManager;
    private List<Ishape> shapes;

    private JTable jtable;
    private JButton buttonAdd, buttonDel, buttonChange, buttonPrint, buttonSave;


    public MainPanel(ShapeManager shapemanager, List<Ishape> lijst){
        this.shapeManager = shapemanager;
        this.shapes = lijst;
    }

    @Override
    public void run() {
        frame = new JFrame("Main frame");
        frame.setPreferredSize(new Dimension(830,500));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        components(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void components(Container contentPane) {

        JLabel titelOverzicht = new JLabel("Overzicht");
        titelOverzicht.setFont(new Font("Dialog", Font.BOLD, 16));
        titelOverzicht.setForeground(new Color(40,86,120));
        titelOverzicht.setBounds(320,10,600,30);

        maakShapesLijst(shapes);

        jtable.setEnabled(false);

        JScrollPane scrollPane = new JScrollPane(jtable);
        scrollPane.setBounds(10,70,780,300);

        JPanel paneloverzicht = new JPanel();
        paneloverzicht.setLayout(null);
        paneloverzicht.setBackground(Color.yellow);
        paneloverzicht.setBounds(10,20,800,400);
        paneloverzicht.add(titelOverzicht);
        paneloverzicht.add(scrollPane);

        contentPane.add(paneloverzicht);


        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(10, 100, 100, 100); // ?????
        buttonAdd = new JButton("Toeveogen");
        buttonDel = new JButton("Verwijderen");
        buttonChange = new JButton("Wijzigen");
        buttonSave = new JButton("Database");
        buttonPrint = new JButton("File");

        buttonPanel.add(buttonAdd);
        buttonPanel.add(buttonDel);
        buttonPanel.add(buttonChange);
        buttonPanel.add(buttonSave);
        buttonPanel.add(buttonPrint);

        /*
        interface testen
        
         */

        contentPane.add(buttonPanel);

        DefaultComboBoxModel<ShapesType> sModel = new DefaultComboBoxModel<>(ShapesType.values());
        System.out.println(ShapesType.BLOK + "<-------------"); // test

    }

    private void maakShapesLijst(List<Ishape> lijst) {
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

    }




}
