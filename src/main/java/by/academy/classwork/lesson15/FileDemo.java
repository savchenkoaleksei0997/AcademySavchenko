package by.academy.classwork.lesson15;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {

    public static void main(String... args) throws IOException {
        int size = 0;
        File file = new File("src\\io\\fileWrite.txt");
        if (!file.exists()) ;
        {
            file.createNewFile();
        }
        try {
            FileReader fw = new FileReader(file);

            int i;
            while ((i = fw.read()) != -1) {
                System.out.println((char) i);
                size++;
            }
        } finally {

        }

    }
}
