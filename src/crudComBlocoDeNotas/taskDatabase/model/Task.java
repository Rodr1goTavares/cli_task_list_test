package crudComBlocoDeNotas.taskDatabase.model;

import java.util.Random;

public class Task {
    private int taskId;
    private String taskName;
    private String taskDescription;
    private boolean taskCompletedStatus;

    public Task(){
        this.taskId = generateTaskId();
        this.taskName = "Unnamed";
        this.taskDescription = "No description";
        this.taskCompletedStatus = false;
    }

    private static int generateTaskId(){
        Random generateId = new Random();
        return generateId.nextInt(1000);
    }

    //Setters
    public void setTaskName(String taskName){
        this.taskName = taskName;
    }

    public void setTaskDescription(String taskDescription){
        this.taskDescription = taskDescription;
    }

    public void setTaskCompletedStatus(boolean taskCompletedStatus){
        this.taskCompletedStatus = taskCompletedStatus;
    }


    //Getters
    public int getTaskId(){
        return this.taskId;
    }
    public String getTaskName(){
        return this.taskName;
    }

    public String getTaskDescription(){
        return this.taskDescription;
    }

    public boolean getTaskCompletedStatus(){
        return this.taskCompletedStatus;
    }

    public void showTask(){
        System.out.println("Task Name: " + this.taskName);
        System.out.println("Task description: " + this.taskDescription);
        System.out.println("Completed: " + this.taskCompletedStatus);
        System.out.println("-----");
    }
}
