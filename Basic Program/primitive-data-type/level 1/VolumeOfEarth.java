public class VolumeOfEarth {
    public static void main(String[] args) {
        double radius = 6378;
        double pi = Math.PI;

        double volumeKm = (4.0 / 3.0) * pi * radius * radius * radius;
        double volumeMiles = volumeKm / (1.6 * 1.6 * 1.6);

        System.out.println(
            "The volume of earth in cubic kilometers is " + volumeKm +
            " and cubic miles is " + volumeMiles
        );
    }
}
