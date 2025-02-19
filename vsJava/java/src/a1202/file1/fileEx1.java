package a1202.file1;

import java.io.File;

public class fileEx1 {
    public static void main(String[] args) {
        //File 객체 생성.
        File file = new File("c:\\abc\\out1.txt");

        //파일 정보 출력
        if(file.exists()){
            System.out.println("파일 이름 : " + file.getName());
            System.out.println("파일 경로 : " + file.getPath());
            System.out.println("파일 크기 : " + file.length()+" 바이트");
            System.out.println("읽기 가능 : " + file.canRead());
            System.out.println("쓰기 가능 : " + file.canWrite());
        }else{
            System.out.println("파일이 존재하지 않습니다.");
        }
    }
}
