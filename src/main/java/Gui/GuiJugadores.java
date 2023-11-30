package Gui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiJugadores extends JFrame implements ActionListener {
    private JPanel jugadoresPanel;
    private JLabel infoLabel;
    private JButton guardarCambiosButton;
    private JButton editarButton;
    private JButton volverButton;
    private JTextArea jugadoresTextArea;
    private String path;

    public GuiJugadores(String path){
        this.path = path;
        setUpGui();
    }

    private void setUpGui(){
        setTitle("Equipos");
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(500,400);
        setContentPane(jugadoresPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        editarButton.addActionListener(this);
        guardarCambiosButton.addActionListener(this);
        volverButton.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource().equals(volverButton)) {
            GuiSelecciones guiSeleccioness = new GuiSelecciones();
            setVisible(false);
        }
    }
}