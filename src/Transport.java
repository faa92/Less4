public class Transport {

    public float speed;
    public int weight;
    public String color;
    public byte[] coordinate;

    public  void setValeues (float speed, int weight, String color, byte[] coordinate) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }
    public String getValues() {
        String info = "Object speed: " + speed + ". Weight: " + weight + ". Color: " + color + ".\n";
        String infoCoordinates = "Coordinates:\n";

        for (int i = 0; i < coordinate.length; i++) {
        infoCoordinates += coordinate [i] + "\n";

        }
        return info + infoCoordinates ;
    }

}
