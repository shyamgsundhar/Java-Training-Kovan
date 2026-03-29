package org.kovan.intern.advanced_data_and_exceptions.file_I_and_O_and_serialization;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSerialization {
    public static void main(String[] args) {
        Path filepath = Paths.get("hello.dat");
        String content ="Work.....";
        try{
            if(Files.notExists(filepath)){
                Files.createFile(filepath);
            }
            ObjectOutputStream outputStream = new ObjectOutputStream(Files.newOutputStream(filepath));
            outputStream.writeObject(content);
            outputStream.close();
            System.out.println("Completed the Serialization");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
