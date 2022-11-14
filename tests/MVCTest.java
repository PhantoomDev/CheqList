package tests;

import controller.MainTaskController;
import model.MainTask;
import view.MainTaskView;

/**
 * Test control modules individually, edit and comment stuff here if 
 * needed.
 * TODO test MainTask class
 */
public class MVCTest {
    public static void main(String[] args) {
        MainTaskView theView = new MainTaskView();
        MainTask themodel = new MainTask();
        MainTaskController theController = new MainTaskController(theView, themodel);

        theView.setVisible(true);
    }
}
