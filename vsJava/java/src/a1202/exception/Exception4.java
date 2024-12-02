package a1202.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception4 {
    public static void main(String[] args) {
        try{
            File file = new File("example.txt");
            FileReader fr = new FileReader(file);
            fr.close();
        }catch(FileNotFoundException e){
            System.out.println("파일을 찾을 수 없습니다. "+ e.getMessage());
        }catch(IOException e){
            System.out.println("파일을 읽는 도중 오류가 발생했습니다. "+ e.getMessage());
        }
    }
}
