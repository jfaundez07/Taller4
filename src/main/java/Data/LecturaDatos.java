package Data;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LecturaDatos {

        public ArrayList<String[]> lecturaTxt(String ruta) {
            ArrayList<String[]> arrTemporal = new ArrayList<>();
            try {
                BufferedReader file = new BufferedReader(new FileReader(ruta));
                String linea;
                while ((linea = file.readLine()) != null) {
                    arrTemporal.add(linea.split(";"));
                }
            } catch (IOException e) {
                System.out.println("Error al abrir el archivo");//mensaje para el programador
            }

            return arrTemporal;
        }

        public ImageIcon leerBanderas(String ruta, int ancho, int alto) {
            ImageIcon icono = new ImageIcon(ruta);
            Image imagen = icono.getImage();
            Image newimg = imagen.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
            return new ImageIcon(newimg);
        }

}