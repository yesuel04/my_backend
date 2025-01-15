package a1127.shape;

public class Triangle extends Shape{
    double width, height;

    public Triangle() {
    }
    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    double area() {
        return width * height /2;
    }
    @Override
    double round() {
        return width * 3;
    }
    @Override
    public String toString() {
        return "밑변, 높이" + width + ", " + height;
    }
    
}
