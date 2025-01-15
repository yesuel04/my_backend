package a1112;

public class Boolean1 {
    public static void main(String[] args) {
        boolean stop = true;
        if(stop){
            System.out.println("중지합니다.");
        }else{
            System.out.println("시작합니다.");
        }
        int x = 10;
        boolean re1 = (x==20);
        boolean re2 = (x!=20);
        System.out.println("re1 : " + re1);
        System.out.println("re2 : " + re2);
    }
}