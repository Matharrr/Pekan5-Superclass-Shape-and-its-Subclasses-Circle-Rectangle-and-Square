package superclass.shape.and.its.subclasses.circle.rectangle.and.square;

public class Circle extends Shape{
    private double radius;
    
    public Circle(){
        radius = 1.0;
    }
    
    public Circle(double Radius){
        radius = Radius;
    }
    
    public Circle(double Radius, String Color, boolean Filled){
        radius = Radius;
        super.setColor(Color);
        super.setFilled(Filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return 3.14 * radius;
    }
    
    public double getPerimeter(){
        return 2 * 3.14 * radius;
    }
    
    @Override
    public String toString() {
        return "Circle[" + super.toString()+ ",radius=" + radius + ']';
    }
}