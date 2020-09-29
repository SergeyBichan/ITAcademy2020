package point;

public class Point {
    private int x;
    private int y;
    public Point(){
        x = 1;
        y = 1;
    }

    public Point(int x1, int x2){
        x = x1;
        y = x2;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
