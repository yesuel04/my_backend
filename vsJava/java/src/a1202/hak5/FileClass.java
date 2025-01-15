package a1202.hak5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileClass {
    private File file;
    private String dir; // 디렉토리, 폴더
    private String fileName; // 파일명 저장

    public FileClass(){
        file = new File("c:\\");
    }
    public FileClass(String dir, String fileName){
        file = new File("c:\\"+dir+"\\"+fileName+".txt");
        this.dir = "c:\\"+dir;
        this.fileName = fileName + ".txt";
        //디렉토리 경로와 파일 이름을 받아서 파일 객체를 초기화 합니다.
        //디렉토리가 없는 경우 디레토리도 생성합니다.
        //file = c:\\student\\student_Grade.txt
        //dir =c:\\student
        //fileName = student_Grade.txt
    }

    private boolean check(File file){
        if(file.exists()){
            return true;
        }
        return false;
    }

    public void create() throws Exception{
        boolean exist = check(file);
        if(exist){
            file.delete();
            file.createNewFile();
        }else{
            file = new File(dir);
            file.mkdir();
            file = new File(dir+"\\"+fileName);
            file.createNewFile();  //새로운 파일을 생성
        }
    }

    public void write(String str) throws Exception {
       FileWriter fw = new FileWriter(file); //파일 쓰기를 위한 FileWriter생성(쓰기작업생성)
       PrintWriter pw = new PrintWriter(fw); //파일에 데이터를 출력하기 위해 편리한 메서드(println, printf)
       pw.println(str);
       fw.close();
    }

    public void read() throws Exception{
        boolean exist = check(file);
        if(exist){
            FileReader fr = new FileReader(file);
            BufferedReader bw = new BufferedReader(fr);
            String str;
            while ((str = bw.readLine()) != null) {
                System.out.println(str);
            }
            bw.close();
        }else{
            System.out.println("읽을 파일이 없습니다.");
            System.out.println();
        }
    }
}
