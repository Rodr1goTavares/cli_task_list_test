package crudComBlocoDeNotas.taskDatabase.folders;

import java.io.File;
import java.io.IOException;

public class TaskFile {
    public static File getTaskFile(){
        File taskFolder = TaskFolder.getTaskFolder();

        File taskFile = new File(taskFolder + "/tasklist.txt");
        if(!taskFile.exists()){
            try{
                taskFile.createNewFile();
            }
            catch(IOException error){
                System.out.println("Error to create file " + error);
            }
        }

        return taskFile;
    }
}
