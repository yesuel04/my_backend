 
package a1125.hak2;

public class Student1 {
    private String name;
    private int studentID;
    private int kor, math, eng;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public int getKor() {
        return kor;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }
    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public int getEng() {
        return eng;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }

    public Student1(String name, int studentID, int kor, int math, int eng) {
        this.name = name;
        this.studentID = studentID;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }
    public Student1() {
               
    }
    public double getAverage() {
        // double avg = (kor + math + eng) /3.0;
        // return avg;
        return (kor + math + eng) /3.0;
    }
                    
    }
                
        class Student {
            public static void main(String[] args) {
            Student1 student1 = new Student1("김바다", 20455698, 90,85,92);
                        
            System.out.println("이름 : " + student1.getName());
            System.out.println("학번 : " + student1.getStudentID());
            System.out.println("국어 : " + student1.getKor());
            System.out.println("수학 : " + student1.getMath());
            System.out.println("영어 : " + student1.getEng());
            System.out.println("평균 : " + student1.getAverage());
            
            Student1 student2 = new Student1();
            student2.setName("강하늘");
            student2.setStudentID(19055637);
            student2.setKor(94);
            student2.setMath(90);
            student2.setEng(91);

        System.out.println("이름 : " + student2.getName());
        System.out.println("학번 : " + student2.getStudentID());
        System.out.println("국어 : " + student2.getKor());
        System.out.println("수학 : " + student2.getMath());
        System.out.println("영어 : " + student2.getEng());
        System.out.println("평균 : " + student2.getAverage());
        
    }
    
}