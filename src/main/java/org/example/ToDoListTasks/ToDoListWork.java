package org.example.ToDoListTasks;

import org.example.ToDoListTasks.Tasks;

import java.util.LinkedList;

public class ToDoListWork {
    public static LinkedList<Tasks> taskLinkedList = new LinkedList<>();
    public static void setList(){
        Tasks task1 = new Tasks(1, "проснулись");
        Tasks task2 = new Tasks(2, "потянулись");
        Tasks task3 = new Tasks(3, "улыбнулись");
        taskLinkedList.add(task1);
        taskLinkedList.add(task2);
        taskLinkedList.add(task3);
    }
}
