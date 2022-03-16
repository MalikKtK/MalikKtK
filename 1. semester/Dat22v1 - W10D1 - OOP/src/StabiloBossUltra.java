public class StabiloBossUltra {
    void go() {
        StabiloBoss marker = new StabiloBoss();
        StabiloBoss marker2 = new StabiloBoss();
        //Konstruktør

        StabiloBoss constMarker = new StabiloBoss();

        marker.color = "Dove blue";
        marker.thickness = 34;
        marker2.color = "Sun Yellow";
        System.out.println(marker.color +
                "\n" +
                marker.thickness +
                "\n" +
                "Marker 2: " +
                "\n" +
                marker2.color);

        marker.writeText("My cool text");
        marker2.writeText("");
    }

    public static void main(String[] args) {
        new StabiloBossUltra().go();
    }
}
