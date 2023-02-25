package superclass.shape.and.its.subclasses.circle.rectangle.and.square;

public class Rectangle extends Shape{
    private double width;
    private double length;
    
    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }
    
    public Rectangle(double Width, double Length){
        width = Width;
        length = Length;
    }
    
    public Rectangle(double Width, double Length, String Color, boolean Filled){
        width = Width;
        length = Length;
        super.setColor(Color);
        super.setFilled(Filled);        
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea(){
        return width*length;
    }
    
    public double getPerimeter(){
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString()+ "width=" + width + ", length=" + length + ']';
    }
}