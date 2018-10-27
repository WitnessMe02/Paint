import javax.swing.*;
import java.awt.*;

abstract class Shape extends JComponent {
    public abstract void draw(Graphics g);
}
class TwoDimensionalShape extends Shape{


    @Override
    public void draw(Graphics g) {

    }
}
class ThreeDimensionalShape extends Shape{

    @Override
    public void draw(Graphics g) {

    }
}