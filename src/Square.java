import java.awt.*;

class Square extends TwoDimensionalShape {
    private int side;
    private int x,y;
    private Color color;
    Square(int side, Color color){
        this.side = side;
        this.color = color;
    }
    public void paint(Graphics g){
        g.setColor(color);
        g.fillRect(x,y,side,side);
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

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
