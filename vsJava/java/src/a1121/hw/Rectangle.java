package a1121.hw;

public class Rectangle {
    public double setDimensions;
    public double getArea;
    public double getParameter;

    public double setDimensions(double width) {
        int height = 0;
        width = height;
        setDimensions = width * height;
        return setDimensions;
    }

    public double getArea(double width, double height) {
        getArea = width * height;
        return getArea;
    }

    public double getParameter(double width, double height) {
        getParameter = (2 * width + 2 * height);
        return getParameter;
    }
    
}
