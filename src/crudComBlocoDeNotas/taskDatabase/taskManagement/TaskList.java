package crudComBlocoDeNotas.taskDatabase.taskManagement;

import crudComBlocoDeNotas.taskDatabase.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private static List<Task> taskList = new ArrayList<>();
    public static List<Task> getList(){
        return taskList;
    }

    public static void showListItems(){
        for (Task task : taskList) {
            task.showTask();
        }
    }
}
