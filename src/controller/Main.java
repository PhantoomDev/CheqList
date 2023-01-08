package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import controller.MainTaskController;
import model.MainTask;
import view.MainTaskView;


/**
 * Main Application
 * |-> List of MainTasks Scene (multiple lists)
 *   |-> MainTask Scene
 *     |-> SubTask Scene
 */
public class Main extends Application{

    public static void main(String[] args) {
        launch(args);
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        Group root = new Group();
        Scene scene = new Scene(root);
        
        // Image icon = new Image("filepath");
        // stage.getIcons().add(icon);
        
        stage.setTitle("Cheq List");
        
        stage.setScene(scene);
        stage.show();
    }
}