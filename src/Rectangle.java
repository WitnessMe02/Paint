import java.awt.*;

class Rectangle extends Shape {
    private int width, height;
    private int x, y;
    private Color color;

    Rectangle(int x, int y, int width, int height, Color color,Paint currentFrame) {
        super(currentFrame);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        setBounds(x, y, width, height);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(color);
        g.fillRect(0,0,width,height);
    }

    @Override
    public void changeSize(int i, int i1) {
        width = i;
        height = i1;
        setSize(width,height);
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

