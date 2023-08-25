package javaders.day36excaptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {
    public static void main(String[] args) {
//2.WAY
        try {
            FileInputStream fis = new FileInputStream("C:\\Batch151\\Batch151\\src\\javaders\\day36excaptions\\TextFile");

            int i=0;
            while ((i=fis.read())!=-1){
                System.out.print((char)i);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Path is wrong or the file does not exist");
        } catch (IOException e) {
            System.out.println("Some characters could not be read");
        }
    }
}