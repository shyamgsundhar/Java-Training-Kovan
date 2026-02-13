package org.kovan.intern.advanced_data_and_exceptions.file_I_and_O_and_serialization;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

public class FileRead {
    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\Users\\shyam\\Java-Training\\src\\main\\java\\org\\kovan\\intern\\advanced_data_and_exceptions\\file_I_and_O_and_serialization\\exa.txt");
        try{
            List<?> lines = Files.readAllLines(filePath);
            for(Object obj : lines){
                System.out.println(obj);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
