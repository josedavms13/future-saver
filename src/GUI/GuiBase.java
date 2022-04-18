package GUI;

import GUI.components.Frame;

import javax.swing.*;
import java.awt.*;

public abstract class GuiBase {


    protected final JFrame frame;

    public GuiBase(JFrame frame) {
        this.frame = frame;
        this.frame.setLayout(new GridLayout(5, 1, 10, 10));
        this.frame.setLocationRelativeTo(null);
    }



        protected abstract void fillFrame();

        protected void setWindowVisible(boolean visible) {
            this.frame.setVisible(visible);
        }


}
