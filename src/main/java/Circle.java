public class Circle {
    protected double radius ;
    private String color ;

    public Circle() {
    }

    public Circle(double radius, String color) {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
     @Override
    public String toString(){
        return " A circle with color of " + getColor()
                + " radius:" + getRadius();
    }
}
