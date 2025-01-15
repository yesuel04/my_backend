package a1127.shape;

public class Point {
    int x;
    int y;

    //기본생성자
    public Point() {
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point x="+x+", y="+y;
    }

}
