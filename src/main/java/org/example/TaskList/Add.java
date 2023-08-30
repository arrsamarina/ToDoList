package org.example.TaskList;

import org.example.ToDoListTasks.Tasks;
import org.example.ToDoListTasks.ToDoListWork;

import java.util.Scanner;

public class Add {
    public static void addTaskInList(){
        System.out.println("хотите добавить задачу? напишите да или нет: ");
        Scanner scanner1 = new Scanner(System.in);
        String answer = scanner1.nextLine();
        if (answer.equals("да")){
            System.out.println("посмотрите, какие задачи уже есть и какие порядковые номера заняты, " +
                    "чтоб случайно не удалить нужное");
            Show.showTheList();
            System.out.println("введите порядковый номер задачи, которую хотите добавить: ");
            Scanner scanner2 = new Scanner(System.in);
            Integer number = scanner2.nextInt();
            System.out.println("введите саму задачу, которую вы хотите добавить");
            Scanner scanner3 = new Scanner(System.in);
            String task = scanner3.nextLine();
            Tasks tasks = new Tasks(number, task);
            ToDoListWork.taskLinkedList.add(tasks);
        }
    }
}
