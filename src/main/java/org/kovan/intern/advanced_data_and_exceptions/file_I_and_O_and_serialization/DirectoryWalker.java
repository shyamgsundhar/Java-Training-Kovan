package org.kovan.intern.advanced_data_and_exceptions.file_I_and_O_and_serialization;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryWalker {
    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\Users\\shyam\\Java-Training\\src\\main");
        try{
            Files.walk(filePath).filter(Files::isRegularFile).forEach(
                    (file)->{
                        try {
                            System.out.println("File: "+file+" "+"Store ---> "+Files.getFileStore(file)+" Size----> "+Files.size(file));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
