package model;

import java.util.ArrayList;

/**
 * MainTask, contains SubTasks as ArrayList
 */
public class MainTask extends Task {

    private ArrayList<Task> subTasks;
    private int numOfTask;
    private int numOfTaskDone;

    public MainTask() {
        this.subTasks = new ArrayList<Task>();
        this.numOfTask = 0;
        this.numOfTaskDone = 0;
    }

    public void addSubTask(Task subTask) {
        this.subTasks.add(subTask);
    }
    public void removeSubTask(int index) {
        this.subTasks.remove(index);
    }

    public void updateNumOfTask() {
        this.numOfTask = this.subTasks.size();
    }
    public int getNumOfTask() {
        return this.numOfTask;
    }

    public void updateNumOfTaskDone() {
        int ctr = 0;
        for (Task task : subTasks) {
            if(task.getIsDone()) {
                ctr++;
            }
        }
        this.numOfTaskDone = ctr;
    }
    
    public void updateIsDone() {
        if(this.numOfTask <= 0) {

        }
        else {
            boolean isDone = (this.numOfTaskDone < this.numOfTask) ? true : false;
            this.setIsDone(isDone); 
        }
    }
    @Override
    public void setIsDone(boolean isDone) {
        System.out.println("Entered setIsDone()");
        if (subTasks.size() == 0) {
            this.isDone = isDone;
            System.out.println("Is done");
        }
        else {
            for (Task task : subTasks) {
                task.setIsDone(isDone);
            }
            updateNumOfTaskDone();
            updateIsDone();
        }
        
    }
    
}
