package view;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.chart.BubbleChart;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

/**
 * view that displays main task objects
 */
public class MainTaskView extends SubScene{

   

    public MainTaskView(Parent arg0, double arg1, double arg2) {
        super(arg0, arg1, arg2);
        //TODO Auto-generated constructor stub
    }

    // initialize main task related view e.g buttons, text fields
    // TODO: change to JavaFX equivalent
    private Button doneButton = new Button();
    private Button importanceButton = new Button();
    private Text taskTextField = new Text();
    private Text dueYear = new Text();
    private Text dueMonth = new Text();
    private Text dueDate = new Text();

    public String getTaskString() {
        return taskTextField.getText();
    }

    public Date getDuDate() {
        // TODO exception for not putting date value
        String dateStr = dueYear.getText()+"-"+dueMonth.getText()+"-"+ dueDate.getText();
        Date dueDate = new Date();
        try {
            dueDate = new SimpleDateFormat("yyyy-mm-dd").parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Exception occurred"+e);
        }
        return dueDate;
    }

}
