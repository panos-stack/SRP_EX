public class Geometricshape {
    private int width;
    private int height;

    public Geometricshape(Shape s){
        width = s.getShapeWidth();
        height = s.getShapeHeight();
    }

    public int getXLowerRightCorner() {
        return width;
    }

    public int getYLowerRightCorner() {
        return height;
    }
}
