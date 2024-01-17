package at.technikum.OOPexercises;

public class Rectangle {
    private double seiteA;
    private double seiteB;

    public Rectangle(double seiteA, double seiteB) {
        this.seiteA = seiteA;
        this.seiteB = seiteB;
    }

    public double calcArea(){
        return this.seiteA * this.seiteB;
    }
    public double calcCircumference() {
        return (2 * this.seiteA + 2 * this.seiteB);
    }
    public void setSeiteA(double seiteA) {
        this.seiteA = seiteA;
    }

    public double getSeiteA() {
        return seiteA;
    }

    public void setSeiteB(double seiteB) {
        this.seiteB = seiteB;
    }

    public double getSeiteB() {
        return seiteB;
    }
}
