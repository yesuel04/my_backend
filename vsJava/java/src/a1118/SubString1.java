package a1118;

public class SubString1 {
    public static void main(String[] args) {
        String ssn1 = "880815-1234567";
        String firstNum = ssn1.substring(0,6);
        System.out.println(firstNum);
        String secondNum = ssn1.substring(7);
        System.out.println(secondNum);
    }
}
