package problems;

import java.io.*;

public class fileapp {
    public static void main(String[] args) {
		String filePath = "D:\\EDUCATIONAL\\all extra edj\\demo.txt";

        try {
            File inputFile = new File(filePath);
           

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            String currentLine;
            int startIndex =-1;
            while ((currentLine = reader.readLine()) != null) {
                 startIndex = currentLine.indexOf("del");
                 if(startIndex !=-1) {
                	 break;
                 }
                
            }
            System.out.println(startIndex);
            reader.close();

            
        } catch (IOException e) {
            System.out.println("An error occurred while processing the file.");
            e.printStackTrace();
        }
    }
}
