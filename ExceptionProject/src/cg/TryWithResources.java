package cg;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResources {
    public static void main(String[] args) {
               System.out.println("About to open a file");
        try (InputStream in = new FileInputStream("missingfile.txt");) {
            System.out.println("File open");
            int data=in.read();
            while(data!=-1 ) {
            	char ch=(char)data;
            	System.out.print(ch);
            	data=in.read();
            }
            System.out.println();
            //FileInputStream will call close() method automatically before it leaves try
            // because it implements AutoClosable interface
        }catch (FileNotFoundException e) {
            System.out.println(e.getClass().getName());
            System.out.println("Quiting");
        } 
        catch (IOException e) {
            System.out.println(e.getClass().getName());
            System.out.println("Quiting");
        }
        finally {
        	System.out.println("Finally");
        }
    }
    
}
