package at.technikum.OOPexercises;

public class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }
    public void changeColor(String color) {
        this.color = color;
    }
    public boolean isRed() {
        return color.equals("red");
    }
    public boolean isGreen() {
        return color.equals("green");
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "\nTrafficLight:" +
                "\ncolor: " + color +
                "\nduration: " + duration;
    }
}
