package a1114;

public class Switch1 {
    public static void main(String[] args) {
        // double num = Math.random();
        int num = (int)(Math.random()*4) + 8;
        System.out.println(num);
        switch(num){
            case 8:
                System.out.println("8번");
                break;
            case 9:
                System.out.println("9번");
                break;
            case 10:
                System.out.println("10번");
                break;
            case 11:
                System.out.println("11번");
                break;
            // default :
            //     System.out.println("none");
        }
    }
}
