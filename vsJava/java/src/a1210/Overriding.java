package a1210;

import java.util.Scanner;

public class Overriding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("넓이 계산을 원하는 도형 유형을 선택해주세요.");
        System.out.println("1.원형 \t 2.사각형 \t 3.삼각형");
        System.out.print(" >> ");
        int shape = scan.nextInt();
        Shape shapeObject = null;

        switch (shape) {
            case 1:
                System.out.println("반지름을 입력하세요.");
                double radius = scan.nextDouble();
                shapeObject = new Circle(radius);
                break;
            case 2:
                System.out.println("가로와 세로를 입력하세요.");
                double width = scan.nextDouble();
                double height = scan.nextDouble();
                shapeObject = new Rectangle(width,height);
                break;
            case 3:
                System.out.println("밑변과 높이를 입력하세요.");
                double base = scan.nextDouble();
                double triHeight = scan.nextDouble();
                shapeObject = new Triangle(base,triHeight);
                break;
        
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
        double area = shapeObject.calculateArea();
        System.out.println(shapeObject.render + "의 넓이 : " + area);
    }
}

abstract class Shape {
    String render;
    public abstract double calculateArea();
}
class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.render = "circle";
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

}
class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

}
class Triangle extends Shape{
    private double base;
    private double triHeight;

    public Triangle(double base, double triHeight) {
        this.base = base;
        this.triHeight = triHeight;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * triHeight;
    }

}
