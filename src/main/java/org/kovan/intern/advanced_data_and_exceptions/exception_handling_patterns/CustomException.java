package org.kovan.intern.advanced_data_and_exceptions.exception_handling_patterns;

import java.io.FileReader;
import java.io.IOException;

class CustomDataException extends RuntimeException{
     CustomDataException(String message, Throwable cause){
        super(message,cause);
    }
}
class FileService{
    public static void readFile(){
        try{
            FileReader fileReader = new FileReader("hello.csv");
            fileReader.read();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Low level exception: "+e.getMessage());
            throw new CustomDataException("File Processing failed",e);
        }
    }
}
public class CustomException {
    public static void main(String[] args) {
        try{
            FileService.readFile();
        }catch (Exception e){
            System.out.println("Custom Exception:  "+e.getMessage());
            e.printStackTrace();
        }
    }
}
