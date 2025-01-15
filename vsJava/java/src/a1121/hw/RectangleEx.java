package a1121.hw;

import java.util.Scanner;

public class RectangleEx {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();

        Scanner scan = new Scanner(System.in);
        System.out.print("가로 길이 : ");
        double width = scan.nextDouble();
        System.out.print("세로 길이 : ");
        double height = scan.nextDouble();

        rec.setDimensions(width);
        rec.getArea(width, height);
        rec.getParameter(width, height);

        System.out.println("사각형의 면적 : " + rec.getArea);
        System.out.println("사각형의 둘레 : " + rec.getParameter);
        System.out.println("정사각형의 면적 : " + rec.getArea);
        System.out.println("정사각형의 둘레 : " + rec.getParameter);
    }
}
