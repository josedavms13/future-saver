package GUI;

import GUI.components.Frame;

import javax.swing.*;
import java.awt.*;

public abstract class GuiBase extends JFrame {




    public GuiBase() {
        this.setLayout(new GridLayout(5, 1, 10, 10));
        this.setLocationRelativeTo(null);
    }



        protected abstract void fillFrame();

        protected void setWindowVisible(boolean visible) {
            this.setVisible(visible);
        }


}
