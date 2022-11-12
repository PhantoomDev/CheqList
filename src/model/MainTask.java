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

    
    public void updateMainIsDone() {

    }

    @Override
    public void setIsDone(boolean isDone) {
        for(int i = 0; i < this.subTasks.size(); i++) {
            this.subTasks.get(i).setIsDone(true);
        }
        updateMainIsDone();
    }
    @Override
    public boolean getIsDone() {
        if (numOfTask == 0) {
            return this.getIsDone();
        }
        else { // todo getIdDone logic when number of task != 0
            return false;
        }
    }
    
}
