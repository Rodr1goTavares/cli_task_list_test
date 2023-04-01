package crudComBlocoDeNotas;

import crudComBlocoDeNotas.Menu.MenuCreateTask;
import crudComBlocoDeNotas.Menu.MenuViewTasks;

import java.util.Scanner;

public class TaskListApp {
    public static void start(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("<<< Welcome to Task List app >>>");
        System.out.println("(1) View Tasks");
        System.out.println("(2) Create a new Task");

        try{
            int userChose = scanner.nextInt();
            if(userChose == 1){
                MenuViewTasks.viewTasks();
            }
            else if (userChose == 2){
                MenuCreateTask.create();
            }
            else {
                System.out.println("Select a valid option.");
            }
            scanner.close();
        }
        catch(Exception error){
            System.out.println("Select a valid option" + "Error: " + error);
        }
    }
}
