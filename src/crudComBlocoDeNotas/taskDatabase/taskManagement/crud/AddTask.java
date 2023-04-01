package crudComBlocoDeNotas.taskDatabase.taskManagement.crud;

import crudComBlocoDeNotas.taskDatabase.model.Task;
import crudComBlocoDeNotas.taskDatabase.taskManagement.SaveTaskList;
import crudComBlocoDeNotas.taskDatabase.taskManagement.TaskList;

import java.util.List;

public class AddTask {
    public static void add(Task createdTask){
        try{
            List<Task> taskLis = TaskList.getList();
            taskLis.add(createdTask);
            SaveTaskList.save();
        }
        catch(Exception error){
            System.out.println("Error to add task " + error);
        }
    }
}
