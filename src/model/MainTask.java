package model;

import java.util.ArrayList;

public class MainTask extends Task {

    private ArrayList<Task> subTasks;
    private int numOfTask;
    private int tasksDone;

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

    public void updateTasksDone() {
        int ctr = 0;
        for (Task task : subTasks) {
            if(task.getIsDone()) {
                ctr++;
            }
        }
        this.tasksDone = ctr;
    }
    
    public void updateIsDone() {
        if(numOfTask <= 0) {

        }
        else {
            if(tasksDone < numOfTask) {
                this.setIsDone(true);
            }
            else {
                this.setIsDone(false);
            }
        }
    }
    @Override
    public void setIsDone(boolean isDone) {
        for (Task task : subTasks) {
            task.setIsDone(isDone);
        }
        updateTasksDone();
        updateIsDone();
    }
    
}
