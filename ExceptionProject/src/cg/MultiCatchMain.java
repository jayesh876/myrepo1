package cg;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MultiCatchMain {

    public static void main(String[] args) {
        System.out.println("About to open a file");
        try (InputStream in = new FileInputStream("missingfile.txt");
                Scanner s = new Scanner(in);) {
            System.out.println("File open");
       //     while(s.hasNextInt()) {
            int data = s.nextInt();
            System.out.println(data);
         //   }
        } catch (InputMismatchException  |  IOException e) {
            System.out.println(e.getClass().getName());
            System.out.println("Quiting");
        } 
    }
}