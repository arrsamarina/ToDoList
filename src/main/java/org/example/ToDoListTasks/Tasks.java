package org.example.ToDoListTasks;

public class Tasks {
    private int serialNumber;
    private String taskToDo;
    public Tasks(int serialNumber, String taskToDo){
        this.serialNumber = serialNumber;
        this.taskToDo = taskToDo;
    }
    public Tasks(){}

    @Override
    public String toString() {
        return "Tasks{" + "\n"+
                "serialNumber='" + serialNumber +"\n"+
                ", taskToDo=" + taskToDo + "\n"+
                '}'+"\n";
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public Tasks setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    public String getTaskToDo() {
        return taskToDo;
    }

    public Tasks setTaskToDo(String taskToDo) {
        this.taskToDo = taskToDo;
        return this;
    }



}
