package Gui;

import javax.swing.*;
import java.awt.*;

public class VentanaModelo {

    private final Font font = new Font("arial",2, 15);


    public JLabel crearEtiqueta(JLabel jLabel, String text) {
        jLabel = new JLabel(text, SwingConstants.CENTER);
        jLabel.setFont(font);
        jLabel.setOpaque(true);
        jLabel.setBackground(Color.white);
        return jLabel;
    }

    public JButton crearBoton(JButton button, String text) {
        button = new JButton(text);
        button.setHorizontalAlignment( SwingConstants.CENTER);
        button.setFont(font);
        return button;
    }

    public JTextField crearCajaTexto(JTextField jTextField) {
        jTextField = new JTextField();
        jTextField.setOpaque(true);
        jTextField.setBackground(Color.white);
        return jTextField;
    }

    public Font getFont() {
        return font;
    }
}
