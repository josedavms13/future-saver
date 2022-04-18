package GUI.components;

import GUI.assets.ColorPallette;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {
    public Label(String initialText) {
        this.setText(initialText);
        this.setFontColor(ColorPallette.GREEN);
    }

    public Label(String initialText, ColorPallette color) {
        this.setText(initialText);
        this.setFontColor(color);
    }


    public void setFontColor(ColorPallette color) {
        int hexColor = color.color;
        this.setForeground(new Color(hexColor));
    }

    public void setLabelText(String text) {
        this.setText(text);
    }


}
