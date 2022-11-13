package controller;

import model.MainTask;
import view.MainTaskView;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainTaskController {
    
    private MainTaskView theView;
    private MainTask theModel;

    public MainTaskController(MainTaskView theView, MainTask theModel) {
        
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addDoneListener(new DoneListener());
    }

    class DoneListener implements ActionListener {

        public void actionPerformed(ActionEvent arg0) {

            // TODO get task status from some saved file
            boolean isDone = theView.getIsdone();
            theModel.setIsDone(isDone);
        }

    }
}
