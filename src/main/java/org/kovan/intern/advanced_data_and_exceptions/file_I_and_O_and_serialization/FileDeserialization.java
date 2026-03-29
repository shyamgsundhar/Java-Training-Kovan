package org.kovan.intern.advanced_data_and_exceptions.file_I_and_O_and_serialization;

import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDeserialization {
    public static void main(String[] args) {
        Path filePath = Paths.get("hello.dat");
        try{
            if(Files.notExists(filePath)){
                System.out.println("Nope");
                return;
            }
            ObjectInputStream inputStream = new ObjectInputStream(Files.newInputStream(filePath));
            String data = (String) inputStream.readObject();
            System.out.println(data);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
