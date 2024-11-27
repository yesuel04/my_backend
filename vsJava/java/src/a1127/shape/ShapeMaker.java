package a1127.shape;

import java.util.Scanner;

public class ShapeMaker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = null;
        double width = 0.0;
        double height = 0.0;
        double radius = 0.0;

        double roundSum = 0.0;
        double areaSum = 0.0;

        Shape[] shapeList = new Shape[3];
        int index = 0;

        while (true) {
            if(index == 3) break;

            System.out.println("1. 삼각형, 2. 사각형, 3. 원형");
            System.out.print(" >> ");
            String Input = sc.next();

            if(Input.equals("그만")) break;

            switch (Input) {
                case "1":
                    System.out.print("밑변 >> ");
                    width = sc.nextDouble();
                    System.out.print("높이 >> ");
                    height = sc.nextDouble();
                    shape = new Triangle(width, height);
                    shapeList[index++] = shape;
                    
                    break;

                case "2":
                    System.out.print("가로 >> ");
                    width = sc.nextDouble();
                    System.out.print("세로 >> ");
                    height = sc.nextDouble();
                    shape = new Rectangle(width, height);
                    shapeList[index++] = shape;

                    break;

                case "3":
                    System.out.print("반지름 >> ");
                    radius = sc.nextDouble();
                    shape = new Circle(radius);
                    shapeList[index++] = shape;

                    break;
            
                default:
                    break;
            }

        }
        
        for(Shape s : shapeList){
            if(s==null) continue;
            if(s instanceof Triangle){
                System.out.println("[삼각형] : ");
            }
            if(s instanceof Rectangle){
                System.out.println("[사각형] : ");
            }
            if(s instanceof Circle){
                System.out.println("[원형] : ");
            }
    
            double area = s.area();
            double round = s.round();
    
            roundSum = roundSum + round;
            areaSum = areaSum + area;
    
            System.out.print("넓이 : " +area + "\t");
            System.out.print("둘레 : " +area + "\t");
            System.out.println();
        }
    }
}
