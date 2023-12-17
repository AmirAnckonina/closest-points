package closestPoints.impl;

import closestPoints.api.DistanceCalculator;

public class TwoDimensionalDistanceCalculator implements DistanceCalculator {
    @Override
    public <T extends Number> Double calculateDistance(T[] point, T[] target) {

        if (point.length != 2 || target.length != 2) {
            throw new IllegalArgumentException("Point and target must be two dimensional");
        }

        double distanceBetweenX = point[0].doubleValue() - target[0].doubleValue();
        double distanceBetweenY = point[1].doubleValue() - target[1].doubleValue();

        return Math.sqrt(Math.pow(distanceBetweenX, 2) + Math.pow(distanceBetweenY, 2));
    }
}
