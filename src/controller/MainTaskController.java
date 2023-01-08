package controller;

import model.MainTask;
import view.MainTaskView;
import java.awt.event.ActionListener;

import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
// TODO: check Main.java. this requires overhaul
public class MainTaskController {
    
    // ! this is a test frame for individual testing, remove later
    private Scene theScene;
    private MainTaskView theView;
    private MainTask theModel = new MainTask();

    public MainTaskController(MainTaskView theView, MainTask theModel) {
        
        // ! for testing
        this.theFrame = new JFrame(); 
        this.theFrame.setSize(500, 500);

        this.theView = theView;
        this.theModel = theModel;

        this.theView.addDoneListener(new DoneListener());

        // ! for testing
        this.theFrame.add(theView);
        this.theFrame.setVisible(true);
    }

    class DoneListener implements ActionListener {

        public void actionPerformed(ActionEvent arg0) {

            // TODO get task status from some saved file
            boolean isDone = theView.getIsdone();
            theModel.setIsDone(isDone);
        }

    }
}
