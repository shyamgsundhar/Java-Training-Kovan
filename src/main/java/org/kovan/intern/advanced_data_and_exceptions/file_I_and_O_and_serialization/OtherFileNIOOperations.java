package org.kovan.intern.advanced_data_and_exceptions.file_I_and_O_and_serialization;

import java.io.IOException;
import java.nio.file.*;

public class OtherFileNIOOperations {
    public static void main(String[] args) {
        try{
            Path path = Paths.get("hello.txt");
            if(Files.exists(path)){
                System.out.println("Yes");
            }else {
                Files.createDirectory(Path.of("C:/Users/shyam/Java-Training/src/main/java/org/kovan/intern/advanced_data_and_exceptions/file_I_and_O_and_serialization/dummy"));
                Path newPath = Paths.get("C:/Users/shyam/Java-Training/src/main/java/org/kovan/intern/advanced_data_and_exceptions/file_I_and_O_and_serialization/dummy").resolve("res.txt");
                Files.createFile(newPath);
                String content = "WWW";
                Files.write(newPath,content.getBytes());
                System.out.println("Content Written");
                String moreContent = "This is appended text\n";
                Files.write(newPath,moreContent.getBytes(), StandardOpenOption.APPEND);
                long size=Files.size(newPath);
                System.out.println("the Size is "+size);

                System.out.println("Nope!! but Created");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
