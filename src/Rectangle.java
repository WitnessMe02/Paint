import java.awt.*;

class Rectangle {
    private int width,height;
    private int x,y;

    Rectangle(int width,int height){
        this.width = width;
        this.height = height;
//        y = 40;
//        x = 40;
    }

    public void paint(Graphics g){
        g.drawRect(x,y,width,height);
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
