package a1127.shape;

public class Circle extends Shape {
    
    double radius;

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public Circle(){
        this(0);
    }
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI * radius * radius;
    }

    @Override
    double round(){
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return "반지름" + radius;
    }
}
