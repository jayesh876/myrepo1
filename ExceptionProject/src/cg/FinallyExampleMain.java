package cg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FinallyExampleMain {

    public static void main(String[] args) {
        InputStream in = null;
        try {
            System.out.println("About to open a file");
            in = new FileInputStream("missingfile.txt");  // refer missingfile.txt for reading purpose
            // file is considered as resource
            System.out.println("File open");
            int data=in.read();
            while(data!=-1 ) {
            	char ch=(char)data;
            	System.out.print(ch);
            	data=in.read();
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Error reading file");
        } finally {
            try {
            	System.out.println("file is closed finally");
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                System.out.println("Failed to close file");
            }
        }
    }
}