package org.example.TaskList;


import org.example.TaskList.*;

import java.util.Scanner;

public class CommandProcessing {
    public static void commandScanner() {
        String choice;
        do {
            System.out.println("введите команду. для списка возможных команд введите команду help");
            Scanner scanner = new Scanner(System.in);
            choice = "";
            choice = scanner.nextLine();
            switch (choice) {
                case ("help"):
                    Help.helpExecute();
                    break;
                case ("show the last three tasks"):
                    ShowTheLastThreeTasks.showTheLastThreeTasksInList();
                    break;
                case ("info"):
                    Info.sizeOfCollection();
                    break;
                case ("show"):
                    Show.showTheList();
                    break;
                case ("add"):
                    Add.addTaskInList();
                    break;
                case ("clear"):
                    Clear.deleteAllTasks();
                    break;

            }
        } while (!choice.equals("exit"));
        System.out.println("До свидания");
    }
}
