package a1125.object;

public class Member {
    private String name;
    private String id;
    private String password;
    private int age;

    public Member(String name, String id, String password, int age) {
        this.name = name;
        this.id = id;
        
    }
}

class Member1{
    Member user1 = new Member("홍길동", "hong", null, 0);
}
