import java.awt.*;

class Square {
    private int side;
    private int x,y;
    Square(int side){
        this.side = side;
    }
    public void paint(Graphics g){
        g.drawRect(x,y,side,side);
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
