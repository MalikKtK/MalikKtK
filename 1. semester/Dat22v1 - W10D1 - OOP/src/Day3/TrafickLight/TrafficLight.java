package Day3.TrafickLight;

public class TrafficLight {
    private TrafficLightColor color;

    TrafficLight(TrafficLightColor color) {
        setColor(color);
    }
    void setColor (TrafficLightColor color) {
        this.color = color;
    }
    TrafficLightColor getColor(){
        return color;
    }

    @Override
    public String toString() {
        return "TrafficLight{" +
                "color=" + color +
                '}';
    }
}
