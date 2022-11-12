package model;

import java.util.*;
public class Task {
    
    private String name;
    private boolean isDone;
    private Date dueDate;
    private boolean isImportant;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
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

    public void setImportance(boolean importance) {
        this.isImportant = importance;
    }
    public boolean getImportance() {
        return this.isImportant;
    }
}
