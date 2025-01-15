package a1128.sort;

public class Compare1 {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "apple";

        System.out.println(str1.compareTo(str2)); // -1
        // 알파벳 a는 아스키코드(97) b는 (98)
        System.out.println(str1.compareTo(str3)); // 0
        System.out.println(str2.compareTo(str1)); // 1
    }
}
