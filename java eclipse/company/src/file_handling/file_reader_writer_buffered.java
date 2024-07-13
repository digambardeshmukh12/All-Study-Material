package file_handling;
import java.io.*;
public class file_reader_writer_buffered {
	
	public static void main(String[] args) throws Exception {
		
	
	FileReader fin = new FileReader("d:\\jammy.txt");
    FileWriter fout = new FileWriter("d:\\jammy2.txt");


    BufferedReader bin = new BufferedReader(fin );
    BufferedWriter bout = new BufferedWriter(fout) ;



    int i , c=0;
    while((i=fin.read())!=-1){
        
        bout.write((char)i);
        c++;
        System.out.print((char) i);
    }
    System.out.println(" data is successfully copied and Number of characters copied are  "+ c);

    bout.close();
    bin.close();
    fout.close();
    fin.close();


	}
	
	
	
	}
