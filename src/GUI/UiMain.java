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

    private boolean checkAlways = false;
    private String adviserTime = "20:50";
    private String closingTime = "21:00";
    private SubmitButton submitButton = new SubmitButton("submit");
    private MessageDisplay messageLabel;

    private final String textFile = "C:\\Users\\josed\\Documents\\DESARROLLO\\JAVA\\FutureSaver\\saverSetUpt.txt";

    private File myFile;

    private Scanner myReader;

    public UiMain() {

        try {
            sleep(10000);
            myFile = new File(textFile);
            myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                try {
                    adviserTime = myReader.nextLine();
                    closingTime = myReader.nextLine();
                } catch (Exception e) {
                    System.out.println("default");

                }
                String checkAlwaysString;
                try {
                    checkAlwaysString = myReader.nextLine();
                } catch (Exception e) {
                    checkAlwaysString = "false";
                }
                checkAlways = checkAlwaysString.length() > 0 && Boolean.parseBoolean(checkAlwaysString);
                System.out.println("Adviser Time: " + adviserTime);
                System.out.println("Closing Time: " + closingTime);
                System.out.println("check Always: " + checkAlways);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File failed");
            this.timer();
            adviserTime = "20:50";
            closingTime = "21:00";
        } catch (InterruptedException e) {
            System.out.println("Failed sleep");
        }
        this.timer();
    }

    public void timer() {
        myReader.close();
        boolean isRunning = true;
        boolean isAdvised = true;
        while (isRunning) {
            try {
                sleep(1000);

                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
                LocalDateTime now = LocalDateTime.now();

                String currentTime = dtf.format(now);
                System.out.println(currentTime);
                if (currentTime.equals(this.adviserTime) && isAdvised) {
                    this.advise();
                    isAdvised = false;
                }

                if (currentTime.equals(this.closingTime)) {
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
