package a1202.read1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("c:/abc/out.txt"));
        while (true) {
            String line = br.readLine();
            if(line==null) break;
            System.out.println(line);
        }
    }
}
