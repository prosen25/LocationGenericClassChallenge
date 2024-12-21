package dev.lpa;

public interface Mappable {

    void  render();
    static double[] stringToLatlon(String location) {

        String[] splits = location.split(",");
        double lat = Double.valueOf(splits[0].trim());
        double lon = Double.valueOf(splits[1].trim());
        return new double[] {lat, lon};
    }
}
