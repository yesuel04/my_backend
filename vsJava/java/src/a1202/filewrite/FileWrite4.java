package a1202.filewrite;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite4 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("c:/abc/out2.txt");
        for(int i=1; i<11 ; i++){
            String data = i + " 번째 줄입니다.\r\n";
            pw.println(data);
        }
        pw.close();
        
    }
}