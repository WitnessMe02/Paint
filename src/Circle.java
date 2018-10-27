import javax.swing.*;
import java.awt.*;

class Circle extends JComponent {
    private int radius;
    private int x,y;
    private Color color;
    Circle(int radius, Color color){
        this.color = color;
        this.radius = radius;
        x=100;
        y=100;
        setBounds(x,y,radius,radius);
        setBackground(Color.BLACK);
        setForeground(Color.RED);
        setVisible(true);
    }
//    public void draw(Graphics g){
//        g.setColor(color);
//        g.fillOval(x,y,radius,radius);
//    }

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
