package Srpsolve_A;
import javax.swing.*;
import java.awt.*;

public class Shape extends JComponent {

    private int xUpperLeftCorner = 0;
    private int yUpperLeftCorner = 0;
    private int width = 200;
    private int height = 100;
    private Rectangle rect;

    public Shape(){}

    public Shape(int x, int y, int w, int h, Rectangle r){
        this.xUpperLeftCorner = x;
        this.yUpperLeftCorner = y;
        this.width = w;
        this.height = h;
        this.rect = r;
    }

    public Rectangle getDimentions(){
        return new Rectangle(xUpperLeftCorner, yUpperLeftCorner, width, height);
    }

    public void draw() {
        rect = new Rectangle(xUpperLeftCorner, yUpperLeftCorner, width, height);
        this.repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.draw(rect);
    }
}