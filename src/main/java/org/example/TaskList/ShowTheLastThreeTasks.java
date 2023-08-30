package org.example.TaskList;

import org.example.ToDoListTasks.ToDoListWork;

public class ShowTheLastThreeTasks {
    public static void showTheLastThreeTasksInList(){
        int size = ToDoListWork.taskLinkedList.size();
        if (size >= 3) {
            System.out.println(ToDoListWork.taskLinkedList.get(size - 3));
            System.out.println(ToDoListWork.taskLinkedList.get(size - 2));
            System.out.println(ToDoListWork.taskLinkedList.get(size - 1));
        } else {
            System.out.println("Коллекция содержит менее трех элементов.");
        }
    }
}
