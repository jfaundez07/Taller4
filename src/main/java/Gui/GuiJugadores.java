package Gui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Data.LecturaDatos;
public class GuiJugadores extends JFrame implements ActionListener {
    private JPanel jugadoresPanel;
    private JLabel infoLabel;
    private JButton guardarCambiosButton;
    private JButton volverButton;
    private JTextArea jugadoresTextArea;
    private String path;
    private ArrayList<String[]> jugadores;

    public GuiJugadores(String path){
        this.path = path;
        setUpGui();
    }

    private void setUpGui(){
        setTitle("Equipos");
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(800,600);
        setContentPane(jugadoresPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        guardarCambiosButton.addActionListener(this);
        volverButton.addActionListener(this);
        setearTabla();
    }

    private void setearTabla(){
        LecturaDatos lector = new LecturaDatos();
        this.jugadores = lector.lecturaTxt(path);
        String datos = "Nombre \t\t Numero \t Posicion \n";
        for (String[] jugador : jugadores){
            datos += jugador[1] + "\t\t" + jugador[0] + "\t" + jugador[2] + "\n";
        }
        jugadoresTextArea.setText(datos);


    }


    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource().equals(volverButton)) {
            GuiSelecciones guiSeleccioness = new GuiSelecciones();
            setVisible(false);
        }
    }
}