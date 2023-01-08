package tests;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import controller.MainTaskController;
import model.MainTask;
import view.MainTaskView;

/**
 * Test control modules individually, edit and comment stuff here if 
 * needed.
 */
public class MVCTest extends Application {
    public static void main(String[] args) {
        launch(args);
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        Group root = new Group();
        Scene scene = new Scene(root);

        Group root1 = new Group();
        SubScene subScene1 = new SubScene(root1, 500, 500);
        subScene1.setFill(Color.LIGHTBLUE);
        ((Group) scene.getRoot()).getChildren().add(subScene1);
        
        Group root2 = new Group();
        SubScene subScene2 = new SubScene(root2, 500, 500);
        subScene2.setFill(Color.RED);
        ((Group) scene.getRoot()).getChildren().add(subScene2);
        

        // Image icon = new Image("filepath");
        // stage.getIcons().add(icon);
        
        stage.setTitle("Test MVC");
        
        stage.setScene(scene);
        stage.show();
    }
}
