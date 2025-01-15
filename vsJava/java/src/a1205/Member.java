package a1205;

public class Member {
    public static int Male = 0;
    public static int Female = 0;
    
    private String name;
    private int gender;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGender() {
        return gender;
    }
    public void setGender(int gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public Member(String name, int gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

}
