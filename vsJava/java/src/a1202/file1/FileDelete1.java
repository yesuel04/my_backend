package a1202.file1;

import java.io.File;
import java.io.IOException;

public class FileDelete1 {
    public static void main(String[] args) {
        try {
            File file = new File("newfile.txt");
            if(file.createNewFile()){
                System.out.println("파일 생성 : "+file.getName());
            }else{
                System.out.println("파일명이 이미 존재합니다.");
            }

            if (file.delete()) {
                System.out.println("파일이 삭제되었습니다.");
            } else {
                System.out.println("파일이 삭제가 실패되었습니다.");
            }
        } catch (IOException e) {
            System.out.println("예외 발생 : " + e.getMessage());
        }
    }
}
