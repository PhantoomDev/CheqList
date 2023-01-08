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
public class MVCTest extends Application {
    // TODO: JavaFX runtime components are missing, and are required to run this application
    // ! right now
    public static void main(String[] args) {
        launch(args);
        
    

    }

    @Override
    public void start(Stage stage) throws Exception {
        
        

        stage.show();
    }
}
