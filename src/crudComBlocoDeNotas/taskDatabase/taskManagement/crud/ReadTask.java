package crudComBlocoDeNotas.taskDatabase.taskManagement.crud;

import crudComBlocoDeNotas.taskDatabase.folders.TaskFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTask {
    public static void read(){
        try{
            File taskFile = TaskFile.getTaskFile();
            FileReader reader = new FileReader(taskFile);

            BufferedReader taskReader = new BufferedReader(reader);

            String line;

            while((line = taskReader.readLine()) != null){
                System.out.println(line);
            }

            reader.close();
            taskReader.close();
        }
        catch(IOException error){
            System.out.println("Error to view tasks: " + error);
        }
    }
}
