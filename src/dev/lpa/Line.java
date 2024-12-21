package dev.lpa;

import java.util.Arrays;

public abstract class Line implements Mappable {

    private double[][] locations;

    public Line (String... locations) {
        this.locations = new double[locations.length][];
        int index = 0;
        for (String location : locations) {
            this.locations[index] = Mappable.stringToLatlon(location);
            index++;
        }
    }

    private String getLocations() {
        return Arrays.deepToString(locations);
    }

    @Override
    public void render() {
        System.out.println("Render " + this + "as LINE (" + getLocations() + ")");
    }
}
