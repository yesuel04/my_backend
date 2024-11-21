package a1121.methodOverloading;

public class Calculator {

    public int add(int i, int j) {
        // int add = i + j;
        return i + j;
    }

    public int add(int i, int j, int k) {
        // int add = i + j + k;
        return i + j + k;
    }

    public double add(double d, double e) {
        // double add = d + e;
        return d + e;
    }
    
}
