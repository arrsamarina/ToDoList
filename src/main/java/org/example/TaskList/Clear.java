package org.example.TaskList;

import org.example.ToDoListTasks.ToDoListWork;

public class Clear {
    public static void deleteAllTasks(){
        ToDoListWork.taskLinkedList.clear();
        System.out.println("все задания удалены. коллекция очищена");
    }
}
