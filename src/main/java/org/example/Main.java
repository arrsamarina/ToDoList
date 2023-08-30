package org.example;

import org.example.TaskList.CommandProcessing;
import org.example.ToDoListTasks.ToDoListWork;

/*Коллекция LinkedList
Создать список задач (todolist),
пользователь может добавлять новые задачи, удалять задачи, выводить список текущих задач,
выводить список последних 3 выполненных задач
*/
public class Main {
    public static void main(String[] args) {
        ToDoListWork.setList();
        CommandProcessing.commandScanner();
    }
}