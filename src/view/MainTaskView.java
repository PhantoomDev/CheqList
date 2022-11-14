package view;

import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.*;

public class MainTaskView extends JPanel{

    private JToggleButton doneButton = new JToggleButton();
    private JToggleButton importanceButton = new JToggleButton();
    private JTextField taskTextField = new JTextField();
    private JTextField dueYear = new JTextField();
    private JTextField dueMonth = new JTextField();
    private JTextField dueDate = new JTextField();

    public MainTaskView() {
        this.add(doneButton);
        this.add(importanceButton);
        this.add(taskTextField);
        this.add(dueYear);
        this.add(dueMonth);
        this.add(dueDate);
    }

    public boolean getIsdone() {
        return doneButton.isSelected();
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
        Date dueDate = new Date();
        try {
            dueDate = new SimpleDateFormat("yyyy-mm-dd").parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Exception occurred"+e);
        }
        return dueDate;
    }


    public void addDoneListener(ActionListener listenForDoneButton) {
        this.doneButton.addActionListener(listenForDoneButton);
        boolean isSelected = this.doneButton.getModel().isSelected();
    }

    void addImportanceListener(ActionListener listenForImportanceButton) {
        importanceButton.addActionListener(listenForImportanceButton);
    }

}
