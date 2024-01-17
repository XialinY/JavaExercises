package at.technikum.OOPexercises;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calcArea(){
        return (this.radius * this.radius * Math.PI);
    }

    public double calcCircumference(){
        return (2 * this.radius * Math.PI);
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
