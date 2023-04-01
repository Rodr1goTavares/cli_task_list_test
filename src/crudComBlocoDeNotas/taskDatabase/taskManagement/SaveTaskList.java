package crudComBlocoDeNotas.taskDatabase.taskManagement;

import crudComBlocoDeNotas.taskDatabase.folders.TaskFile;
import crudComBlocoDeNotas.taskDatabase.model.Task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveTaskList {
    public static void save(){
        List<Task> taskList = TaskList.getList();
        writeInTaskFile(taskList);
    }

    private static void writeInTaskFile(List<Task> taskList){
        File taskFile = TaskFile.getTaskFile();
        for (Task task : taskList) {
            try {
                FileWriter taskWriter = new FileWriter(taskFile, true);
                taskWriter.write("Task id: " + task.getTaskId() + "\r\n");
                taskWriter.write("Task name: " + task.getTaskName() + "\r\n");
                taskWriter.write("Task description: " + task.getTaskDescription() + "\r\n");
                taskWriter.write("Completed: " + task.getTaskCompletedStatus() + "\r\n");
                taskWriter.write("----------------------" + "\r\n");
                taskWriter.close();

                System.out.println("Task added successfully !!");
            } catch (IOException error) {
                System.out.println("Error to add task in file" + error);
            }
        }
    }
}
