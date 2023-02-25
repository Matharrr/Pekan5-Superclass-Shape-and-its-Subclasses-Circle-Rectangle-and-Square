package superclass.shape.and.its.subclasses.circle.rectangle.and.square;

public class Square extends Rectangle{
    private double side;
    
    public Square(double side){
        super(side, side);
    }
    
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    @Override
    public void setWidth(double Side){
        super.setWidth(Side);
    }
    
    @Override
    public void setLength(double Side){
        super.setLength(Side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() +"side=" + side + ']';
    }
}