import javafx.scene.paint.Color;

public class Car {

    private Color color;
    private int wheels;
    private int doors;

    public Car(Color color, int wheels, int doors) {
        this.color = color;
        this.wheels = wheels;
        this.doors = doors;
    }

    public Car() {
        this(Color.RED, 3, 1);
    }

    public String toString() {
        return "A " + color + " car with " + wheels + " wheels and " + doors + " door";
    }

    public javafx.scene.paint.Paint getColor() {
        return color;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }
}
