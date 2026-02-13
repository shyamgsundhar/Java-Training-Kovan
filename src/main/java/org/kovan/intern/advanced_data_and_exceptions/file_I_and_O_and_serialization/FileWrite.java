package org.kovan.intern.advanced_data_and_exceptions.file_I_and_O_and_serialization;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class FileWrite {
    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\Users\\shyam\\Java-Training\\src\\main\\java\\org\\kovan\\intern\\advanced_data_and_exceptions\\file_I_and_O_and_serialization\\exa.txt");
        try{
            List<String> lines = new ArrayList<>();
            lines.add("Hello");
            lines.add("To");
            lines.add("Kovan");
            Files.write(filePath,lines);
            System.out.println("Completed");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
