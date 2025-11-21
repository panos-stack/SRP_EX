package Srpsolve_A;

public class Geometricshape {
    private final Shape s;

    public Geometricshape(Shape s1){
        s = s1;
    }

    public int getXLowerRightCorner() {
        return s.getDimentions().width;
    }

    public int getYLowerRightCorner() {
        return s.getDimentions().height;
    }
}