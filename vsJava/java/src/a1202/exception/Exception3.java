package a1202.exception;

public class Exception3 {
    public static void main(String[] args) {
        String str = "abc";

        try{
            int number = Integer.parseInt(str);
        }catch(NumberFormatException e){
            System.out.println("숫자의 형식이 올바르지 않아요. "+ e.getMessage());
        }
    }
}
