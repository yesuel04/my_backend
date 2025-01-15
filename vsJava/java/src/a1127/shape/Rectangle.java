package a1127.shape;

public class Rectangle extends Shape{
    double width, height;

    public Rectangle() {
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    double area() {
        return width * height;
    }
    @Override
    double round() {
        return (width * height) * 2;
    }
    @Override
    public String toString() {
        return "가로, 세로" + width + ", " + height;
    }

    
    
}
