package GUI;

import javax.swing.*;
import GUI.Pages.FirstPage;
import GUI.Pages.MessageDisplay;
import GUI.assets.ColorPallette;
import GUI.components.SubmitButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.lang.Thread.sleep;


public class UiMain extends JFrame implements ActionListener {

    private final String adviserTime = "20:50";
    private final String closingTime = "21:00";
    private SubmitButton submitButton = new SubmitButton("submit");
    private MessageDisplay messageLabel;

    public UiMain() {
        try {
            File myFile = new File("saverSetUp.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        this.timer();
    }

    public void timer() {
        boolean isRunning = true;
        boolean isAdvised = true;
        while (isRunning) {
            try {
                sleep(1000);

                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
                LocalDateTime now = LocalDateTime.now();

                String currentTime = dtf.format(now);
                System.out.println(currentTime);
                if(currentTime.equals(this.adviserTime) && isAdvised) {
                    this.advise();
                    isAdvised = false;
                }

                if(currentTime.equals(this.closingTime)) {
                    Runtime.getRuntime().exec("shutdown /s");
                }

            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void advise() {
        this.messageLabel = new MessageDisplay();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
