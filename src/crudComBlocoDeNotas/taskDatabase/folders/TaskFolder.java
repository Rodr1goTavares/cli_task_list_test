package crudComBlocoDeNotas.taskDatabase.folders;

import java.io.File;

public class TaskFolder {
    private static File taskFolder = new File("C:/users/rorik/desktop/taskFolder");

    public static File getTaskFolder(){
        if(!verifyTaskFolder()){
            return null;
        }
        return taskFolder;
    }

    private static boolean verifyTaskFolder(){
        try{
            if(!taskFolder.exists()){
                System.out.println("Creating task folder...");
                if(taskFolder.mkdir()){
                    System.out.println("Directory task folder successfully created " + taskFolder.getAbsolutePath());
                }
                else {
                    System.out.println("Error to create a task directory");
                }
            }

            System.out.println("Saving to " + taskFolder.getAbsolutePath());
            return true;
        }
        catch (Exception error){
            System.out.println("Error to verify task folder");
            return false;
        }
    }

}
