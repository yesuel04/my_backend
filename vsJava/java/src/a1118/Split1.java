package a1118;

public class Split1 {
    public static void main(String[] args) {
        String board = "1,자바학습,참조타입 String을 학습합니다.,홍길동";
        String[] tokens = board.split(",");
        System.out.println("번호 : " + tokens[0]);
        System.out.println("번호 : " + tokens[1]);
        System.out.println("번호 : " + tokens[2]);
        System.out.println("번호 : " + tokens[3]);
        System.out.println();
        for(int i = 0; i<tokens.length; i++){
            System.out.println(tokens[i]);
        }
    }
}
