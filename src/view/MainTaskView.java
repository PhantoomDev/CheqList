package view;

import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.*;

public class MainTaskView extends JPanel{

    private JToggleButton checkButton = new JToggleButton();
    private JToggleButton importanceButton = new JToggleButton();
    private JTextField taskTextField = new JTextField();
    private JTextField dueYear = new JTextField();
    private JTextField dueMonth = new JTextField();
    private JTextField dueDate = new JTextField();

    MainTaskView() {
        this.add(checkButton);
        this.add(importanceButton);
        this.add(taskTextField);
        this.add(dueYear);
        this.add(dueMonth);
        this.add(dueDate);
    }

    public boolean getIsdone() {
        return checkButton.isSelected();
    }

    public boolean getImportance() {
        return importanceButton.isSelected();
    }

    public String getTaskString() {
        return taskTextField.getText();
    }

    public Date getDuDate() {
        // TODO exception for not putting date value
        String dateStr = dueYear.getText()+"-"+dueMonth.getText()+"-"+ dueDate.getText();
        Date d = new Date();
        try {
            d = new SimpleDateFormat("yyyy-mm-dd").parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Exxception occured"+e);
        }
        // DateFormat.getDateInstance().parse();
        return d;
    }

}
