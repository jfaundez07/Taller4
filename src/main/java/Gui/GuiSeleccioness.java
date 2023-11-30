package Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiSeleccioness extends JFrame implements ActionListener {
    private JPanel seleccionesPanel;
    private JLabel selectPaísLabel;
    private JComboBox selectPaísComboBox;
    private JLabel bandearLabel;
    private JLabel rankingLabel;
    private JLabel cuatroLabel;
    private JButton jugadoresButton;
    private JButton exitButton;

    private void setUpGui(){
        setTitle("Equipos");
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(800,600);
        setContentPane(seleccionesPanel);
        jugadoresButton.addActionListener(this);
        exitButton.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}