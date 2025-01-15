package a1115;

public class GuguAll {
    public static void main(String[] args) {

        System.out.println();
        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                System.out.print("|  ");
                System.out.print(j+"*"+i+"="+i*j);
                System.out.print("  ");
            }
            System.out.println();
            
        }
    }
}
