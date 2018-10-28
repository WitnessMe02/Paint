import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

abstract class Shape extends JComponent {
    private int screenX = 0;
    private int screenY = 0;
    private int myX = 0;
    private int myY = 0;
    Paint currentFrame;
    Shape currentShape;
    private int myWidth=0;
    private int myHeight=0;

    Shape(Paint currentFrame){
        super();
        currentShape=this;
        this.currentFrame = currentFrame;
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                requestFocusInWindow();
                repaint();
                System.out.println("shape clicked");
                currentFrame.setSelectedShape(currentShape);
                // repaint();
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                requestFocusInWindow();
                currentFrame.setSelectedShape(currentShape);
                screenX = mouseEvent.getXOnScreen();
                screenY = mouseEvent.getYOnScreen();
                myX = getX();
                myY = getY();
                myWidth = getWidth();
                myHeight = getHeight();
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
        });
        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent mouseEvent) {
                int deltaX = mouseEvent.getXOnScreen() - screenX;
                int deltaY = mouseEvent.getYOnScreen() - screenY;
                if(mouseEvent.isControlDown()){
                    changeSize((int) (myWidth+deltaX*0.6), (int) (myHeight+deltaY*0.6));
                }
                else{
                    setLocation(myX+deltaX,myY+deltaY);
                }
            }

            @Override
            public void mouseMoved(MouseEvent mouseEvent) {

            }
        });

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {

            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {
                int keyCode = keyEvent.getKeyCode();
                Shape selectedShape = currentFrame.getSelectedShape();
                if (selectedShape != null) {
                    if (keyEvent.isControlDown()) {
                        switch (keyCode) {
                            case KeyEvent.VK_UP:
                                selectedShape.changeSize(selectedShape.getWidth(), selectedShape.getHeight()+4);
                                selectedShape.setLocation(selectedShape.getX(), selectedShape.getY() - 4);
                                System.out.println("Ctrl+Up clicked");
                                break;
                            case KeyEvent.VK_DOWN:
                                selectedShape.changeSize(selectedShape.getWidth(), selectedShape.getHeight()-4);
                                selectedShape.setLocation(selectedShape.getX(), selectedShape.getY() + 4);
                                System.out.println("CtrlDown clicked");
                                break;
                            case KeyEvent.VK_LEFT:
                                selectedShape.changeSize(selectedShape.getWidth()-4, selectedShape.getHeight());
                                System.out.println("Ctrl+Left clicked");
                                break;
                            case KeyEvent.VK_RIGHT:
                                selectedShape.changeSize(selectedShape.getWidth()+4, selectedShape.getHeight());
                                System.out.println("Ctrl+Right clicked");
                                break;
                            case KeyEvent.VK_EQUALS:
                                selectedShape.changeSize(selectedShape.getWidth() + 2, selectedShape.getHeight() + 2);
                                System.out.println("Plus clicked");
                                break;
                            case KeyEvent.VK_ADD:
                                selectedShape.changeSize(selectedShape.getWidth() + 2, selectedShape.getHeight() + 2);
                                System.out.println("Ctrl+Plus clicked");
                                break;
                            case KeyEvent.VK_MINUS:
                                selectedShape.changeSize(selectedShape.getWidth() - 2, selectedShape.getHeight() - 2);
                                System.out.println("Ctrl+Minus clicked");
                                break;
                            case KeyEvent.VK_SUBTRACT:
                                selectedShape.changeSize(selectedShape.getWidth() - 2, selectedShape.getHeight() - 2);
                                System.out.println("Ctrl+Minus clicked");
                                break;
                        }
                    }
                    else{
                        switch (keyCode) {
                            case KeyEvent.VK_UP:
                                selectedShape.setLocation(selectedShape.getX(), selectedShape.getY() - 2);
                                System.out.println("UP clicked");
                                break;
                            case KeyEvent.VK_DOWN:
                                selectedShape.setLocation(selectedShape.getX(), selectedShape.getY() + 2);
                                System.out.println("Down clicked");
                                break;
                            case KeyEvent.VK_LEFT:
                                selectedShape.setLocation(selectedShape.getX() - 2, selectedShape.getY());
                                System.out.println("Left clicked");
                                break;
                            case KeyEvent.VK_RIGHT:
                                selectedShape.setLocation(selectedShape.getX() + 2, selectedShape.getY());
                                System.out.println("Right clicked");
                                break;
                            case KeyEvent.VK_EQUALS:
                                selectedShape.changeSize(selectedShape.getWidth() + 2, selectedShape.getHeight() + 2);
                                System.out.println("Plus clicked");
                                break;
                            case KeyEvent.VK_ADD:
                                selectedShape.changeSize(selectedShape.getWidth() + 2, selectedShape.getHeight() + 2);
                                System.out.println("Plus clicked");
                                break;
                            case KeyEvent.VK_MINUS:
                                selectedShape.changeSize(selectedShape.getWidth() - 2, selectedShape.getHeight() - 2);
                                System.out.println("Minus clicked");
                                break;
                            case KeyEvent.VK_SUBTRACT:
                                selectedShape.changeSize(selectedShape.getWidth() - 2, selectedShape.getHeight() - 2);
                                System.out.println("Minus clicked");
                                break;
                            case KeyEvent.VK_DELETE:
                                remove(selectedShape);
                                currentFrame.setSelectedShape(null);
                                repaint();
                                System.out.println("Delete clicked");
                                break;
                            case KeyEvent.VK_C:
                                Color color = JColorChooser.showDialog(currentFrame, "Select a Color", selectedShape.getColor());
                                selectedShape.setColor(color);
                                selectedShape.setColor(color);
                        }
                    }



                }
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {

            }
        });



    }
    public abstract void setColor(Color color);
    public abstract  Color getColor();
    public abstract void changeSize(int i, int i1);
}
//class TwoDimensionalShape extends Shape{
//
//}
//class ThreeDimensionalShape extends Shape{
//
//}