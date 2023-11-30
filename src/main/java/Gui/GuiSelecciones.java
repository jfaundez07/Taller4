package Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiSelecciones extends JFrame implements ActionListener {
    private JPanel seleccionesPanel;
    private JLabel selectPaísLabel;
    private JComboBox selectPaísComboBox;
    private JLabel rankingLabel;
    private JLabel cuatroLabel;
    private JButton jugadoresButton;
    private JButton exitButton;
    private JLabel banderaLabel;

    public GuiSelecciones(){
        setUpGui();
    }

    private void setUpGui(){
        setTitle("Equipos");
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(500,400);
        setContentPane(seleccionesPanel);
        jugadoresButton.addActionListener(this);
        exitButton.addActionListener(this);
        selectPaísComboBox.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if (event.getSource().equals(exitButton)) {
            dispose();
            System.exit(0);
        }

        if (event.getSource().equals(selectPaísComboBox)) {
            switch (selectPaísComboBox.getSelectedIndex()) {
                case 1: //Chile
                    banderaLabel.setIcon(new ImageIcon("src/main/java/Data/datos/chi.png"));
                    break;
                case 2: //Australia
                    banderaLabel.setIcon(new ImageIcon("src/main/java/Data/datos/aus.png"));
                    break;
                case 3: //Camerun
                    banderaLabel.setIcon(new ImageIcon("src/main/java/Data/datos/cmr.png"));
                    break;
                case 4://Alemania
                    banderaLabel.setIcon(new ImageIcon("src/main/java/Data/datos/ger.png"));
                    break;

            }
        }

        if (event.getSource().equals(jugadoresButton)) {
            switch (selectPaísComboBox.getSelectedIndex()) {
                case 0: //Chile
                    GuiJugadores guiChile = new GuiJugadores("src/main/java/Data/datos/chi.txt");
                    guiChile.setVisible(true);
                    this.setVisible(false);
                    break;
                case 1: //Australia
                    GuiJugadores guiAustralia = new GuiJugadores("src/main/java/Data/datos/aus.txt");
                    guiAustralia.setVisible(true);
                    this.setVisible(false);
                    break;
                case 2: //Camerun
                    GuiJugadores guiCamerun = new GuiJugadores("src/main/java/Data/datos/cmr.txt");
                    this.setVisible(true);
                    guiCamerun.setVisible(false);
                    break;
                case 3://Alemania
                    GuiJugadores guiAlemania = new GuiJugadores("src/main/java/Data/datos/ger.txt");
                    guiAlemania.setVisible(true);
                    this.setVisible(false);
                    break;
            }

        }
    }

}