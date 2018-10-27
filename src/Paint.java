import javax.swing.*;
import java.awt.*;

class Paint extends JFrame {
//    public void paint(Graphics g) {
//        g.drawString("Hello",40,40);
//        setBackground(Color.WHITE);
//        g.fillRect(130, 30,100, 80);
//        g.drawOval(30,130,50, 60);
//        setForeground(Color.RED);
//        g.fillOval(130,130,50, 60);
//        g.drawArc(30, 200, 40,50,90,60);
//        g.fillArc(30, 130, 40,50,180,40);
//
//    }
    private Paint(String title){
        super(title);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //shape menu.
        JMenuBar jMenuBar = new JMenuBar();
        JMenu menu = new JMenu("Shapes");
        JMenuItem[] shapesMenu = new JMenuItem[4];
        shapesMenu[0] = new JMenuItem("Circle");
        shapesMenu[1] = new JMenuItem("Square");
        shapesMenu[2] = new JMenuItem("Rectangle");
        shapesMenu[3] = new JMenuItem("Triangle");
        menu.add(shapesMenu[0]);
        menu.add(shapesMenu[1]);
        menu.add(shapesMenu[2]);
        menu.add(shapesMenu[3]);
        jMenuBar.add(menu);
        setJMenuBar(jMenuBar);


    }
    public static void main(String args[]){
        Paint paint = new Paint("Paint");
        paint.setVisible(true);
    }
}
