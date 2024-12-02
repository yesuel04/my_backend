package a1202.file1;

import java.io.File;

public class DirectoryEx {
    public static void main(String[] args) {
        File directory =  new File("testDir");

        if(directory.mkdir()){
            System.out.println("디렉토리가 생성되었습니다 : "+directory.getName());
        }else{
            System.out.println("디렉토리 생성에 실패했습니다.");
        }

        File dir = new File("."); //현재 작업중인 디렉토리.
        String[] list = dir.list(); //현재 디렉토리에 포함된 폴더 이름을 문자열 배열에 반환.
        if(list != null){
            System.out.println("디렉토리 목록 : ");
            for(String fileName : list){
                System.out.println(fileName);
            }
        }
    }
}
