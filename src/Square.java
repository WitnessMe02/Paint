import java.awt.*;

class Square extends Shape {
    private int side;
    private int x,y;
    private Color color;
    Square(int x,int y,int side, Color color,Paint currentFrame){
        super(currentFrame);
        this.x=x;
        this.y=y;
        this.side = side;
        this.color = color;
        setBounds(x,y,side,side);
    }
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(color);
        g.fillRect(0,0,side,side);
    }
    @Override
    public void changeSize(int i, int i1) {
        side=i;
        setSize(side,side);
        repaint();
    }
    public Color getColor() {
        return color;
    }
    @Override
    public void setColor(Color color) {
        this.color= color;
        repaint();
    }
}
