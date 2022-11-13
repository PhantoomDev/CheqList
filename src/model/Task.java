package model;

import java.util.*;

/**
 * base class to extend to SubTask and MainTask 
 */
public class Task {
    
    private String taskName;
    private boolean isDone;
    private Date dueDate;
    private boolean isImportant;

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }
    public boolean getIsDone() {
        return this.isDone;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    public Date getDueDate() {
        return this.dueDate;
    }

    public void setIsImportant(boolean importance) {
        this.isImportant = importance;
    }
    public boolean getImportance() {
        return this.isImportant;
    }
}
