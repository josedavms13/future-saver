package GUI.Pages;

import GUI.GuiBase;
import GUI.assets.ColorPallette;
import GUI.components.Label;

import javax.swing.*;

public class MessageDisplay extends GuiBase {

    private Label messageLabel;
    private JButton submitButton;


    public MessageDisplay() {
        super();
        this.messageLabel = new Label("10 minutes left", ColorPallette.RED);
        this.fillFrame();
    }

    protected void fillFrame() {

        this.add(this.messageLabel);

        this.setSize(400, 300);
        setWindowVisible(true);

    }
}
