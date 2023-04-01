package crudComBlocoDeNotas.Menu;

import crudComBlocoDeNotas.TaskListApp;
import crudComBlocoDeNotas.taskDatabase.taskManagement.crud.ReadTask;

public class MenuViewTasks {
    public static void viewTasks(){
        System.out.println("--------------------<< Task List >>--------------------");
        ReadTask.read();
        System.out.println("--------------------------<<>>-------------------------");

        TaskListApp.start();
    }
}
