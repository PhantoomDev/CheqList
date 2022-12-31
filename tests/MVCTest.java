package tests;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import controller.MainTaskController;
import model.MainTask;
import view.MainTaskView;

/**
 * Test control modules individually, edit and comment stuff here if 
 * needed.
 * TODO test MainTask class
 */
public class MVCTest {

    @Override
    public static void main(String[] args) {
        Parent root = FXMLLoader.load(getClass().getResource("MainTaskView.fxml"));

    }
}
