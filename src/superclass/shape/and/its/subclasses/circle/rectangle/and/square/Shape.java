package superclass.shape.and.its.subclasses.circle.rectangle.and.square;

public class Shape {
    private String color;
    private boolean filled;
    
    public Shape(){
        color = "green";
        filled = true;
    }
    
    public Shape(String Color, boolean Filled){
        color = Color;
        filled = Filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    @Override
    public String toString(){
        return "Shape[color = " + getColor() + ", " + "filled" + isFilled() + "]";
    }
}