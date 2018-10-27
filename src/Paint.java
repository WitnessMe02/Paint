import javax.swing.*;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class Paint extends JFrame {
    private ArrayList<Shape> shapes = new ArrayList<>();
    private JPanel drawPanel = new JPanel();
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

        drawPanel.setBackground(Color.YELLOW);
        //shape menu.
        JToolBar jToolBar = new JToolBar();

        Object[] shapesSelectorList = {"Circle","Square","Rectangle"};
        JComboBox shapeSelector = new JComboBox(shapesSelectorList);
        shapeSelector.addPopupMenuListener(new PopupHandler());

        JButton addButton = new JButton("Add");
        JButton colorButton = new JButton(".");
        colorButton.setForeground(Color.RED);
        colorButton.setPreferredSize(new Dimension(50,20));
        colorButton.setBackground(Color.RED);
        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Color color = JColorChooser.showDialog(Paint.this,"Select a Color",Color.RED);
                colorButton.setBackground(color);
                colorButton.setForeground(color);
            }
        });

        jToolBar.add(shapeSelector);
        jToolBar.add(colorButton);
        jToolBar.add(addButton);
        JMenuBar jMenuBar = new JMenuBar();
        jMenuBar.add(jToolBar);
//        JMenu menu = new JMenu("Shapes");
//        JMenuItem[] shapesMenu = new JMenuItem[4];
//        shapesMenu[0] = new JMenuItem("Circle");
//        shapesMenu[1] = new JMenuItem("Square");
//        shapesMenu[2] = new JMenuItem("Rectangle");
//        shapesMenu[3] = new JMenuItem("Triangle");
//        menu.add(shapesMenu[0]);
//        menu.add(shapesMenu[1]);
//        menu.add(shapesMenu[2]);
//        menu.add(shapesMenu[3]);
//        jMenuBar.add(menu);
        setJMenuBar(jMenuBar);
        add(drawPanel,BorderLayout.CENTER);
        Circle circle = new Circle(100,Color.RED);
        //shapes.add(circle);
        drawPanel.add(circle);
       // repaint();
    }
    public static void main(String args[]){
        Paint paint = new Paint("Paint");
        paint.setVisible(true);
    }

//    @Override
//    public void paint(Graphics graphics) {
//        super.paint(graphics);
//        for(Shape shape : shapes){
//            shape.draw(graphics);
//        }
//    }
    private class PopupHandler implements PopupMenuListener{

        @Override
        public void popupMenuWillBecomeVisible(PopupMenuEvent popupMenuEvent) {
        }

        @Override
        public void popupMenuWillBecomeInvisible(PopupMenuEvent popupMenuEvent) {
            repaint();
        }

        @Override
        public void popupMenuCanceled(PopupMenuEvent popupMenuEvent) {
            repaint();
        }
    }
    private class ShapeSelector implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
        }
    }
}
