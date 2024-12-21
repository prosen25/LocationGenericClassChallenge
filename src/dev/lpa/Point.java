package dev.lpa;

import java.util.Arrays;

public abstract class Point implements Mappable {

    private double[] location = new double[2];

    public Point(String location) {
        this.location = Mappable.stringToLatlon(location);
    }

    private String getLocation() {
        return Arrays.toString(location);
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as POINT (" + getLocation() + ")");
    }
}
