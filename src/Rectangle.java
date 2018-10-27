import java.awt.*;

class Rectangle extends TwoDimensionalShape {
    private int width,height;
    private int x,y;
    private Color color;

    Rectangle(int width, int height, Color color){
        this.width = width;
        this.height = height;
        y = 100;
        x = 100;
        this.color = color;
    }

    public void paint(Graphics g){
        g.setColor(color);
        g.fillRect(x,y,width,height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}
