package a1118;

public class String1 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello22";
        String c = "Hello22";

        String d = new String("Hello");
        String e = new String("Hello22");
        String f = new String("Hello22");

        System.out.println(a==c);
        System.out.println(a==d);
        System.out.println(a.equals(d));

        System.out.println(e==c);
        System.out.println(e.equals(f));
        System.out.println(b.equals(e));

    }
}
