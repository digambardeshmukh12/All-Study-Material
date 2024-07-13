package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class java_111_file_handling {
    public static void main(String[] args) {

//        Creating a file
        /*

        File myfile = new File("raj.txt");
        try {
            myfile.createNewFile();
            System.out.println("created file");
        }
        catch (Exception e ){

            System.out.println(" some exception occurs ");
        }



//        code  to write to a file

        try {
            FileWriter fileWriter = new FileWriter("raj.txt");
            fileWriter.write("this is our first file in java cource \n ok now by  ");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

// for reading a file

        File myfile = new File("raj.txt ");
        try {
            Scanner sc =new Scanner(myfile);

            while (sc.hasNextLine()){

                String s = sc.nextLine();
                System.out.println(s);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


// for deleting a file

        File myfile = new File("raj1.txt");
        if (myfile.delete()){
            System.out.println(" file deleted ");
        }
        else {
            System.out.println(" some error occurs ");
        }


         */
        

    }
}
