package a1210;

import java.util.Scanner;

public class Casting1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("넓이 계산을 원하는 도형 유형을 선택해주세요.");
        System.out.println("1.원형 \t 2.사각형 \t 3.삼각형");
        System.out.print(" >> ");
        int shape = scan.nextInt();
        Shape shapeObject = new Shape("");
        double area = 0;

        switch (shape) {
            case 1:
                System.out.println("반지름을 입력하세요.");
                double radius = scan.nextDouble();
                area = shapeObject.calculateArea(radius);
                break;
            case 2:
                System.out.println("가로와 세로를 입력하세요.");
                double width = scan.nextDouble();
                double height = scan.nextDouble();
                area = shapeObject.calculateArea(width,height);
                break;
            case 3:
                System.out.println("밑변과 높이를 입력하세요.");
                double base = scan.nextDouble();
                double triHeight = scan.nextDouble();
                area = shapeObject.calculateArea(base,triHeight, true);
                break;
        
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
        System.out.println(shapeObject.getRender() + "의 넓이 : " + area);
    }
}

class Shape{
    private String render;

    public String getRender() {
        return render;
    }

    public Shape(String render){
        this.render = render;
    }

    //원형 넓이 계산
    public double calculateArea(double radius){
        this.render = "circle";
        return Math.PI * Math.pow(radius,2);
    }
    //사각형 넓이 계산
    public double calculateArea(double width, double height){
        this.render = "rectangle";
        return width * height;
    }
    //삼각형 넓이 계산
    public double calculateArea(double base, double triHeight, boolean isTriangle){
        if (isTriangle) {
            this.render = "triangle";
            return 0.5 * base * triHeight;
        }
        return 0;
    }
}
