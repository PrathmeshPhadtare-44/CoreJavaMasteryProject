package com.prathmesh.corejavamastery.filehandling;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Question 1 (Average)
Student Notes Writer
Input
User enters:
Java
Spring Boot
MySQL
Git
Type exit to stop.
Task
Store all entered lines into a file named:
notes.txt
Each note should be on a new line.
Output File
Java
Spring Boot
MySQL
Git
* */
public class StudentNoteWriter {
    public static void readFromFile(String path){
        System.out.println("\nNotes Stored In File:");
       try (BufferedReader bufferedReader =  new BufferedReader(new FileReader(path));
       ){
           String line;
           while ((line = bufferedReader.readLine()) != null){
               System.out.println(line);
           }
       }
       catch (IOException e){
           System.out.println(e.getMessage());
       }

    }
public static void writeIntoFile(String data, String path)  {

    try(BufferedWriter br = new BufferedWriter(new FileWriter(path,true)) )
    {
    br.write(data);
        br.newLine();

    }
    catch (IOException e ){
        System.out.println(e.getMessage());
    }
}
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String userInput="";
        String path = "notes.txt";
        File file = new File(path);
        if (!file.exists()){
            file.createNewFile();
        }
        while (true){
            System.out.println("Enter Note:");
            userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("exit")){break;}
                writeIntoFile(userInput ,  path);
        }
        readFromFile(path);
scanner.close();
    }
}
