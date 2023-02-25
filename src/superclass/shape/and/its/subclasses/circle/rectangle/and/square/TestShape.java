package superclass.shape.and.its.subclasses.circle.rectangle.and.square;

public class TestShape {

    public static void main(String[] args) {
        Circle testCircle = new Circle(6.17);
        System.out.println("Circle:"
            + " \ncolor= " + testCircle.getColor()
            + " \nbase area= " + testCircle.getArea()
            + " \nradius= " + testCircle.getRadius()
            + " \nperimeter= " + testCircle.getPerimeter());

        Rectangle testRectangle = new Rectangle();
        System.out.println("Rectangle:"
            + " \ncolor= " + testRectangle.getColor()
            + " \nbase area =" + testRectangle.getArea()
            + " \nlenght= " + testRectangle.getLength()
            + " \nwidth= " + testRectangle.getWidth()
            + " \nperimeter= " + testRectangle.getPerimeter());
        
        Square testSquare = new Square(4);
        System.out.println("Square:"
            + " \ncolor= " + testSquare.getColor()
            + " \nbase area= " + testSquare.getArea()
            + " \nlenght= " + testSquare.getLength()
            + " \nwidth= " + testSquare.getWidth()
            + " \nperimeter= " + testSquare.getPerimeter());
    }
    
}