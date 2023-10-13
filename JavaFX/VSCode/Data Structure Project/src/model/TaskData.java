package model;

public class TaskData {
    
    String Task, Admin;

    public void tataskData(String task, String admin){
        this.Task = task;
        this.Admin = admin;
    }

    public String getTask(){
        return Task;
    }

    public String getAdmin(){
        return Admin;
    }

}
