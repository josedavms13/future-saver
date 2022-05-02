package GUI.Pages;

import GUI.GuiBase;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPage extends GuiBase {

    private final JTextField timeTextField = new JTextField();

    private final JLabel passwordLabel;

    private final JButton submitButton = new JButton("Submit");
    private JLabel timeLabel;

    public FirstPage(String passwordToShow) {
        super();
        passwordLabel = new JLabel(passwordToShow);
        this.fillFrame();
        setWindowVisible(true);
    }


    public void fillFrame() {
        JPanel timePanel = new JPanel();
        timePanel.setOpaque(false);
        timePanel.add(this.timeLabel);
        this.add(timePanel);

        JPanel timeInputPanel = new JPanel();
        timeInputPanel.setOpaque(false);
        timeInputPanel.add(this.timeTextField);
        this.add(timeInputPanel);

        JPanel passwordPanel = new JPanel();
        passwordPanel.setOpaque(false);
        passwordPanel.add(this.passwordLabel);
        this.add(passwordPanel);

//        JPanel passwordInputPanel = new JPanel();
//        passwordPanel.setOpaque(false);
//        passwordPanel.add(passwordInputPanel);



        this.pack();
    }

}
