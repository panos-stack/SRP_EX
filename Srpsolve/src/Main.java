import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Shape myShape = new Shape();
        Geometricshape gShape = new Geometricshape(myShape);

        JFrame f = new JFrame();
        f.setSize(600, 600);
        f.setContentPane(myShape);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //APPLICATION 1
        myShape.draw();
        f.setVisible(true);

        //APPLICATION 2
        System.out.println("Lower Right Corner. X: " + gShape.getXLowerRightCorner()
                + " Y: " + gShape.getYLowerRightCorner());

    }
}
