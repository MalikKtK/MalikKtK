package Day3.TrafickLight;

public class run {
    public void go(){
        TrafficLight tl = new TrafficLight(TrafficLightColor.GREEN);
        System.out.println(tl);
        tl.setColor(TrafficLightColor.YELLOW);
        System.out.println(tl);
        tl.setColor(TrafficLightColor.RED);
        System.out.println(tl);
        tl.setColor(TrafficLightColor.GREEN);
        System.out.println(tl);
    }

    public static void main(String[] args) throws Exception {
        new run().go();
    }
}
