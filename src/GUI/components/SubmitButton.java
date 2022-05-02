package GUI.components;

import javax.swing.*;

public class SubmitButton{

    private final JButton button;
    public SubmitButton(String text) {
        this.button = new JButton(text);
    }

    public JButton getButton() {
        return this.button;
    }
}
