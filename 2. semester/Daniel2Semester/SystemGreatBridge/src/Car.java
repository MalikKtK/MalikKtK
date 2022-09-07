public class Car {
    private String numberplate;
    private String color;
    private int NumberOfPassengers;
    private int length;

    public Car(String numberplate, String color, int numberOfPassengers, int length) {
        this.numberplate = numberplate;
        this.color = color;
        NumberOfPassengers = numberOfPassengers;
        this.length = length;
    }

    public String getNumberplate() {
        return numberplate;
    }

    public void setNumberplate(String numberplate) {
        this.numberplate = numberplate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return NumberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        NumberOfPassengers = numberOfPassengers;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
