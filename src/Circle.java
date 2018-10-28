import java.awt.*;

class Circle extends Shape {
    private int radius;
    private int x,y;

    private Color color;
    Circle(int x, int y, int radius, Color color, Paint currentFrame) {
        super(currentFrame);
        this.color = color;
        this.radius = radius;
        this.x = x;
        this.y = y;
        setBounds(x, y, radius + 1, radius + 1);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(color);
        g.fillOval(0,0,radius,radius);
    }

    @Override
    public void setColor(Color color) {
        this.color= color;
        repaint();
    }

    public Color getColor() {
        return color;
    }
    @Override
    public void changeSize(int i, int i1) {
        radius = i;
        setSize(radius,radius);
        repaint();
    }
}
