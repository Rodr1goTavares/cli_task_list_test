package crudComBlocoDeNotas.Menu;

import crudComBlocoDeNotas.TaskListApp;
import crudComBlocoDeNotas.taskDatabase.model.Task;
import crudComBlocoDeNotas.taskDatabase.taskManagement.crud.AddTask;

import java.util.Scanner;

public class MenuCreateTask {
    public static void create(){
        try{
            Task newTask = new Task();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Select a task name:");
            newTask.setTaskName(scanner.nextLine());

            System.out.println("Select a task description:");
            newTask.setTaskDescription(scanner.nextLine());

            System.out.println("Do you confirm to create a task ? (Y) to confirm (N) to cancel");
            String confirmation = scanner.nextLine();

            if(confirmation.equals("Y") || confirmation.equals("y")){
                System.out.println("Saving task...");
                AddTask.add(newTask);

                TaskListApp.start();
            }
            else{
                System.out.println("Select a valid option");
            }
        }
        catch(Exception error){
            System.out.println("A error has occurred" + error);
        }

    }
}
