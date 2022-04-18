package GUI.components;

import GUI.assets.ColorPallette;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame{

    private Color backgroundColor;

    public Frame() {
        this.setSize(500, 500);
        this.setTitle("Time Controller - Future Saver");
        this.getContentPane().setBackground(new Color(ColorPallette.DARK_BLUE.color));
    }


}
