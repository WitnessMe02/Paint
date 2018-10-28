import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class Paint extends JFrame {
    private ArrayList<Shape> shapes = new ArrayList<>();
    private Shape selectedShape;
    private Paint currentFrame;
    private Color selectedColor = Color.RED;
    private JLayeredPane jLayeredPane;

    private Paint(String title) {
        super(title);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(150, 150, 700, 700);
        addMouseListener(new MouseHandler());
        jLayeredPane = getLayeredPane();
        getLayeredPane().setLayout(null);
        currentFrame = this;

        JToolBar createToolbar = new JToolBar("Create a New Object");
        Object[] shapesSelectorList = {"Circle", "Square", "Rectangle"};
        JComboBox shapeSelector = new JComboBox(shapesSelectorList);

        JLabel toolBarLabel = new JLabel("Create New Object: ");
        JButton addButton = new JButton("Add");
        JLabel colorLabel = new JLabel("Color: ");
        JButton colorButton = new JButton("     ");
        colorButton.setForeground(selectedColor);
        colorButton.setPreferredSize(new Dimension(30, 20));
        colorButton.setBackground(selectedColor);
        createToolbar.add(toolBarLabel);
        createToolbar.add(shapeSelector);
        createToolbar.add(colorLabel);
        createToolbar.add(colorButton);
        createToolbar.add(addButton);

        JMenuBar jMenuBar = new JMenuBar();
        jMenuBar.add(createToolbar);
        setJMenuBar(jMenuBar);
        jMenuBar.requestFocus();
        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                selectedColor = JColorChooser.showDialog(Paint.this, "Select a Color", Color.RED);
                if(selectedColor!=null){
                colorButton.setBackground(selectedColor);
                colorButton.setForeground(selectedColor);}
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Shape shape = null;
                switch (shapeSelector.getSelectedItem().toString()) {
                    case "Circle":
                        shape = new Circle(50, 50, 100, selectedColor, currentFrame);
                        break;
                    case "Square":
                        shape = new Square(50, 50, 100, selectedColor, currentFrame);
                        break;
                    case "Rectangle":
                        shape = new Rectangle(50, 50, 200, 100, selectedColor, currentFrame);
                        break;
                    default:
                        System.out.println("No Shape Selected");
                        break;
                }
                shapes.add(shape);
                jLayeredPane.add(shape,0);
            }
        });

        Circle circle = new Circle(50, 50, 100, Color.RED, currentFrame);
        Circle circle1 = new Circle(300, 300, 100, Color.BLACK, currentFrame);
        jLayeredPane.add(circle1,1);
        jLayeredPane.add(circle,0);
       // repaint();
    }

    public static void main(String args[]) {
        Paint paint = new Paint("Paint");
        paint.repaint();

    }

    public Shape getSelectedShape() {
        return selectedShape;
    }
    public ArrayList<Shape> getAllShapes(){
        return shapes;
    }

    public void setSelectedShape(Shape selectedShape) {
        if (this.selectedShape != null) {
            this.selectedShape.setBorder(null);
        }
        this.selectedShape = selectedShape;
        if (selectedShape != null) {
            selectedShape.setBorder(new LineBorder(Color.BLACK, 2));
        }
    }

    private class MouseHandler implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent mouseEvent) {
            setSelectedShape(null);
            requestFocus();
        }

        @Override
        public void mousePressed(MouseEvent mouseEvent) {

        }

        @Override
        public void mouseReleased(MouseEvent mouseEvent) {

        }

        @Override
        public void mouseEntered(MouseEvent mouseEvent) {

        }

        @Override
        public void mouseExited(MouseEvent mouseEvent) {

        }
    }


}
