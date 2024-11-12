package a1112;

public class FloatDouble {
    public static void main(String[] args) {
        float a = 0.1234567890123456789f;
        double b = 0.1234567890123456789;
        System.out.println("a : "+ a);
        System.out.println("b : "+ b);
        // a : 0.12345679
        // b : 0.12345678901234568

        double c = 3e6;
        float d = 3e6F;
        double e = 2e-3;
        System.out.println("c : "+c);
        System.out.println("d : "+d);
        System.out.println("e : "+e);
    }
    
}