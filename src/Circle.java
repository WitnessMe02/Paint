import java.awt.*;

class Circle {
    private int radius;
    private int x,y;
    Circle(int radius){
        this.radius = radius;
    }
    public void paint(Graphics g){
        g.drawOval(40,40,radius,radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
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
}
